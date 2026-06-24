package com.vademecum.service;

import com.vademecum.model.Medicamento;
import com.vademecum.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuscadorService {

    private final MedicamentoRepository repository;

    public BuscadorService(MedicamentoRepository repository) {
        this.repository = repository;
    }

    public List<Medicamento> getTodos() {
        return repository.findAll().stream()
                .filter(Medicamento::isVisible)
                .collect(Collectors.toList());
    }

    public List<Medicamento> buscarCombinado(String principio, String patologia, String forma) {
        List<Medicamento> resultado = repository.findAll().stream()
                .filter(Medicamento::isVisible)
                .collect(Collectors.toList());

        if (principio != null && !principio.trim().isEmpty()) {
            String txt = principio.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> (m.getPrincipioActivo() != null && m.getPrincipioActivo().toLowerCase().contains(txt))
                            || (m.getNombreComercial() != null && m.getNombreComercial().toLowerCase().contains(txt)))
                    .collect(Collectors.toList());
        }

        if (patologia != null && !patologia.trim().isEmpty()) {
            String txt = patologia.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> m.getPatologias() != null && m.getPatologias().stream()
                            .anyMatch(p -> p != null && p.toLowerCase().contains(txt)))
                    .collect(Collectors.toList());
        }

        if (forma != null && !forma.trim().isEmpty()) {
            String txt = forma.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> (m.getFormaFarmaceutica() != null && m.getFormaFarmaceutica().toLowerCase().contains(txt))
                            || (m.getConcentracion() != null && m.getConcentracion().toLowerCase().contains(txt)))
                    .collect(Collectors.toList());
        }

        return resultado;
    }

    public List<String> getTodasPatologias() {
        return repository.findAll().stream()
                .filter(m -> m.getPatologias() != null)
                .flatMap(m -> m.getPatologias().stream())
                .filter(p -> p != null)
                .distinct().sorted()
                .collect(Collectors.toList());
    }
    public List<Medicamento> getTodosAdmin() {
        return repository.findAll();
    }
}