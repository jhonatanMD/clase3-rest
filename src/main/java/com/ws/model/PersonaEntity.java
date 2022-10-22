package com.ws.model;

public class PersonaEntity {

    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private Long edad;

    private UniversidadEntity universidad;

    private String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }


    public UniversidadEntity getUniversidad() {
        return universidad;
    }

    public void setUniversidad(UniversidadEntity universidad) {
        this.universidad = universidad;
    }

    public PersonaEntity(String nombre, String apellidoPat, String apellidoMat, Long edad, UniversidadEntity universidad, String pais) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.edad = edad;
        this.universidad = universidad;
        this.pais = pais;
    }

    public PersonaEntity() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
