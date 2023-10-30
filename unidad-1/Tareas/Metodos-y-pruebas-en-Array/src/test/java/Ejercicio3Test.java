
import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void mayorTest(){
        int[] array = {1, 2, 3, 4, 5};
        float resultado = ejercicio3.mayor(array);
        Assertions.assertEquals(5,resultado,"No se ha obtenido el resultado esperado");

    }
    @Test
    public void menorTest(){
        int[] array = {1, 2, 3, 4, 5};
        float resultado = ejercicio3.menor(array);
        Assertions.assertEquals(1,resultado,"No se ha obtenido el resultado esperado");

    }

}
