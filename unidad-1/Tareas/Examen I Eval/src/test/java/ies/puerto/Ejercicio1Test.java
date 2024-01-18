package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ies.puerto.Ejercicio1.crearTrianguloInvertido;
import static ies.puerto.Ejercicio1.validarNumero;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1;

    @Test
    public void crearTrianguloInvertidoTest() throws Exception {
        String resultado = crearTrianguloInvertido(7);
        String resultadoEsperado =
                "*******\n" +
                " ***** \n" +
                "  ***  \n" +
                "   *   \n" ;
        Assertions.assertEquals(resultadoEsperado,resultado,"Ha ocurrido un Error");

    }
    @Test
    public void crearTrianguloInvertidoTest2() throws Exception {
        String resultado = crearTrianguloInvertido(10);
        String resultadoEsperado =
                                "***********\n" +
                                " ********* \n" +
                                "  *******  \n" +
                                "   *****   \n" +
                                "    ***    \n" +
                                "     *     \n";
        Assertions.assertEquals(resultadoEsperado,resultado,"Ha ocurrido un Error");
    }
    @Test
    public void validarNumeroTest() throws Exception {
        String resultado = validarNumero(6);
        String resultadoEsperado = "El numero es Valido";
        Assertions.assertEquals(resultadoEsperado,resultado,"Ha ocurrido un Error");
    }
    @Test
    public void validarNumeroTest2() throws Exception {
        String resultado = validarNumero(2);
        String resultadoEsperado = "El numero agregado es menor a 6";
        Assertions.assertEquals(resultadoEsperado,resultado,"Ha ocurrido un Error");
    }
}
