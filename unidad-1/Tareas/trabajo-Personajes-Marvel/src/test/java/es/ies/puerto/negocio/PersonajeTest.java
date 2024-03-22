package es.ies.puerto.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PersonajeTest {
    String nombre = "Iron Man";
    String alias = "Tony Stark";
    String genero = "Masculino";
    List<String> poderes = Arrays.asList("Vuelo","Armadura tecnológica avanzada","Rayos láser");
    Personaje personaje;

    @BeforeEach
    public void beforeEach() {
        personaje = new Personaje(nombre, alias, genero, poderes);
    }
    @Test
    public void createPersonaTest() {
        Assertions.assertNotNull(personaje, "El objeto no puede ser nulo");
    }


    @Test
    public void toStringPersonajeTest() {
        Assertions.assertTrue(personaje.toString().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(genero),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(poderes.toString()),
                "El resultado no es el esperado");
    }
    @Test
    public void toCsvPersonajeTest() {
        Assertions.assertTrue(personaje.toCsv().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(genero),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(String.join(",",poderes)),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toCsv().contains(personaje.DELIMITADOR),
                "El resultado no es el esperado");
    }
    @Test
    public void equalsPersonaTest() {
        Personaje personajeBuscar = new Personaje(nombre);
        Assertions.assertEquals(personajeBuscar, personaje,
                "las personas deben de ser iguales");
    }
    @Test
    public void personaToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/datosTest.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void xmlToPersonaTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/datosTest.xml");
            Personaje persona = serializer.read(Personaje.class, file);
            Assertions.assertEquals(nombre, persona.getNombre(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(alias, persona.getAlias(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(genero, persona.getGenero(),
                    "No se ha obtenido el valor esperado");
            Assertions.assertEquals(poderes, persona.getPoderes(),
                    "No se ha obtenido el valor esperado");

        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
