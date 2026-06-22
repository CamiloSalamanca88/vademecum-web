package com.vademecum.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    private String id;

    @Column(name = "nombre_comercial", length = 500)
    private String nombreComercial;

    @Column(name = "principio_activo", length = 1000)
    private String principioActivo;

    @Column(length = 500)
    private String concentracion;

    @Column(name = "forma_farmaceutica", length = 500)
    private String formaFarmaceutica;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "medicamento_patologias",
            joinColumns = @JoinColumn(name = "medicamento_id"))
    @Column(name = "patologia", length = 500)
    private List<String> patologias = new ArrayList<>();

    @Column(name = "mecanismo_accion", columnDefinition = "TEXT")
    private String mecanismoAccion;

    @Column(columnDefinition = "TEXT")
    private String indicaciones;

    @Column(columnDefinition = "TEXT")
    private String contraindicaciones;

    @Column(name = "efectos_adversos", columnDefinition = "TEXT")
    private String efectosAdversos;

    @Column(columnDefinition = "TEXT")
    private String dosis;

    @Column(columnDefinition = "TEXT")
    private String interacciones;

    @Column(length = 500)
    private String categoria;

    @Column(length = 500)
    private String laboratorio;

    // Constructor vacío requerido por JPA
    public Medicamento() {}

    public Medicamento(String id, String nombreComercial, String principioActivo,
                       String concentracion, String formaFarmaceutica,
                       List<String> patologias, String mecanismoAccion,
                       String indicaciones, String contraindicaciones,
                       String efectosAdversos, String dosis,
                       String interacciones, String categoria, String laboratorio) {
        this.id = id;
        this.nombreComercial = nombreComercial;
        this.principioActivo = principioActivo;
        this.concentracion = concentracion;
        this.formaFarmaceutica = formaFarmaceutica;
        this.patologias = patologias;
        this.mecanismoAccion = mecanismoAccion;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
        this.efectosAdversos = efectosAdversos;
        this.dosis = dosis;
        this.interacciones = interacciones;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
    }

    // Getters
    public String getId() { return id; }
    public String getNombreComercial() { return nombreComercial; }
    public String getPrincipioActivo() { return principioActivo; }
    public String getConcentracion() { return concentracion; }
    public String getFormaFarmaceutica() { return formaFarmaceutica; }
    public List<String> getPatologias() { return patologias; }
    public String getMecanismoAccion() { return mecanismoAccion; }
    public String getIndicaciones() { return indicaciones; }
    public String getContraindicaciones() { return contraindicaciones; }
    public String getEfectosAdversos() { return efectosAdversos; }
    public String getDosis() { return dosis; }
    public String getInteracciones() { return interacciones; }
    public String getCategoria() { return categoria; }
    public String getLaboratorio() { return laboratorio; }

    // Setters (necesarios para que el admin pueda editar)
    public void setId(String id) { this.id = id; }
    public void setNombreComercial(String nombreComercial) { this.nombreComercial = nombreComercial; }
    public void setPrincipioActivo(String principioActivo) { this.principioActivo = principioActivo; }
    public void setConcentracion(String concentracion) { this.concentracion = concentracion; }
    public void setFormaFarmaceutica(String formaFarmaceutica) { this.formaFarmaceutica = formaFarmaceutica; }
    public void setPatologias(List<String> patologias) { this.patologias = patologias; }
    public void setMecanismoAccion(String mecanismoAccion) { this.mecanismoAccion = mecanismoAccion; }
    public void setIndicaciones(String indicaciones) { this.indicaciones = indicaciones; }
    public void setContraindicaciones(String contraindicaciones) { this.contraindicaciones = contraindicaciones; }
    public void setEfectosAdversos(String efectosAdversos) { this.efectosAdversos = efectosAdversos; }
    public void setDosis(String dosis) { this.dosis = dosis; }
    public void setInteracciones(String interacciones) { this.interacciones = interacciones; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setLaboratorio(String laboratorio) { this.laboratorio = laboratorio; }
}