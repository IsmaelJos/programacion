package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void ordenamientoBurbujaTest(){
        int[] array = {3,5,1,8,4};
        int[] arrayOK = {1,3,4,5,8};
        ejercicio2.ordenamientoBurbuja(array);
        Assertions.assertArrayEquals(arrayOK,array,"No se ha obtenido el resultado esperado");
    }

}
