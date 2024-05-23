package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeServicio {
    private DaoPersonaje daoPersonaje;
    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/equipamiento/{id}")
    public Response getPersonajeById(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = daoPersonaje.findPersonaje(new Personaje(id));
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @GET
    @Path("/equipamiento")
    public Response getPersonaje() throws MarvelException {
        Set<Personaje> personaje = daoPersonaje.findAllPersonaje();
        return Response.ok(personaje).build();
    }

    @POST
    @Path("/equipamiento")
    public Response addPersonaje(Personaje personaje) throws MarvelException {
        boolean resultado = daoPersonaje.updatePersonaje(personaje);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/equipamiento/{id}")
    public Response deletePersonajeById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoPersonaje.deletePersonaje(new Personaje(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
