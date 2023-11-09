package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circulo;
    @BeforeEach
    public void before(){
        circulo = new Circulo();
    }
    @Test
    public void areaCirculoTest(){
        double resultadoOK = 254.46900494077323;
        Circulo circulo1 = new Circulo(9);
        double resultado = circulo1.areaCirculo();
        Assertions.assertEquals(resultadoOK,resultado,"No se ha obtenido el resultado esperado");
    }
    @Test
    public void perimetroCirculoTest(){
        double resultadoOK = 56.548667764616276;
        Circulo circulo1 = new Circulo(9);
        double resultado = circulo1.perimetroCirculo();
        Assertions.assertEquals(resultadoOK,resultado,"No se ha obtenido el resultado esperado");
    }
}
