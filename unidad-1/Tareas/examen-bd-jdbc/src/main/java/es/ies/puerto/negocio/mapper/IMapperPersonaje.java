package es.ies.puerto.negocio.mapper;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.negocio.dto.PersonajeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperPersonaje {
    IMapperPersonaje INSTANCE = Mappers.getMapper( IMapperPersonaje.class );

    Personaje PersonajeDTOToPersonajeEntity(PersonajeDTO personajeDTO);

    PersonajeDTO PersonajeEntityToPersonajeDTO(Personaje personaje);

}
