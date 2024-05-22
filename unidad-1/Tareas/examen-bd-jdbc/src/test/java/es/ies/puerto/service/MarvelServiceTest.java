package es.ies.puerto.service;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class MarvelServiceTest {
    MarvelService marvelService;

    @Mock
    DaoAlias daoAliasMock;

    /*
    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        marvelService = new MarvelService();
        marvelService.setDaoAlias(daoAliasMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoAliasMock.findAllAlias()).thenReturn(new ArrayList<>());
        Response respuesta = marvelService.getAlias();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneOkTest() throws MarvelException {
        when(daoAliasMock.findAlias(new Alias(anyString()))).thenReturn(new Alias());
        Response respuesta = marvelService.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoAliasMock.findAlias(new Alias(anyString()))).thenReturn(null);
        Response respuesta = marvelService.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = marvelService.addAlias(new Alias());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }
    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = marvelService.addAlias(new Alias());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus());
    }
    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(new Alias(anyString()))).thenReturn(true);
        Response respuesta = marvelService.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }
    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(new Alias(anyString()))).thenReturn(false);
        Response respuesta = marvelService.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    */
}
