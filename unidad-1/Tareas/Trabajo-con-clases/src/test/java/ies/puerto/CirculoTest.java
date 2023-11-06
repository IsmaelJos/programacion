package ies.puerto;

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
        int radio = 9;
        double resultadoOK = 254.47;
        double resultado = Circulo.areaCirculo();
    }
}
