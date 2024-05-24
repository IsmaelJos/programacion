package es.ies.puerto.servicio;


import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoServicio {
    public void setDaoEquipamiento(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }
    private DaoEquipamiento daoEquipamiento;

    public EquipamientoServicio() throws MarvelException{
        daoEquipamiento = new DaoEquipamiento();
    }

    @GET
    @Path("/{id}")
    public Response getEquipamientoById(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = daoEquipamiento.findEquipamiento(new Equipamiento(id));
        if (equipamiento != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @GET
    @Path("/")
    public Response getEquipamiento() throws MarvelException {
        Set<Equipamiento> equipamientos = daoEquipamiento.findAllEquipamiento();
        return Response.ok(equipamientos).build();
    }

    @POST
    @Path("/")
    public Response addEquipamiento(Equipamiento equipamiento) throws MarvelException {
        boolean resultado = daoEquipamiento.updateEquipamiento(equipamiento);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEquipamientoById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoEquipamiento.deleteEquipamiento(new Equipamiento(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
