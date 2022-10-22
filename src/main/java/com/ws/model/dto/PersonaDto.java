package com.ws.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDto {

    private String nombre;
    private String apellidoPat;

    private String universidad;

    private String apellidoMat;
    private Long edad;

    private Boolean mayorEdad;

    private PaisDto pais;

}
