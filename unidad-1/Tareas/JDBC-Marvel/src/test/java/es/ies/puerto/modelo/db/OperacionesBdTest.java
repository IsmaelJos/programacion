package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Personajes;
import es.ies.puerto.modelo.original.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personajes personaje;
    @BeforeEach
    public void beforeEach() {
        try {
            personaje = new Personajes(3,"pepe","juan","Hombre");
            operacionesBd = new OperacionesBd(urlBd);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<Personajes> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeTest() {
        Personajes personaje = new Personajes(2);
        try {
            personaje = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertNotNull(personaje, MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(personaje.getGenero(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPersonajeTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonaje(personaje);
            Personajes personajeObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(numeroUsuarios, numeroUsuariosFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        String nombreUpdate = "Pepe Juan";
        String aliasUpdate = "Jose Juancho";
        String generoUpdate = "Masculino";
        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setNombre(nombreUpdate);
            personaje.setAlias(aliasUpdate);
            personaje.setGenero(generoUpdate);
            operacionesBd.actualizarPersonaje(personaje);
            Personajes usuarioEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje,usuarioEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getAlias(),usuarioEncontrado.getAlias(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(),usuarioEncontrado.getGenero(),MESSAGE_ERROR);

            operacionesBd.eliminarPersonaje(usuarioEncontrado);
        }catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }

    }

}
