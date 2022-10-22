package com.ws.repository;

import com.ws.mapper.PersonaMapper;
import com.ws.model.PaisEntity;
import com.ws.model.PersonaEntity;
import com.ws.model.UniversidadEntity;
import com.ws.model.dto.PersonaDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonaRepository {

    @Inject
    private PersonaMapper mapper;

    List<PersonaEntity> personas = Arrays.asList(new PersonaEntity("Jhonata","Mallqui","Diaz",23L,new UniversidadEntity("UNI"),new PaisEntity("Peru","Lima")));

    public List<PersonaDto> getPersonas (){

      //  return personas.stream().map(p -> mapper.toDto(p)).collect(Collectors.toList());
        return personas.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
