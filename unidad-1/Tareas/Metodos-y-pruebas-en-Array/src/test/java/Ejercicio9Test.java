import ies.puerto.Ejercicio9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {
    Ejercicio9 ejercicio9 = new Ejercicio9();

    @Test
    public void joinArrayTest(){
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[][] resultCorrecto = {{1,2,3},{4,5,6}};
        int[][] resultado = ejercicio9.joinArray(array1,array2);
        Assertions.assertEquals(resultCorrecto,resultado,"No se ha obtenido el resultado esperado");

    }
}
