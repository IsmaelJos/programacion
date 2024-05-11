package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.negocio.dto.AliasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper( IMapperAlias.class );

    Alias aliasDTOToAliasEntity(AliasDTO aliasDTO);

    AliasDTO aliasEntityToAliasDTO(Alias alias);

}
