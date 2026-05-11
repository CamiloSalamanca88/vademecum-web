package com.vademecum.service;

import com.vademecum.data.MedicamentosData;
import com.vademecum.model.Medicamento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuscadorService {

    private final List<Medicamento> todos;

    public BuscadorService() {
        this.todos = MedicamentosData.cargarMedicamentos();
    }

    public List<Medicamento> getTodos() {
        return todos;
    }

    public List<Medicamento> buscarCombinado(String principio, String patologia, String forma) {
        List<Medicamento> resultado = todos;

        if (principio != null && !principio.trim().isEmpty()) {
            String txt = principio.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> m.getPrincipioActivo().toLowerCase().contains(txt)
                              || m.getNombreComercial().toLowerCase().contains(txt))
                    .collect(Collectors.toList());
        }

        if (patologia != null && !patologia.trim().isEmpty()) {
            String txt = patologia.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> m.getPatologias().stream()
                            .anyMatch(p -> p.toLowerCase().contains(txt)))
                    .collect(Collectors.toList());
        }

        if (forma != null && !forma.trim().isEmpty()) {
            String txt = forma.trim().toLowerCase();
            resultado = resultado.stream()
                    .filter(m -> m.getFormaFarmaceutica().toLowerCase().contains(txt)
                              || m.getConcentracion().toLowerCase().contains(txt))
                    .collect(Collectors.toList());
        }

        return resultado;
    }

    public List<String> getTodasPatologias() {
        return todos.stream()
                .flatMap(m -> m.getPatologias().stream())
                .distinct().sorted()
                .collect(Collectors.toList());
    }
}
