package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.archivos.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FileJsonTest {
    String aliasInsertar = "Tony Stonk";
    String generoInsertar = "Masculino";
    List<String> poderesInsertar = Arrays.asList("Vuelo","Armadura tecnológica avanzada","Rayos láser");
    List<Personaje> personajes;
    ICrud persistencia;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileJson();
        personajes = persistencia.obtenerPersonajes();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }
    @Test
    public void obtenerPersonaTest() {
        Personaje personaBuscar = new Personaje("Iron Man");
        personaBuscar = persistencia.obtenerPersonaje(personaBuscar);
        Assertions.assertEquals(personaBuscar.getNombre(),"Iron Man",
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getAlias(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getGenero(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getPoderes(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonaTest() {

        int numPersonasInicial = personajes.size();
        Personaje personaInsertar = new Personaje("Stonk man", aliasInsertar,
                generoInsertar,poderesInsertar);
        persistencia.addPersonaje(personaInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personaInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personaInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonasBorrado = personajes.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }
    @Test
    public void actualizarPersona() {
        String nombreActualizar = "Iron Man";
        Personaje personajeBuscar = new Personaje(nombreActualizar);
        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeBuscar);
        Personaje personajeBackup = persistencia.obtenerPersonaje(personajeBuscar);
        personajeActualizar.setAlias(aliasInsertar);
        personajeActualizar.setGenero(generoInsertar);
        personajeActualizar.setPoderes(poderesInsertar);
        persistencia.updatePersonaje(personajeActualizar);

        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.toString(), personajeActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersonaje(personajeBackup);
    }
}
