package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.negocio.dto.EquipamientoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper( IMapperEquipamiento.class );

    Equipamiento EquipamientoDTOToEquipamientoEntity(EquipamientoDTO equipamientoDTO);

    EquipamientoDTO EquipamientoEntityToEquipamientoDTO(Equipamiento equipamiento);

}
