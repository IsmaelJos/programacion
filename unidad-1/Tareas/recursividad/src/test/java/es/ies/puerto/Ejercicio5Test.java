package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio;
    int base = 2;
    int exponente = 3;
    int resultadoEsperado = 8;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();
    }

    @Test
    public void ejercicio5TradicionalTest() {
        int resultado = ejercicio.potenciaTradicional(base,exponente);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void ejercicio5RecursivoTest() {
        int resultado = ejercicio.potenciaRecursividad(base,exponente);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
}
