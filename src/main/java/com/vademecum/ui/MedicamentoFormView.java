package com.vademecum.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vademecum.model.Medicamento;
import com.vademecum.repository.MedicamentoRepository;
import jakarta.annotation.security.RolesAllowed;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Route("admin/editar")
@PageTitle("Editar Medicamento · Vademécum")
@PermitAll
public class MedicamentoFormView extends VerticalLayout implements HasUrlParameter<String> {

    private final MedicamentoRepository repository;
    private Medicamento medicamento;

    // Campos del formulario
    private TextField txtNombre;
    private TextField txtPrincipioActivo;
    private TextField txtConcentracion;
    private TextField txtFormaFarmaceutica;
    private TextField txtCategoria;
    private TextArea txtPatologias;
    private TextArea txtMecanismo;
    private TextArea txtIndicaciones;
    private TextArea txtDosis;

    public MedicamentoFormView(MedicamentoRepository repository) {
        this.repository = repository;
        setSizeFull();
        setSpacing(false);
        setPadding(false);
        getStyle().set("background", "#FAF7EF")
                .set("font-family", "Georgia, 'Times New Roman', serif");
    }

    @Override
    public void setParameter(BeforeEvent event, String id) {
        Optional<Medicamento> opt = repository.findById(id);
        if (opt.isEmpty()) {
            Notification.show("Medicamento no encontrado", 3000, Notification.Position.MIDDLE)
                    .addThemeVariants(NotificationVariant.LUMO_ERROR);
            UI.getCurrent().navigate(AdminView.class);
            return;
        }
        this.medicamento = opt.get();
        construirVista();
    }

    private void construirVista() {
        removeAll();
        add(buildHeader(), buildFormulario());
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

        H2 title = new H2("Editar: " + medicamento.getNombreComercial());
        title.getStyle()
                .set("color", "white")
                .set("margin", "0")
                .set("font-size", "20px");

        Button btnVolver = new Button("← Volver al listado", e ->
                UI.getCurrent().navigate(AdminView.class));
        btnVolver.getStyle()
                .set("background", "rgba(255,255,255,0.15)")
                .set("color", "white")
                .set("border", "1px solid rgba(255,255,255,0.3)")
                .set("border-radius", "6px");

        header.add(title, btnVolver);
        return header;
    }

    private VerticalLayout buildFormulario() {
        VerticalLayout form = new VerticalLayout();
        form.setWidthFull();
        form.setSpacing(true);
        form.getStyle()
                .set("padding", "28px")
                .set("max-width", "900px")
                .set("margin", "0 auto");

        // Campos
        txtNombre = crearCampoTexto("Nombre Comercial *", medicamento.getNombreComercial());
        txtPrincipioActivo = crearCampoTexto("Principio Activo", medicamento.getPrincipioActivo());
        txtConcentracion = crearCampoTexto("Concentración", medicamento.getConcentracion());
        txtFormaFarmaceutica = crearCampoTexto("Forma Farmacéutica", medicamento.getFormaFarmaceutica());
        txtCategoria = crearCampoTexto("Categoría", medicamento.getCategoria());

        String patologias = medicamento.getPatologias() == null ? "" :
                String.join(", ", medicamento.getPatologias());
        txtPatologias = crearTextArea("Patologías (separadas por coma)", patologias);

        txtMecanismo = crearTextArea("Mecanismo de Acción", medicamento.getMecanismoAccion());
        txtIndicaciones = crearTextArea("Indicaciones Clínicas", medicamento.getIndicaciones());
        txtDosis = crearTextArea("Diluciones / Dosis", medicamento.getDosis());

        // Botones
        HorizontalLayout botones = new HorizontalLayout();
        botones.setSpacing(true);
        botones.getStyle().set("margin-top", "16px");

        Button btnGuardar = new Button("💾  Guardar Cambios");
        btnGuardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        btnGuardar.getStyle()
                .set("background", "#2D4A2B")
                .set("color", "white")
                .set("padding", "10px 24px")
                .set("border-radius", "6px")
                .set("font-size", "14px");
        btnGuardar.addClickListener(e -> guardar());

        Button btnCancelar = new Button("Cancelar", e ->
                UI.getCurrent().navigate(AdminView.class));
        btnCancelar.getStyle()
                .set("background", "#EDE8DC")
                .set("color", "#504830")
                .set("padding", "10px 24px")
                .set("border-radius", "6px");

        botones.add(btnGuardar, btnCancelar);

        form.add(
                seccionTitulo("📋  Información Básica"),
                txtNombre, txtPrincipioActivo, txtConcentracion, txtFormaFarmaceutica, txtCategoria,
                seccionTitulo("🌿  Información Clínica"),
                txtPatologias, txtMecanismo, txtIndicaciones, txtDosis,
                botones
        );
        return form;
    }

    private TextField crearCampoTexto(String label, String valor) {
        TextField campo = new TextField(label);
        campo.setValue(valor == null ? "" : valor);
        campo.setWidthFull();
        return campo;
    }

    private TextArea crearTextArea(String label, String valor) {
        TextArea area = new TextArea(label);
        area.setValue(valor == null ? "" : valor);
        area.setWidthFull();
        area.setMinHeight("100px");
        return area;
    }

    private Span seccionTitulo(String texto) {
        Span span = new Span(texto);
        span.getStyle()
                .set("font-size", "16px")
                .set("font-weight", "bold")
                .set("color", "#2D4A2B")
                .set("margin-top", "12px")
                .set("padding-bottom", "6px")
                .set("border-bottom", "2px solid #A27C40")
                .set("display", "block");
        return span;
    }

    private void guardar() {
        if (txtNombre.getValue() == null || txtNombre.getValue().trim().isEmpty()) {
            Notification.show("El nombre comercial es obligatorio", 3000, Notification.Position.MIDDLE)
                    .addThemeVariants(NotificationVariant.LUMO_ERROR);
            return;
        }

        medicamento.setNombreComercial(txtNombre.getValue());
        medicamento.setPrincipioActivo(txtPrincipioActivo.getValue());
        medicamento.setConcentracion(txtConcentracion.getValue());
        medicamento.setFormaFarmaceutica(txtFormaFarmaceutica.getValue());
        medicamento.setCategoria(txtCategoria.getValue());

        // Patologías: dividir por comas
        String patologiasStr = txtPatologias.getValue();
        if (patologiasStr != null && !patologiasStr.trim().isEmpty()) {
            medicamento.setPatologias(Arrays.stream(patologiasStr.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList()));
        } else {
            medicamento.setPatologias(new java.util.ArrayList<>());
        }

        medicamento.setMecanismoAccion(txtMecanismo.getValue());
        medicamento.setIndicaciones(txtIndicaciones.getValue());
        medicamento.setDosis(txtDosis.getValue());

        repository.save(medicamento);

        Notification.show("✅ Medicamento actualizado correctamente", 3000, Notification.Position.TOP_CENTER)
                .addThemeVariants(NotificationVariant.LUMO_SUCCESS);

        UI.getCurrent().navigate(AdminView.class);
    }
}