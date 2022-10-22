package com.ws.model.dto;

public class PaisDto {

    private String nombre;
    private String capital;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public PaisDto(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public PaisDto() {
    }
}
