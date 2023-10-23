package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void determinarNumeroOkTest(){
        String resultado = ejercicio2.determinarNumero(12);
        Assertions.assertEquals("",resultado,"No se ha obtenido el resultado esperado");

    }
}
