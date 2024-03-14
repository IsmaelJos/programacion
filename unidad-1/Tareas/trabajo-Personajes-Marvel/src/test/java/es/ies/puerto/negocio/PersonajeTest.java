package es.ies.puerto.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    public void a (){
        System.out.println(poderes.toString());
        System.out.println(personaje.poderes.toString());
    }
    @Test
    public void toStringPersonaTest() {
        Assertions.assertTrue(personaje.toString().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(alias),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(genero),
                "El resultado no es el esperado");
        Assertions.assertTrue(personaje.toString().contains(poderes.toString()),
                "El resultado no es el esperado");
    }

}
