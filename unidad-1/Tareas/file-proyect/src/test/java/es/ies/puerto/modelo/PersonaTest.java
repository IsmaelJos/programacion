package es.ies.puerto.modelo;

import es.ies.puerto.modelo.file.FileCsv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonaTest {

    int id = 1;
    String nombre = "nombre";
    int edad = 12;
    String email = "test@cat.com";
    Persona persona;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach(){
        persona = new Persona(id,nombre,edad,email);
        personas = new ArrayList<>();
        personas.add(persona);
    }

    @Test
    public void createPersonaTest(){
        Assertions.assertNotNull(persona,"");
    }
    @Test
    public void toStringPersonaTest(){
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),"");
        Assertions.assertTrue(persona.toString().contains(nombre),"");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),"");
        Assertions.assertTrue(persona.toString().contains(email),"");
    }
    @Test
    public void equalsPersonaTest(){
        Persona personaBuscar = new Persona(id);
        Assertions.assertEquals(personaBuscar,persona,"");
    }
    @Test
    public void toCsvPersonaTest(){
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),"");
        Assertions.assertTrue(persona.toCsv().contains(nombre),"");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),"");
        Assertions.assertTrue(persona.toCsv().contains(email),"");
        Assertions.assertTrue(persona.toCsv().contains(persona.DELIMITADOR),"");
    }

}
