package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.archivos.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FileCsvTest {

    String aliasInsertar = "Tony Stonk";
    String generoInsertar = "Masculino";
    List<String> poderesInsertar = Arrays.asList("Vuelo","Armadura tecnológica avanzada","Rayos láser");
    List<Personaje> personajes;
    ICrud persistencia;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileCsv();
        personajes = persistencia.obtenerPersonajes();
    }
    @Test
    public void obtenerPersonajesTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }
    @Test
    public void obtenerPersonajeTest() {
        Personaje personajeBuscar = new Personaje("Spider-Man");
        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.getNombre(),"Spider-Man",
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getAlias(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull (personajeBuscar.getGenero(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getPoderes(),
                "No se ha obtenido el valor esperado");
    }
    @Test
    public void addDeletePersonajeTest() {

        int numPersonajesInicial = personajes.size();
        Personaje personajeInsertar = new Personaje("Mid Man", aliasInsertar,
                generoInsertar,poderesInsertar);
        persistencia.addPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personajeInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonajesInicial +1 ,
                numPersonajesInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesBorrado = personajes.size();
        Assertions.assertEquals(numPersonajesInicial ,
                numPersonajesBorrado,
                "No se ha obtenido el numero esperado");
    }
    @Test
    public void actualizarPersonaje() {
        String nombreActualizar = "Bonk Man";
        Personaje personajeBuscar = new Personaje(nombreActualizar);
        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeBuscar);
        Personaje personaBackup = persistencia.obtenerPersonaje(personajeBuscar);
        personajeActualizar.setAlias(aliasInsertar);
        personajeActualizar.setGenero(generoInsertar);
        personajeActualizar.setPoderes(poderesInsertar);
        persistencia.updatePersonaje(personajeActualizar);

        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.toString(), personajeActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersonaje(personaBackup);
    }
}
