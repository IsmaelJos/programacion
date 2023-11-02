
import ies.puerto.Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void transposicionTest(){
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arrayFin = {{1,4,7},{2,5,8},{3,6,9}};
        int[][] resultado = ejercicio6.transposicion(array);
        Assertions.assertArrayEquals(arrayFin,resultado,"No se ha obtenido el resultado esperado");

    }

}
