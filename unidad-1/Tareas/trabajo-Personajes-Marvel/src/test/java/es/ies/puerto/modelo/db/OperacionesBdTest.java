package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.negocio.PersonajeDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    PersonajeDB personaje;
    int id = 3;
    String nombre = "Hulk";
    String alias = "Bruce Banner";
    String genero = "Masculino";
    List<String> poderes = Arrays.asList("Fuerza","Salto","Resistencia");
    @BeforeEach
    public void beforeEach() {
        operacionesBd = new OperacionesBd(urlBd);
        personaje = new PersonajeDB(id,nombre,alias,genero,poderes);
    }
    @Test
    public void obtenerPoderesTest(){
        try {
            List<String> poderes = operacionesBd.obtenerPoderes("1");
            Assertions.assertNotNull(poderes, MESSAGE_ERROR);
            Assertions.assertEquals(3,poderes.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }

    }
    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<PersonajeDB> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void obtenerUsuarioTest() {
        PersonajeDB perosnaje = new PersonajeDB(1);
        try {
            perosnaje = operacionesBd.obtenerPersonaje(perosnaje);
            Assertions.assertNotNull(perosnaje, MESSAGE_ERROR);
            Assertions.assertNotNull(perosnaje.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(perosnaje.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(perosnaje.getPoderes(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void insertarEliminarUsuarioTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerPersonajes().size();
            operacionesBd.addPersonaje(personaje);
            PersonajeDB usuarioObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, usuarioObtenido, MESSAGE_ERROR);
            //
            operacionesBd.deletePersonaje(usuarioObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(numeroUsuarios, numeroUsuariosFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    /*@Test
    public void actualizarUsuarioTest() {
        String nombreUpdate = "Pepe Juan";
        String generoUpdate = "masculino";
        String aliasUpdate = "Jose";
        try {
            operacionesBd.addPersonaje(personaje);
            personaje.setNombre(nombreUpdate);
            personaje.setAlias(aliasUpdate);
            personaje.setGenero(generoUpdate);
            operacionesBd.updatePersonaje(personaje);
            PersonajeDB usuarioEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje,usuarioEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getAlias(),usuarioEncontrado.getAlias(),MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(),usuarioEncontrado.getGenero(),MESSAGE_ERROR);

            operacionesBd.deletePersonaje(usuarioEncontrado);
        }catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }
    }*/
}
