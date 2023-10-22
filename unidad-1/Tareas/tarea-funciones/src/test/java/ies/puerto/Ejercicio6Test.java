package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6;

    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void verificarPrimoTest() {
        int fahrenheit = 41;
        int resultadoOk = 5;
        int resultado = ejercicio6.fahrenheitACelsius(fahrenheit);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}