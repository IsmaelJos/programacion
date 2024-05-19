package es.ies.puerto.services;

import es.ies.puerto.models.Personaje;
import es.ies.puerto.repositories.PersonajeList;

import javax.ws.rs.*;
import java.util.List;

@Path("/")
public class PersonajeService {
    private PersonajeList personajeList;

    public PersonajeService (){
        personajeList = new PersonajeList();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Personaje getPersonajeById(@PathParam("id") String id) {
        return personajeList.getPersonajeById(id);
    }

    @GET
    @Path("/xml/{id}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    public Personaje getPersonajeXml(@PathParam("id") String id) {
        return personajeList.getPersonajeById(id);
    }

    @GET
    @Path("/")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    public List<Personaje> getPersonajes() {
        return personajeList.getPersonajes();
    }

    @POST
    @Path("/{song}")
    @Consumes({ "application/json" })
    public void addPersonaje(@PathParam("personaje") Personaje personaje) {
        personajeList.savePersonaje(personaje);
    }
}
