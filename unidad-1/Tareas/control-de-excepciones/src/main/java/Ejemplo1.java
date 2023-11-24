import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Hola");
        try {
            File archivo = new File("archivo.txt");
            FileReader lector = new FileReader(archivo);
        }catch (ArithmeticException e){
            System.out.println("es una exepcion arigmetica");
        }catch (FileNotFoundException e){
            System.out.println("es una exepcion FileNotFound");
        }
    }
}
