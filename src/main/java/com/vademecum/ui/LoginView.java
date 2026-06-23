package com.vademecum.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import com.vaadin.flow.server.VaadinServletRequest;
import com.vaadin.flow.server.VaadinServletResponse;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Route("login")
@PageTitle("Iniciar sesión — Vademécum Antroposófico")
@AnonymousAllowed
public class LoginView extends VerticalLayout {

    public LoginView(AuthenticationManager authenticationManager) {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        getStyle().set("background", "#FAF7EF");

        // Card central
        Div card = new Div();
        card.getStyle()
                .set("background", "#FFFDF8")
                .set("border", "1px solid #CDC4A8")
                .set("border-radius", "12px")
                .set("padding", "48px 40px")
                .set("width", "360px")
                .set("box-shadow", "0 4px 24px rgba(45,74,43,0.10)");

        // Logo / icono
        Div logoArea = new Div();
        logoArea.getStyle()
                .set("text-align", "center")
                .set("margin-bottom", "28px");

        Span icon = new Span("🌿");
        icon.getStyle().set("font-size", "48px");

        H2 titulo = new H2("Vademécum Antroposófico");
        titulo.getStyle()
                .set("color", "#2D4A2B")
                .set("font-size", "18px")
                .set("margin", "10px 0 4px 0")
                .set("text-align", "center")
                .set("font-family", "Georgia, serif");

        Span subtitulo = new Span("Acceso profesional");
        subtitulo.getStyle()
                .set("color", "#A27C40")
                .set("font-size", "13px")
                .set("display", "block")
                .set("text-align", "center")
                .set("font-style", "italic");

        logoArea.add(icon, titulo, subtitulo);

        // Separador
        Hr hr = new Hr();
        hr.getStyle()
                .set("border", "none")
                .set("border-top", "1px solid #EDE8DC")
                .set("margin", "0 0 24px 0");

        // Campos
        TextField txtUsuario = new TextField("Usuario");
        txtUsuario.setWidthFull();
        txtUsuario.setPlaceholder("Ingrese su usuario");
        txtUsuario.getStyle().set("margin-bottom", "12px");

        PasswordField txtPassword = new PasswordField("Contraseña");
        txtPassword.setWidthFull();
        txtPassword.setPlaceholder("Ingrese su contraseña");
        txtPassword.getStyle().set("margin-bottom", "20px");

        // Botón ingresar
        Button btnIngresar = new Button("Ingresar");
        btnIngresar.setWidthFull();
        btnIngresar.getStyle()
                .set("background", "#2D4A2B")
                .set("color", "white")
                .set("border-radius", "8px")
                .set("height", "44px")
                .set("font-size", "15px")
                .set("font-weight", "bold")
                .set("cursor", "pointer");

        // Acción login
        SecurityContextRepository securityContextRepository = new HttpSessionSecurityContextRepository();

        Runnable doLogin = () -> {
            try {
                Authentication auth = authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                txtUsuario.getValue().trim(),
                                txtPassword.getValue()));

                SecurityContext context = SecurityContextHolder.createEmptyContext();
                context.setAuthentication(auth);
                SecurityContextHolder.setContext(context);

                // Persistir el login en la sesión HTTP (clave para que no se pierda)
                HttpServletRequest request = VaadinServletRequest.getCurrent().getHttpServletRequest();
                HttpServletResponse response = VaadinServletResponse.getCurrent().getHttpServletResponse();
                securityContextRepository.saveContext(context, request, response);

                getUI().ifPresent(ui -> ui.navigate(""));
            } catch (AuthenticationException ex) {
                Notification notif = Notification.show("Usuario o contraseña incorrectos");
                notif.addThemeVariants(NotificationVariant.LUMO_ERROR);
                notif.setPosition(Notification.Position.TOP_CENTER);
                txtPassword.clear();
            }
        };

        btnIngresar.addClickListener(e -> doLogin.run());
        txtPassword.addKeyPressListener(
                com.vaadin.flow.component.Key.ENTER, e -> doLogin.run());
        txtUsuario.addKeyPressListener(
                com.vaadin.flow.component.Key.ENTER, e -> txtPassword.focus());

        // Pie
        Span pie = new Span("Solo para uso profesional médico y farmacéutico");
        pie.getStyle()
                .set("font-size", "11px")
                .set("color", "#A09870")
                .set("display", "block")
                .set("text-align", "center")
                .set("margin-top", "20px");

        card.add(logoArea, hr, txtUsuario, txtPassword, btnIngresar, pie);
        add(card);
    }
}
