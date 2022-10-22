package com.ws.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaEntity {

    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private Long edad;

    private UniversidadEntity universidad;

    private PaisEntity pais;

}
