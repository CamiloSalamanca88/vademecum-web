package com.vademecum.data;

import com.vademecum.model.Medicamento;
import com.vademecum.repository.MedicamentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    private final MedicamentoRepository repository;

    public DataInitializer(MedicamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        long cantidadActual = repository.count();

        if (cantidadActual > 0) {
            log.info("La base de datos ya tiene {} medicamentos. No se realiza carga inicial.", cantidadActual);
            return;
        }

        log.info("Base de datos vacía. Iniciando carga de medicamentos...");

        List<Medicamento> medicamentos = MedicamentosData.cargarMedicamentos();
        repository.saveAll(medicamentos);

        log.info("Carga inicial completada. Se guardaron {} medicamentos.", medicamentos.size());
    }
}