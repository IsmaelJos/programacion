package es.ies.puerto.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PersonajesTest {
    String nombre = "Iron Man";
    String alias = "Tony Stark";
    String genero = "Masculino";
    List<String> poderes = Arrays.asList("Vuelo","Armadura tecnológica avanzada","Rayos láser");
    Personaje personaje;
    Personajes personajes;
    @BeforeEach
    public void beforeEach() {
        personajes =new Personajes();
        personaje = new Personaje(nombre, alias, genero, poderes);
    }
    @Test
    public void personajesToXml() {

        Persister serializer = new Persister();
        try {
            serializer.write(personaje, new File("src/main/resources/persona.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void xmlToPersonasTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/datos.xml");
            Personajes personajes = serializer.read(Personajes.class, file);
            Assertions.assertNotNull(personajes,
                    "Se ha obtenido un valor nulo");
            Assertions.assertTrue(!personajes.getPersonajes().isEmpty(),
                    "No ha obtenido una lista vacia");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
