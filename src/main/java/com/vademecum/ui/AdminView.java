package com.vademecum.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vademecum.model.Medicamento;
import com.vademecum.service.BuscadorService;
import jakarta.annotation.security.RolesAllowed;

import java.util.List;
import java.util.stream.Collectors;

@Route("admin")
@PageTitle("Panel de Administración · Vademécum")
@RolesAllowed({"ADMIN", "ROLE_ADMIN"})
public class AdminView extends VerticalLayout {

    private final BuscadorService servicio;
    private Grid<Medicamento> grid;
    private TextField buscador;
    private List<Medicamento> todosLosMedicamentos;

    public AdminView(BuscadorService servicio) {
        this.servicio = servicio;
        setSizeFull();
        setSpacing(false);
        setPadding(false);
        getStyle().set("background", "#FAF7EF")
                .set("font-family", "Georgia, 'Times New Roman', serif");

        add(buildHeader(), buildToolbar(), buildGrid());
        cargarMedicamentos();
    }

    private HorizontalLayout buildHeader() {
        HorizontalLayout header = new HorizontalLayout();
        header.setWidthFull();
        header.setAlignItems(Alignment.CENTER);
        header.setJustifyContentMode(JustifyContentMode.BETWEEN);
        header.getStyle()
                .set("background", "#2D4A2B")
                .set("padding", "18px 28px")
                .set("color", "white");

        HorizontalLayout titleSection = new HorizontalLayout();
        titleSection.setAlignItems(Alignment.CENTER);
        titleSection.setSpacing(true);

        Icon icon = VaadinIcon.COGS.create();
        icon.setColor("#A27C40");
        icon.setSize("24px");

        H2 title = new H2("Panel de Administración");
        title.getStyle()
                .set("color", "white")
                .set("margin", "0")
                .set("font-size", "22px");

        titleSection.add(icon, title);

        Button btnVolver = new Button("← Volver al Vademécum", e ->
                UI.getCurrent().navigate(MainView.class));
        btnVolver.getStyle()
                .set("background", "rgba(255,255,255,0.15)")
                .set("color", "white")
                .set("border", "1px solid rgba(255,255,255,0.3)")
                .set("border-radius", "6px");

        header.add(titleSection, btnVolver);
        return header;
    }

    private HorizontalLayout buildToolbar() {
        HorizontalLayout toolbar = new HorizontalLayout();
        toolbar.setWidthFull();
        toolbar.setAlignItems(Alignment.CENTER);
        toolbar.getStyle()
                .set("padding", "16px 28px")
                .set("background", "#FFFDF8")
                .set("border-bottom", "1px solid #CDC4A8");

        buscador = new TextField();
        buscador.setPlaceholder("🔍  Buscar por nombre o principio activo...");
        buscador.setWidth("400px");
        buscador.setClearButtonVisible(true);
        buscador.addValueChangeListener(e -> filtrar(e.getValue()));

        Span contador = new Span();
        contador.setId("admin-contador");
        contador.getStyle()
                .set("color", "#504830")
                .set("font-size", "13px")
                .set("margin-left", "20px");

        toolbar.add(buscador, contador);
        return toolbar;
    }

    private Grid<Medicamento> buildGrid() {
        grid = new Grid<>(Medicamento.class, false);
        grid.setSizeFull();
        grid.getStyle().set("background", "#FAF7EF");

        grid.addColumn(Medicamento::getId)
                .setHeader("ID")
                .setWidth("80px")
                .setFlexGrow(0);

        grid.addColumn(Medicamento::getNombreComercial)
                .setHeader("Nombre Comercial")
                .setAutoWidth(true)
                .setFlexGrow(1);

        grid.addColumn(Medicamento::getPrincipioActivo)
                .setHeader("Principio Activo")
                .setAutoWidth(true)
                .setFlexGrow(1);

        grid.addColumn(Medicamento::getConcentracion)
                .setHeader("Concentración")
                .setWidth("200px")
                .setFlexGrow(0);

        grid.addColumn(Medicamento::getCategoria)
                .setHeader("Categoría")
                .setAutoWidth(true)
                .setFlexGrow(1);

        grid.addComponentColumn(med -> {
            Button btnEditar = new Button("✏️ Editar");
            btnEditar.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_SMALL);
            btnEditar.getStyle()
                    .set("background", "#2D4A2B")
                    .set("color", "white")
                    .set("border-radius", "4px");
            btnEditar.addClickListener(e ->
                    UI.getCurrent().navigate(MedicamentoFormView.class, med.getId()));
            return btnEditar;
        }).setHeader("Acciones").setWidth("120px").setFlexGrow(0);

        return grid;
    }

    private void cargarMedicamentos() {
        todosLosMedicamentos = servicio.getTodos();
        actualizarGrid(todosLosMedicamentos);
    }

    private void filtrar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            actualizarGrid(todosLosMedicamentos);
            return;
        }
        String txt = texto.trim().toLowerCase();
        List<Medicamento> filtrados = todosLosMedicamentos.stream()
                .filter(m -> (m.getNombreComercial() != null && m.getNombreComercial().toLowerCase().contains(txt))
                        || (m.getPrincipioActivo() != null && m.getPrincipioActivo().toLowerCase().contains(txt)))
                .collect(Collectors.toList());
        actualizarGrid(filtrados);
    }

    private void actualizarGrid(List<Medicamento> medicamentos) {
        grid.setItems(medicamentos);
        Span contador = (Span) UI.getCurrent().getElement()
                .getChild(0).getChild(1).getChild(1).getComponent().orElse(null);
        if (contador != null) {
            contador.setText(medicamentos.size() + " medicamento(s)");
        }
    }
}