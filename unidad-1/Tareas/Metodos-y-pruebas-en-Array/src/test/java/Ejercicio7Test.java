import ies.puerto.Ejercicio7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void ordenarArrayAscTest(){
        int[] array = {3,1,2};
        String resultado = ejercicio7.ordenarArrayAsc(array);
        Assertions.assertEquals("1,2,3,",resultado,"No se ha obtenido el resultado esperado");

    }
}
