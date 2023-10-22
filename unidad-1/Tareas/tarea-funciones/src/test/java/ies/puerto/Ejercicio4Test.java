package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }
    @Test
    public void calcularCuadradoTest() {
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        int resultadoOk = 5;
        int resultado = ejercicio4.maximoDosNumeros(num1,num2,num3);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }

}