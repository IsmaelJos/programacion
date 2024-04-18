package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio;
    int resultadoEsperado;
    int num;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio6();
        resultadoEsperado = 55;
        num = 9;
    }

    @Test
    public void ejercicioTest() {
        int resultado = ejercicio.fibonacci(num);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void ejercicioRecursivoTest() {
        int resultado = ejercicio.fibonacci(num);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
}
