package com.ws.mapper;

import com.ws.model.PersonaEntity;
import com.ws.model.data.PersonaRequest;
import com.ws.model.dto.PersonaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface PersonaMapper {
    PersonaDto toDto (PersonaRequest request);


    @Mapping(target = "universidad" ,source = "universidad.nombre")
    //@Mapping(target = "mayorEdad" , expression = "java(entity.getEdad() > 18)")
    @Mapping(target = "mayorEdad" , expression = "java(mayorEdad(entity.getEdad()))")
    @Mapping(target = "pais" , ignore = true)
    PersonaDto toDto (PersonaEntity entity);


    default Boolean mayorEdad(Long edad){
        return edad > 18;
    }

}
