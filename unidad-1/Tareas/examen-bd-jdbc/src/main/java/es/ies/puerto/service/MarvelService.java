package es.ies.puerto.service;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Set;

@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class MarvelService {

    private DaoAlias daoAlias;
    private DaoEquipamiento daoEquipamiento;
    private DaoPersonaje daoPersonaje;
    private DaoPoder daoPoder;

    public void setDaoAlias(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }
    public void setDaoEquipamiento(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }
    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }
    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    public MarvelService() throws MarvelException {
        daoAlias = new DaoAlias();
        daoEquipamiento = new DaoEquipamiento();
        daoPersonaje = new DaoPersonaje();
        daoPoder = new DaoPoder();
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

    @GET
    @Path("/xml/alias/{id}")
    @Produces("application/xml/alias")
    public Response getAliasXml(@PathParam("id") String id) throws MarvelException {
        Alias alias = daoAlias.findAlias(new Alias(id));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
