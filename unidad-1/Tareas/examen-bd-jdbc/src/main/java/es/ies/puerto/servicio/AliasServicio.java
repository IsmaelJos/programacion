package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasServicio {
    private DaoAlias daoAlias;
    public void setDaoAlias(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/alias/{id}")
    public Response getAliasById(@PathParam("id") String id) throws MarvelException {
        Alias alias = daoAlias.findAlias(new Alias(id));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @GET
    @Path("/alias")
    public Response getAlias() throws MarvelException {
        Set<Alias> aliases = daoAlias.findAllAlias();
        return Response.ok(aliases).build();
    }

    @POST
    @Path("/alias")
    public Response addAlias(Alias alias) throws MarvelException {
        boolean resultado = daoAlias.updateAlias(alias);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/alias/{id}")
    public Response deleteAliasById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoAlias.deleteAlias(new Alias(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
