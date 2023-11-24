import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("Hola");

        File archivo = new File("archivo.txt");

        System.out.println("voy a generar un null pointer "+archivo.getName());
    }
}
