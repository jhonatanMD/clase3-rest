package com.ws.mapper;

import com.ws.model.PaisEntity;
import com.ws.model.dto.PaisDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface PaisMapper {

    PaisDto toDto (PaisEntity entity);


}
