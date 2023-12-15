package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ies.puerto.Ejercicio3.sumDigitos;


public class Ejercicio3Test {
    Ejercicio3 ejercicio3;

    @BeforeEach
    public void before() {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void sumDigitosTest() {
        int num = 255;
        int resultado = sumDigitos(num);
        int resultadoEsperado = 12;
        Assertions.assertEquals(resultado, resultadoEsperado , "No se ha obtenido el resultado esperado");
    }
}
