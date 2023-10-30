
import ies.puerto.Ejercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mayorTest(){
        int[] array = {1, 2, 3, 4, 5};
        String resultado = ejercicio4.pares(array);
        Assertions.assertEquals("2,4,",resultado,"No se ha obtenido el resultado esperado");

    }
}
