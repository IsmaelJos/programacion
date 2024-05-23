package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Poder;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class PoderServicio {
    private DaoPoder daoPoder;
    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/poder/{id}")
    public Response getPoderById(@PathParam("id") String id) throws MarvelException {
        Poder poder = daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @GET
    @Path("/poder")
    public Response getPoder() throws MarvelException {
        Set<Poder> poderes = daoPoder.findAllPoder();
        return Response.ok(poderes).build();
    }

    @POST
    @Path("/poder")
    public Response addPoder(Poder poder) throws MarvelException {
        boolean resultado = daoPoder.updatePoder(poder);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/poder/{id}")
    public Response deletePoderById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoPoder.deletePoder(new Poder(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
