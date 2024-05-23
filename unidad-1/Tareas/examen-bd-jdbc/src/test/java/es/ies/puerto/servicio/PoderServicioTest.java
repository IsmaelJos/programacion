package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PoderServicioTest {
    PoderServicio poderServicio;

    @Mock
    DaoPoder daoPoderMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        poderServicio = new PoderServicio();
        poderServicio.setDaoPoder(daoPoderMock);
    }
    @Test
    void getAllTest() throws MarvelException {
        when(daoPoderMock.findAllPoder()).thenReturn(new HashSet<>());
        Response respuesta = poderServicio.getPoder();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoPoderMock.findPoder(any(Poder.class))).thenReturn(new Poder());
        Response respuesta = poderServicio.getPoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoPoderMock.findPoder(any(Poder.class))).thenReturn(null);
        Response respuesta = poderServicio.getPoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoPoderMock.updatePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderServicio.addPoder(new Poder());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }
    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoPoderMock.updatePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderServicio.addPoder(new Poder());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus());
    }
    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderServicio.deletePoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }
    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderServicio.deletePoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
