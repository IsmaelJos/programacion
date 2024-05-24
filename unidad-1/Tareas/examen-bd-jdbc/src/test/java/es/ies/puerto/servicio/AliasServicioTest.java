package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class AliasServicioTest {
    AliasServicio aliasServicio;

    @Mock
    DaoAlias daoAliasMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        try {
            aliasServicio = new AliasServicio();
            aliasServicio.setDaoAlias(daoAliasMock);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }
    @Test
    void getAllTest() throws MarvelException {
        when(daoAliasMock.findAllAlias()).thenReturn(new HashSet<>());
        Response respuesta = aliasServicio.getAlias();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoAliasMock.findAlias(any(Alias.class))).thenReturn(new Alias());
        Response respuesta = aliasServicio.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoAliasMock.findAlias(any(Alias.class))).thenReturn(null);
        Response respuesta = aliasServicio.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = aliasServicio.addAlias(new Alias());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }
    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = aliasServicio.addAlias(new Alias());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus());
    }
    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = aliasServicio.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }
    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = aliasServicio.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
