package com.ws.service;

import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;

import java.util.List;

public interface IPersonaService {
    PersonaDto guardar(PersonaRequest request);

    List<PersonaDto> getPersonas ();
}
