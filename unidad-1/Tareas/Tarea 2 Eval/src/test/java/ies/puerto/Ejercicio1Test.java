package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ies.puerto.Ejercicio1.invertir;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1;
    @BeforeEach
    public void before() {
        ejercicio1 = new Ejercicio1();
    }

    @Test
    public void invertirTest() {
        String texto = "1234567890";
        String resultado = invertir(texto);
        String resultadoEsperado = "0987654321";
        Assertions.assertEquals(resultado, resultadoEsperado , "No se ha obtenido el resultado esperado");
    }
}
