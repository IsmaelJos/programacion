package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5;

    @BeforeEach
    public void before() {
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void verificarPrimoTest() {
        int num = 23;
        boolean resultadoOk = true;
        boolean resultado = ejercicio5.verificarPrimo(num);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}