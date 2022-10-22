package com.ws.controller;

import com.ws.model.data.PersonaRequest;
import com.ws.service.IPersonaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
public class AppController {

    @Inject //instansiar la interface
    private IPersonaService personaService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postPersona(PersonaRequest request) {
        System.out.println(request);
        return Response.ok().entity(personaService.guardar(request)).build();
    }
}