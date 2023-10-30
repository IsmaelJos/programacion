import ies.puerto.Ejercicio5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void mayorTest(){
        String resultado = ejercicio5.buscar(3);
        Assertions.assertEquals("2",resultado,"No se ha obtenido el resultado esperado");

    }
}
