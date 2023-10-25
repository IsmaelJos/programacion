package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void determinarNumeroOkTest(){
        String resultado = ejercicio3.ordenarNumero(2,1,4,3,5);
        Assertions.assertEquals("2 1 4 2 5 | 1 2 3 4 5 | 5 4 3 2 1",resultado,"No se ha obtenido el resultado esperado");

    }
}
