package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1=new Ejercicio1();

    @Test
    public void busquedaBinariaTest(){
        int numBuscado = 8;
        int resultadoOk = 6;
        int[] array = {1,2,4,5,7,8};
        int resultado = ejercicio1.busquedaBinaria(array,numBuscado);
        Assertions.assertEquals(resultadoOk,resultado,"No se ha obtenido el resultado esperado");

    }


}
