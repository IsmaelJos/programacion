package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio;
    int resultadoEsperado = 55;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
    }

    @Test
    public void ejercicio1RecursivaTest() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.sumaNaturalRecursiva(10));
    }

    @Test
    public void ejercicio1RecursivoTest() {
        Assertions.assertEquals(resultadoEsperado, ejercicio.sumaNumerosTradicional(10));
    }
}
