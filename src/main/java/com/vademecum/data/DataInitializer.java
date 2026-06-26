package com.vademecum.data;

import com.vademecum.model.Medicamento;
import com.vademecum.model.Usuario;
import com.vademecum.repository.MedicamentoRepository;
import com.vademecum.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    private final MedicamentoRepository medicamentoRepository;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(MedicamentoRepository medicamentoRepository,
                           UsuarioRepository usuarioRepository,
                           PasswordEncoder passwordEncoder) {
        this.medicamentoRepository = medicamentoRepository;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        cargarMedicamentos();
        cargarUsuarios();
    }

    private void cargarMedicamentos() {
        long cantidadActual = medicamentoRepository.count();

        if (cantidadActual > 0) {
            log.info("La base de datos ya tiene {} medicamentos. No se realiza carga inicial.", cantidadActual);
            return;
        }

        log.info("Base de datos vacía. Iniciando carga de medicamentos...");
        List<Medicamento> medicamentos = MedicamentosData.cargarMedicamentos();
        medicamentoRepository.saveAll(medicamentos);
        log.info("Carga inicial completada. Se guardaron {} medicamentos.", medicamentos.size());
    }

    private void cargarUsuarios() {
        long cantidadUsuarios = usuarioRepository.count();

        if (cantidadUsuarios > 0) {
            log.info("Ya existen {} usuarios. No se crean usuarios iniciales.", cantidadUsuarios);
            return;
        }

        log.info("No hay usuarios. Creando usuarios iniciales...");

        usuarioRepository.save(new Usuario("Farmacia",
                passwordEncoder.encode("AplicacionWeleda.4188"), "USER"));

        usuarioRepository.save(new Usuario("Admin",
                passwordEncoder.encode("Welcl.4188JG"), "ADMIN"));

        usuarioRepository.save(new Usuario("Prueba",
                passwordEncoder.encode("Prueba1234"), "USER"));

        log.info("Se crearon 3 usuarios iniciales.");
    }
}