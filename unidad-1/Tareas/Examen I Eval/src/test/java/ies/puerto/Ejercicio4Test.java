package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ies.puerto.Ejercicio1.validarNumero;
import static ies.puerto.Ejercicio4.crearEstrella;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;

    @Test
    public void crearEstrellaTest() throws Exception {
        String resultado = crearEstrella(6);
        String resultadoEsperado =
                "   *   \n" +
                "  ***  \n" +
                " ***** \n" +
                "*******\n" +
                " ***** \n" +
                "  ***  \n" +
                "   *   \n";
        Assertions.assertEquals(resultadoEsperado,resultado,"Ha ocurrido un Error");
    }
    public void crearEstrellaTest2() throws Exception {
        String resultado = crearEstrella(10);
        String resultadoEsperado =
                "     *     \n" +
                "    ***    \n" +
                "   *****   \n" +
                "  *******  \n" +
                " ********* \n" +
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
}
