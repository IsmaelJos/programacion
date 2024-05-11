package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.PoderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper( IMapperPoder.class );

    Poder poderDTOToPoderEntity(PoderDTO poderDTO);

    PoderDTO poderEntityToPoderDTO(Poder poder);

}
