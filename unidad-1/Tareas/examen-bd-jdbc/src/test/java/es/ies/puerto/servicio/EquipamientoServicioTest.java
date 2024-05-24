package es.ies.puerto.servicio;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class EquipamientoServicioTest {
    EquipamientoServicio equipamientoServicio;
    @Mock
    DaoEquipamiento daoEquipamientoMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        try {
            equipamientoServicio = new EquipamientoServicio();
            equipamientoServicio.setDaoEquipamiento(daoEquipamientoMock);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    void getAllTest() throws MarvelException {
        when(daoEquipamientoMock.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response respuesta = equipamientoServicio.getEquipamiento();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoEquipamientoMock.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
        Response respuesta = equipamientoServicio.getEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }
    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoEquipamientoMock.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
        Response respuesta = equipamientoServicio.getEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoEquipamientoMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoServicio.addEquipamiento(new Equipamiento());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }
    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoEquipamientoMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoServicio.addEquipamiento(new Equipamiento());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus());
    }
    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoServicio.deleteEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }
    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoServicio.deleteEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
