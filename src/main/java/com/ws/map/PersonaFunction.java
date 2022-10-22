package com.ws.map;

import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;

import javax.enterprise.context.ApplicationScoped;
import java.util.function.Function;

@ApplicationScoped
public class PersonaFunction implements Function<PersonaRequest, PersonaDto> {

    @Override
    public PersonaDto apply(PersonaRequest request) {

        PersonaDto dto = new PersonaDto();
        dto.setNombre(request.getNombre());
        dto.setApellidoPat(request.getApellidoPat());
        dto.setApellidoMat(request.getApellidoMat());
        dto.setEdad(request.getEdad());
        return dto;
    }
}
