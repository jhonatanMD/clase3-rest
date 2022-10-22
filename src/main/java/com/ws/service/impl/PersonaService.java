package com.ws.service.impl;

import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;
import com.ws.service.IPersonaService;

import javax.enterprise.context.ApplicationScoped;

//@Singleton
//@ApplicationScoped

@ApplicationScoped
public class PersonaService implements IPersonaService {

    @Override
    public PersonaDto guardar(PersonaRequest request) {

        PersonaDto dto = new PersonaDto();
        dto.setNombre(request.getNombre());
        dto.setApellidoPat(request.getApellidoPat());
        dto.setApellidoMat(request.getApellidoMat());
        dto.setEdad(request.getEdad());


        return dto;
    }
}
