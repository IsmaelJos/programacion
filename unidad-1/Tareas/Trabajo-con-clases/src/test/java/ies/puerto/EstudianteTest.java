package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    Estudiante estudiante;

    @BeforeEach
    public void before(){
        estudiante = new Estudiante();
    }

    @Test
    public void aprobadoTest(){
        boolean resultadoOk = true;
        Estudiante estudiante1 = new Estudiante("Juan",19,"Letras",7);
        boolean resultado = estudiante1.Aprobado();
        Assertions.assertEquals(resultadoOk,resultado,"No se ha obtenido el resultado esperado");
    }
}
