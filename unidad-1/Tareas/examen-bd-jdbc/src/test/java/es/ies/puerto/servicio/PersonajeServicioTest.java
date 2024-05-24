package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;

import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonajeServicioTest {

    PersonajeServicio personajeServicio;
    @Mock
    DaoPersonaje daoPersonajeMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        try {
            personajeServicio = new PersonajeServicio();
            personajeServicio.setDaoPersonaje(daoPersonajeMock);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    void getAllTest() throws MarvelException {
        when(daoPersonajeMock.findAllPersonaje()).thenReturn(new HashSet<>());
        Response respuesta = personajeServicio.getPersonaje();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoPersonajeMock.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());
        Response respuesta = personajeServicio.getPersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoPersonajeMock.findPersonaje(any(Personaje.class))).thenReturn(null);
        Response respuesta = personajeServicio.getPersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoPersonajeMock.updatePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeServicio.addPersonaje(new Personaje());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }
    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoPersonajeMock.updatePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeServicio.addPersonaje(new Personaje());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus());
    }
    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeServicio.deletePersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }
    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeServicio.deletePersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }


}
