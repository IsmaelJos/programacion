package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4Test {
    Ejercicio4 ejercicio;
    List<Integer> resultadoEsperado;
    List<Integer> resultadoEsperadoRecursivo;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio4();
        resultadoEsperado = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
        resultadoEsperadoRecursivo = new ArrayList<>(Arrays.asList(10,8,6,4,2,0));
    }

    @Test
    public void ejercicioTest() {
        Assertions.assertEquals(resultadoEsperado,ejercicio.paresTradicional(10));
    }

    @Test
    public void ejercicioTestRecursivo(){
        Assertions.assertEquals(resultadoEsperadoRecursivo,ejercicio.paresRecursivos(10));
    }
}
