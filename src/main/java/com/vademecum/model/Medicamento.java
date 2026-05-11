package com.vademecum.model;

import java.util.List;

public class Medicamento {
    private String id;
    private String nombreComercial;
    private String principioActivo;
    private String concentracion;
    private String formaFarmaceutica;
    private List<String> patologias;
    private String mecanismoAccion;
    private String indicaciones;
    private String contraindicaciones;
    private String efectosAdversos;
    private String dosis;
    private String interacciones;
    private String categoria;
    private String laboratorio;

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
}
