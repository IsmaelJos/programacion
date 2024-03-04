package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileCsvTest {
    FileCsv fileCsv;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach(){
        fileCsv = new FileCsv();
        personas = fileCsv.obtenerPersonas();
    }
    @Test
    public void obtenerPersonasTest(){
        Assertions.assertFalse(personas.isEmpty(),"");
    }
    @Test
    public void obtenerPersonaTest(){
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileCsv.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(),2);
        Assertions.assertNotNull(personaBuscar.getNombre(),"");
        Assertions.assertTrue(personaBuscar.getEdad()>0,"");
        Assertions.assertNotNull(personaBuscar.getEmail(),"");
    }
    @Test
    public void addPersonaTest(){
        String nombreInsertar = "otro";
        int edadInsertar = 99;
        String emailInsertar = "otro@email";
        int numPersonas = personas.size();
        Persona personaInsertar = new Persona(5,nombreInsertar,edadInsertar,emailInsertar);
        fileCsv.addPersona(personaInsertar);
        int numPersonaInsertar = personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar),"");
        Assertions.assertEquals(numPersonas+1 , numPersonaInsertar,"");
    }
}
