import ies.puerto.Ejercicio7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void ordenarArrayAscTest(){
        int[] array = {3,1,2};
        int[] arrayCorrecto={1,2,3};
        int[] resultado = ejercicio7.ordenarArrayAsc(array);
        Assertions.assertArrayEquals(arrayCorrecto,resultado,"No se ha obtenido el resultado esperado");

    }
}
