package com.ws.model.dto;

public class PersonaDto {

    private String nombre;
    private String apellidoPat;

    private String universidad;

    private String apellidoMat;
    private Long edad;

    private Boolean mayorEdad;

    private PaisDto pais;

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

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public Boolean getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(Boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }
}
