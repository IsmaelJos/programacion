package es.ies.puerto.enumerado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColoresArcoirisTest {
    ColoresArcoiris coloresArcoiris;

    @BeforeEach
    public void beforeEach(){
    }
    @Test
    public void colorArcoirisRojo(){
        coloresArcoiris = ColoresArcoiris.ROJO;
        System.out.println(coloresArcoiris);
        Assertions.assertEquals(coloresArcoiris.toString(),ColoresArcoiris.ROJO.toString());
    }
}
