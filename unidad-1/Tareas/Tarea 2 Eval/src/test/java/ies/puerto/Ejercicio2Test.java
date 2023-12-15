package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ies.puerto.Ejercicio2.ContarVocales;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;

    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    public void ContarVocalesTest() {
        String texto = "abcdefghijk";
        int resultado = ContarVocales(texto);
        int resultadoEsperado = 3;
        Assertions.assertEquals(resultado, resultadoEsperado , "No se ha obtenido el resultado esperado");
    }
}
