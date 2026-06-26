package com.vademecum.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vademecum.model.Usuario;
import com.vademecum.repository.UsuarioRepository;
import jakarta.annotation.security.PermitAll;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Route("admin/usuarios")
@PageTitle("Gestión de Usuarios · Vademécum")
@PermitAll
public class UsuarioAdminView extends VerticalLayout {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;
    private Grid<Usuario> grid;
    private List<Usuario> todosLosUsuarios;

    public UsuarioAdminView(UsuarioRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        setSizeFull();
        setSpacing(false);
        setPadding(false);

        var auth = org.springframework.security.core.context.SecurityContextHolder
                .getContext().getAuthentication();
        boolean esAdmin = auth != null && auth.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));

        if (!esAdmin) {
            add(new Span("Acceso denegado."));
            UI.getCurrent().navigate(MainView.class);
            return;
        }

        getStyle().set("background", "#FAF7EF")
                .set("font-family", "Georgia, 'Times New Roman', serif");

        add(buildHeader(), buildToolbar(), buildGrid());
        cargarUsuarios();
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

        Icon icon = VaadinIcon.USERS.create();
        icon.setColor("#A27C40");
        icon.setSize("24px");

        H2 title = new H2("Gestión de Usuarios");
        title.getStyle()
                .set("color", "white")
                .set("margin", "0")
                .set("font-size", "22px");

        titleSection.add(icon, title);

        Button btnVolver = new Button("← Volver al Admin", e ->
                UI.getCurrent().navigate(AdminView.class));
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

        Span info = new Span("Administre los usuarios que pueden acceder al sistema");
        info.getStyle().set("color", "#504830").set("font-size", "13px");

        Button btnNuevo = new Button("＋ Nuevo Usuario", e -> abrirFormulario(null));
        btnNuevo.getStyle()
                .set("background", "#2D4A2B")
                .set("color", "white")
                .set("border-radius", "6px")
                .set("margin-left", "auto");

        toolbar.add(info, btnNuevo);
        return toolbar;
    }

    private Grid<Usuario> buildGrid() {
        grid = new Grid<>(Usuario.class, false);
        grid.setSizeFull();
        grid.getStyle().set("background", "#FAF7EF");

        grid.addColumn(Usuario::getId)
                .setHeader("ID")
                .setWidth("60px")
                .setFlexGrow(0);

        grid.addColumn(Usuario::getUsername)
                .setHeader("Usuario")
                .setAutoWidth(true)
                .setFlexGrow(1);

        grid.addColumn(Usuario::getRol)
                .setHeader("Rol")
                .setWidth("120px")
                .setFlexGrow(0);

        grid.addComponentColumn(usr -> {
            Span estado = new Span(usr.isActivo() ? "✅" : "🚫");
            estado.getStyle().set("cursor", "pointer").set("font-size", "18px");
            estado.getElement().setAttribute("title",
                    usr.isActivo() ? "Activo — clic para desactivar" : "Inactivo — clic para activar");
            estado.addClickListener(e -> {
                usr.setActivo(!usr.isActivo());
                repository.save(usr);
                grid.getDataProvider().refreshItem(usr);
            });
            return estado;
        }).setHeader("Activo").setWidth("80px").setFlexGrow(0);

        grid.addComponentColumn(usr -> {
            HorizontalLayout acciones = new HorizontalLayout();
            acciones.setSpacing(true);

            Button btnEditar = new Button("✏️");
            btnEditar.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_SMALL);
            btnEditar.getStyle()
                    .set("background", "#2D4A2B")
                    .set("color", "white")
                    .set("border-radius", "4px");
            btnEditar.addClickListener(e -> abrirFormulario(usr));

            Button btnEliminar = new Button("🗑");
            btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR, ButtonVariant.LUMO_SMALL);
            btnEliminar.getStyle().set("border-radius", "4px");
            btnEliminar.addClickListener(e -> confirmarEliminacion(usr));

            acciones.add(btnEditar, btnEliminar);
            return acciones;
        }).setHeader("Acciones").setWidth("140px").setFlexGrow(0);

        return grid;
    }

    private void cargarUsuarios() {
        todosLosUsuarios = repository.findAll();
        grid.setItems(todosLosUsuarios);
    }

    private void abrirFormulario(Usuario usuario) {
        boolean esNuevo = (usuario == null);
        Dialog dialogo = new Dialog();
        dialogo.setWidth("450px");
        dialogo.setCloseOnOutsideClick(false);

        H2 titulo = new H2(esNuevo ? "Nuevo Usuario" : "Editar Usuario");
        titulo.getStyle().set("margin", "0 0 16px 0").set("font-size", "18px").set("color", "#2D4A2B");

        TextField txtUsername = new TextField("Nombre de usuario");
        txtUsername.setWidthFull();
        txtUsername.setValue(esNuevo ? "" : usuario.getUsername());

        PasswordField txtPassword = new PasswordField(esNuevo ? "Contraseña" : "Nueva contraseña (dejar vacío para mantener)");
        txtPassword.setWidthFull();

        ComboBox<String> comboRol = new ComboBox<>("Rol");
        comboRol.setItems("USER", "ADMIN");
        comboRol.setWidthFull();
        comboRol.setValue(esNuevo ? "USER" : usuario.getRol());

        Button btnGuardar = new Button(esNuevo ? "Crear Usuario" : "Guardar Cambios");
        btnGuardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        btnGuardar.getStyle()
                .set("background", "#2D4A2B")
                .set("color", "white")
                .set("border-radius", "6px");

        btnGuardar.addClickListener(e -> {
            String username = txtUsername.getValue().trim();
            String password = txtPassword.getValue();
            String rol = comboRol.getValue();

            if (username.isEmpty()) {
                Notification.show("El nombre de usuario es obligatorio", 3000, Notification.Position.MIDDLE)
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
                return;
            }

            if (esNuevo && password.isEmpty()) {
                Notification.show("La contraseña es obligatoria", 3000, Notification.Position.MIDDLE)
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
                return;
            }

            if (esNuevo) {
                if (repository.findByUsername(username).isPresent()) {
                    Notification.show("Ya existe un usuario con ese nombre", 3000, Notification.Position.MIDDLE)
                            .addThemeVariants(NotificationVariant.LUMO_ERROR);
                    return;
                }
                Usuario nuevo = new Usuario(username, passwordEncoder.encode(password), rol);
                repository.save(nuevo);
                Notification.show("✅ Usuario creado", 3000, Notification.Position.TOP_CENTER)
                        .addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            } else {
                if (!username.equals(usuario.getUsername()) && repository.findByUsername(username).isPresent()) {
                    Notification.show("Ya existe un usuario con ese nombre", 3000, Notification.Position.MIDDLE)
                            .addThemeVariants(NotificationVariant.LUMO_ERROR);
                    return;
                }
                usuario.setUsername(username);
                if (!password.isEmpty()) {
                    usuario.setPassword(passwordEncoder.encode(password));
                }
                usuario.setRol(rol);
                repository.save(usuario);
                Notification.show("✅ Usuario actualizado", 3000, Notification.Position.TOP_CENTER)
                        .addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            }

            dialogo.close();
            cargarUsuarios();
        });

        Button btnCancelar = new Button("Cancelar", e -> dialogo.close());

        HorizontalLayout botones = new HorizontalLayout(btnGuardar, btnCancelar);
        botones.getStyle().set("margin-top", "16px");

        VerticalLayout contenido = new VerticalLayout(titulo, txtUsername, txtPassword, comboRol, botones);
        contenido.setPadding(true);
        contenido.setSpacing(true);

        dialogo.add(contenido);
        dialogo.open();
    }

    private void confirmarEliminacion(Usuario usr) {
        String currentUser = org.springframework.security.core.context.SecurityContextHolder
                .getContext().getAuthentication().getName();

        if (usr.getUsername().equals(currentUser)) {
            Notification.show("No podés eliminar tu propio usuario", 3000, Notification.Position.MIDDLE)
                    .addThemeVariants(NotificationVariant.LUMO_ERROR);
            return;
        }

        Dialog dialogo = new Dialog();
        dialogo.setCloseOnOutsideClick(false);
        dialogo.setWidth("400px");

        Paragraph mensaje = new Paragraph("¿Eliminar el usuario \"" + usr.getUsername() + "\" permanentemente?");
        mensaje.getStyle().set("font-size", "15px").set("color", "#504830");

        Button btnConfirmar = new Button("Sí, eliminar", e -> {
            repository.delete(usr);
            cargarUsuarios();
            dialogo.close();
        });
        btnConfirmar.addThemeVariants(ButtonVariant.LUMO_ERROR, ButtonVariant.LUMO_PRIMARY);

        Button btnCancelar = new Button("Cancelar", e -> dialogo.close());

        HorizontalLayout botones = new HorizontalLayout(btnConfirmar, btnCancelar);
        dialogo.add(mensaje, botones);
        dialogo.open();
    }
}