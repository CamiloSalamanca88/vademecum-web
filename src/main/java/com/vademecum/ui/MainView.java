package com.vademecum.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;
import com.vademecum.model.Medicamento;
import com.vademecum.service.BuscadorService;

import java.util.List;

@Route("")
@PageTitle("Vademécum Antroposófico")
@PermitAll
public class MainView extends HorizontalLayout {

    private final BuscadorService servicio;

    private TextField txtPrincipio;
    private TextField txtPatologia;
    private String formaSeleccionada = "";
    private Button btnFormaActivo = null;
    private ListBox<Medicamento> listaMedicamentos;
    private Span lblContador;

    // Panel de detalle
    private H2 lblNombre;
    private Span lblPrincipio;
    private Span badgeConcentracion;
    private Span badgeForma;
    private Span lblCategoria;
    private Paragraph txtPatologias;
    private Paragraph txtMecanismo;
    private Paragraph txtIndicaciones;
    private Paragraph txtDosis;

    public MainView(BuscadorService servicio) {
        this.servicio = servicio;
        setSizeFull();
        setSpacing(false);
        setPadding(false);
        getStyle().set("background", "#FAF7EF");
        getStyle().set("font-family", "Georgia, 'Times New Roman', serif");
        getStyle().set("overflow-x", "hidden");
        getStyle().set("overflow-y", "hidden");
        getStyle().set("max-height", "100vh");

        add(buildSidebar(), buildDetailPanel());
        cargarTodos();
    }

    // ── SIDEBAR ─────────────────────────────────────────────────────────────

    private VerticalLayout buildSidebar() {
        VerticalLayout sidebar = new VerticalLayout();
        sidebar.setWidth("360px");
        sidebar.setHeightFull();
        sidebar.setSpacing(false);
        sidebar.setPadding(false);
        sidebar.getStyle()
                .set("background", "#FFFDF8")
                .set("border-right", "1px solid #CDC4A8")
                .set("flex-shrink", "0")
                .set("overflow-y", "auto");

        sidebar.add(buildTopBar(), buildFiltros(), buildLista());
        return sidebar;
    }

    private Div buildTopBar() {
        Div bar = new Div();
        bar.getStyle()
                .set("background", "#2D4A2B")
                .set("padding", "18px 20px")
                .set("display", "flex")
                .set("align-items", "center")
                .set("gap", "10px");

        Span icon = new Span("🌿");
        icon.getStyle().set("color", "#A27C40").set("font-size", "20px");

        Span title = new Span("Vademécum Antroposófico");
        title.getStyle()
                .set("color", "white")
                .set("font-size", "16px")
                .set("font-weight", "bold")
                .set("letter-spacing", "0.3px");

        bar.add(icon, title);
        return bar;
    }

    private VerticalLayout buildFiltros() {
        VerticalLayout filtros = new VerticalLayout();
        filtros.setPadding(true);
        filtros.setSpacing(false);
        filtros.getStyle().set("background", "#FFFDF8").set("gap", "10px");

        // Campo principio activo
        Span lbl1 = new Span("🔬  Principio Activo");
        lbl1.getStyle().set("font-size", "11px").set("font-weight", "bold")
                .set("color", "#6B7844").set("letter-spacing", "0.5px")
                .set("text-transform", "uppercase");

        txtPrincipio = new TextField();
        txtPrincipio.setPlaceholder("Ej: Árnica, Absinthium...");
        txtPrincipio.setWidthFull();
        txtPrincipio.getStyle().set("--lumo-font-family", "Georgia, serif");
        txtPrincipio.addValueChangeListener(e -> ejecutarBusqueda());

        // Campo patología
        Span lbl2 = new Span("🏥  Patología");
        lbl2.getStyle().set("font-size", "11px").set("font-weight", "bold")
                .set("color", "#6B7844").set("letter-spacing", "0.5px")
                .set("text-transform", "uppercase")
                .set("margin-top", "8px");

        txtPatologia = new TextField();
        txtPatologia.setPlaceholder("Ej: Artrosis, Diabetes...");
        txtPatologia.setWidthFull();
        txtPatologia.addValueChangeListener(e -> ejecutarBusqueda());

        // Botones forma farmacéutica
        Span lbl3 = new Span("💊  Forma Farmacéutica");
        lbl3.getStyle().set("font-size", "11px").set("font-weight", "bold")
                .set("color", "#6B7844").set("letter-spacing", "0.5px")
                .set("text-transform", "uppercase")
                .set("margin-top", "8px");

        HorizontalLayout formaRow1 = new HorizontalLayout();
        formaRow1.setWidthFull();
        formaRow1.setSpacing(true);

        HorizontalLayout formaRow2 = new HorizontalLayout();
        formaRow2.setWidthFull();
        formaRow2.setSpacing(true);

        Button btnGotas = buildFormaBtn("💧 Dilución", "Dil");
        Button btnTrituracion = buildFormaBtn("⚗️ Trituración", "trit");
        Button btnUngüento   = buildFormaBtn("🫙 Ungüento",     "ung");
        Button btnOleo       = buildFormaBtn("🌱 Oleo",         "oleo");

        formaRow1.add(btnGotas, btnTrituracion);
        formaRow1.setFlexGrow(1, btnGotas);
        formaRow1.setFlexGrow(1, btnTrituracion);

        formaRow2.add(btnUngüento, btnOleo);
        formaRow2.setFlexGrow(1, btnUngüento);
        formaRow2.setFlexGrow(1, btnOleo);

        // Botones Buscar / Limpiar
        HorizontalLayout botones = new HorizontalLayout();
        botones.setWidthFull();
        botones.setSpacing(true);
        botones.getStyle().set("margin-top", "6px");

        Button btnBuscar = new Button("Buscar");
        btnBuscar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        btnBuscar.getStyle()
                .set("background", "#2D4A2B")
                .set("color", "white")
                .set("border-radius", "6px")
                .set("flex", "1");
        btnBuscar.addClickListener(e -> ejecutarBusqueda());

        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.getStyle()
                .set("background", "#EDE8DC")
                .set("color", "#504830")
                .set("border-radius", "6px")
                .set("flex", "1");
        btnLimpiar.addClickListener(e -> {
            txtPrincipio.clear();
            txtPatologia.clear();
            formaSeleccionada = "";
            if (btnFormaActivo != null) {
                resetBtnForma(btnFormaActivo);
                btnFormaActivo = null;
            }
            cargarTodos();
        });

        botones.add(btnBuscar, btnLimpiar);
        botones.setFlexGrow(1, btnBuscar);
        botones.setFlexGrow(1, btnLimpiar);

        filtros.add(lbl1, txtPrincipio, lbl2, txtPatologia,
                    lbl3, formaRow1, formaRow2, botones);
        return filtros;
    }

    private Button buildFormaBtn(String label, String forma) {
        Button btn = new Button(label);
        estiloFormaBtn(btn, false);
        btn.addClickListener(e -> {
            if (formaSeleccionada.equals(forma)) {
                // Deseleccionar si se vuelve a clickear
                formaSeleccionada = "";
                estiloFormaBtn(btn, false);
                btnFormaActivo = null;
            } else {
                // Resetear botón anterior
                if (btnFormaActivo != null) resetBtnForma(btnFormaActivo);
                formaSeleccionada = forma;
                estiloFormaBtn(btn, true);
                btnFormaActivo = btn;
            }
            ejecutarBusqueda();
        });
        return btn;
    }

    private void estiloFormaBtn(Button btn, boolean activo) {
        if (activo) {
            btn.getStyle()
                    .set("background", "#2D4A2B")
                    .set("color", "white")
                    .set("border-radius", "6px")
                    .set("font-size", "12px")
                    .set("border", "2px solid #2D4A2B");
        } else {
            btn.getStyle()
                    .set("background", "#FFFDF8")
                    .set("color", "#504830")
                    .set("border-radius", "6px")
                    .set("font-size", "12px")
                    .set("border", "1px solid #CDC4A8");
        }
    }

    private void resetBtnForma(Button btn) {
        estiloFormaBtn(btn, false);
    }

    private VerticalLayout buildLista() {
        VerticalLayout wrapper = new VerticalLayout();
        wrapper.setSizeFull();
        wrapper.setSpacing(false);
        wrapper.setPadding(false);

        // Contador
        lblContador = new Span();
        lblContador.getStyle()
                .set("font-size", "11px")
                .set("color", "#504830")
                .set("padding", "6px 16px")
                .set("background", "#EDE8DC")
                .set("border-top", "1px solid #CDC4A8")
                .set("border-bottom", "1px solid #CDC4A8")
                .set("display", "block");

        // Lista
        listaMedicamentos = new ListBox<>();
        listaMedicamentos.setSizeFull();
        listaMedicamentos.getStyle()
                .set("overflow-y", "auto")
                .set("background", "#FAF7EF");

        listaMedicamentos.setRenderer(new ComponentRenderer<>(m -> {
            Div item = new Div();
            item.getStyle()
                    .set("padding", "10px 14px")
                    .set("cursor", "pointer")
                    .set("border-bottom", "1px solid #EDE8DC");

            Span nombre = new Span(m.getNombreComercial());
            nombre.getStyle()
                    .set("display", "block")
                    .set("font-weight", "bold")
                    .set("font-size", "13px")
                    .set("color", "#1E1C12");

            Span principio = new Span(m.getPrincipioActivo() + " · " + m.getConcentracion());
            principio.getStyle()
                    .set("display", "block")
                    .set("font-size", "11px")
                    .set("color", "#504830")
                    .set("margin-top", "2px");

            Span cat = new Span(m.getCategoria());
            cat.getStyle()
                    .set("display", "block")
                    .set("font-size", "11px")
                    .set("color", "#A27C40")
                    .set("font-style", "italic")
                    .set("margin-top", "2px");

            item.add(nombre, principio, cat);
            return item;
        }));

        listaMedicamentos.addValueChangeListener(e -> {
            if (e.getValue() != null) mostrarDetalle(e.getValue());
        });

        wrapper.add(lblContador, listaMedicamentos);
        wrapper.setFlexGrow(1, listaMedicamentos);
        return wrapper;
    }

    // ── PANEL DE DETALLE ────────────────────────────────────────────────────

    private VerticalLayout buildDetailPanel() {
        VerticalLayout panel = new VerticalLayout();
        panel.setSizeFull();
        panel.setSpacing(false);
        panel.setPadding(false);
        panel.getStyle().set("overflow-y", "auto").set("background", "#FAF7EF").set("align-items", "flex-start").set("height", "100vh");

        // Header
        Div header = new Div();
        header.setWidthFull();
        header.getStyle()
                .set("background", "#2D4A2B")
                .set("padding", "20px 28px")
                .set("position", "relative");

        lblNombre = new H2("Seleccione un medicamento");
        lblNombre.getStyle()
                .set("color", "white")
                .set("margin", "0")
                .set("font-size", "22px")
                .set("font-family", "Georgia, serif");

        lblPrincipio = new Span("Realice una búsqueda y seleccione un resultado");
        lblPrincipio.getStyle()
                .set("color", "#B8D4B0")
                .set("font-size", "14px")
                .set("display", "block")
                .set("margin-top", "4px");

        HorizontalLayout badges = new HorizontalLayout();
        badges.setSpacing(true);
        badges.getStyle().set("margin-top", "10px");

        badgeConcentracion = buildBadge("—");
        badgeForma = buildBadge("—");
        badges.add(badgeConcentracion, badgeForma);

        header.add(lblNombre, lblPrincipio, badges);

        // Cuerpo
        Div body = new Div();
        body.setWidthFull();
        body.getStyle()
                .set("padding", "20px 28px 40px 28px")
                .set("width", "calc(100% - 4px)")
                .set("box-sizing", "border-box")
                .set("overflow-y", "auto")
                .set("max-height", "calc(100vh - 80px)");

        // Card categoría
        Div cardCat = buildInfoCard("CATEGORÍA", lblCategoria = new Span("—"), "#6B7844");
        cardCat.getStyle().set("margin-bottom", "16px");

        // Secciones
        txtPatologias  = new Paragraph("—");
        txtMecanismo   = new Paragraph("—");
        txtIndicaciones = new Paragraph("—");
        txtDosis       = new Paragraph("—");

        body.add(
            cardCat,
            buildSeccion("🌿  Patologías / Indicaciones terapéuticas", txtPatologias, "#F5F0E1", "#6B7844"),
            buildSeccion("⚙️  Mecanismo de acción", txtMecanismo, "#F0F0FF", "#6B7844"),
            buildSeccion("✅  Indicaciones clínicas", txtIndicaciones, "#F0FFF5", "#3A6032"),
            buildSeccion("💊  Diluciones", txtDosis, "#EBF8FF", "#2D4A2B")
        );

        // Barra de estado inferior
        Div statusBar = new Div();
        statusBar.setWidthFull();
        statusBar.getStyle()
                .set("background", "#1E1C12")
                .set("padding", "6px 20px")
                .set("display", "flex")
                .set("justify-content", "space-between")
                .set("align-items", "center")
                .set("width", "100%")
                .set("flex-shrink", "0");

        Span statusText = new Span("🌿  Vademécum Antroposófico · v1.0  |  Solo para uso profesional");
        statusText.getStyle().set("color", "#A09870").set("font-size", "11px");

        Span statusYear = new Span("© 2026");
        statusYear.getStyle().set("color", "#504830").set("font-size", "11px");

        statusBar.add(statusText, statusYear);

        panel.add(header, body, statusBar);
        return panel;
    }

    private Span buildBadge(String text) {
        Span badge = new Span(text);
        badge.getStyle()
                .set("background", "rgba(255,255,255,0.15)")
                .set("color", "white")
                .set("padding", "3px 12px")
                .set("border-radius", "20px")
                .set("font-size", "12px")
                .set("border", "1px solid rgba(255,255,255,0.3)");
        return badge;
    }

    private Div buildInfoCard(String titulo, Span valor, String color) {
        Div card = new Div();
        card.getStyle()
                .set("background", "#FFFDF8")
                .set("border", "2px solid " + color)
                .set("border-radius", "8px")
                .set("padding", "10px 16px");

        Span lbl = new Span(titulo);
        lbl.getStyle()
                .set("display", "block")
                .set("font-size", "10px")
                .set("font-weight", "bold")
                .set("color", color)
                .set("letter-spacing", "1px")
                .set("margin-bottom", "4px");

        valor.getStyle().set("font-size", "13px").set("color", "#1E1C12");

        card.add(lbl, valor);
        return card;
    }

    private Div buildSeccion(String titulo, Paragraph contenido, String bgColor, String borderColor) {
        Div seccion = new Div();
        seccion.getStyle()
                .set("background", bgColor)
                .set("border", "1px solid " + borderColor)
                .set("border-left", "4px solid " + borderColor)
                .set("border-radius", "6px")
                .set("padding", "14px 16px")
                .set("margin-bottom", "10px")
                .set("width", "calc(100% - 4px)")
                .set("box-sizing", "border-box");

        Span lbl = new Span(titulo);
        lbl.getStyle()
                .set("display", "block")
                .set("font-weight", "bold")
                .set("font-size", "13px")
                .set("color", borderColor)
                .set("margin-bottom", "8px")
                .set("font-family", "Georgia, serif");

        contenido.getStyle()
                .set("margin", "0")
                .set("font-size", "13px")
                .set("color", "#1E1C12")
                .set("line-height", "1.6");

        seccion.add(lbl, contenido);
        return seccion;
    }

    // ── LÓGICA ──────────────────────────────────────────────────────────────

    private void ejecutarBusqueda() {
        List<Medicamento> resultados = servicio.buscarCombinado(
                txtPrincipio.getValue(), txtPatologia.getValue(), formaSeleccionada);
        actualizarLista(resultados);
    }

    private void cargarTodos() {
        actualizarLista(servicio.getTodos());
    }

    private void actualizarLista(List<Medicamento> medicamentos) {
        listaMedicamentos.setItems(medicamentos);
        int n = medicamentos.size();
        lblContador.setText("  " + n + " medicamento" + (n != 1 ? "s" : "") + " encontrado" + (n != 1 ? "s" : ""));
    }

    private void mostrarDetalle(Medicamento m) {
        lblNombre.setText(m.getNombreComercial());
        lblPrincipio.setText("Principio activo: " + m.getPrincipioActivo());
        badgeConcentracion.setText(m.getConcentracion());
        badgeForma.setText(m.getFormaFarmaceutica());
        lblCategoria.setText(m.getCategoria());
        txtPatologias.setText(String.join(" · ", m.getPatologias()));
        txtMecanismo.setText(m.getMecanismoAccion());
        txtIndicaciones.setText(m.getIndicaciones());
        txtDosis.setText(m.getDosis());
    }
}
