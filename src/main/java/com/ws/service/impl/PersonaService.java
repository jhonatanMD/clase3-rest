package com.ws.service.impl;

import com.ws.mapper.PersonaMapper;
import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;
import com.ws.repository.PersonaRepository;
import com.ws.service.IPersonaService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

//@Singleton
//@ApplicationScoped

@ApplicationScoped
public class PersonaService implements IPersonaService {


   /* @Inject
    private PersonaFunction personaFunction;
    */

    @Inject
    private PersonaMapper mapper;

    @Inject
    private PersonaRepository repository;

    @Override
    public PersonaDto guardar(PersonaRequest request) {

        /*
        PersonaDto dto = new PersonaDto();
        dto.setNombre(request.getNombre());
        dto.setApellidoPat(request.getApellidoPat());
        dto.setApellidoMat(request.getApellidoMat());
        dto.setEdad(request.getEdad());
        */
        return mapper.toDto(request);
    }

    @Override
    public List<PersonaDto> getPersonas() {
        return repository.getPersonas();
    }
}
