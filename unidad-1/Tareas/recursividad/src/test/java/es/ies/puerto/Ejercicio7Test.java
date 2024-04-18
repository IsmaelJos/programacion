package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio7Test {
    Ejercicio7 ejercicio;
    List<Integer> resultadoEsperado;
    List<Integer> resultado;
    int num;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio7();
        resultadoEsperado = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        num = 10;
    }
    @Test
    public void ejercicioTest() {
        resultado = ejercicio.cuentaRegresiva(num);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void ejercicioRecursivaTest() {
        resultado = ejercicio.cuentaRegresivaRecursiva(num);
        Assertions.assertEquals(resultado,resultadoEsperado);
    }
}
