package com.ws.service;

import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;

public interface IPersonaService {
    PersonaDto guardar(PersonaRequest request);
}
