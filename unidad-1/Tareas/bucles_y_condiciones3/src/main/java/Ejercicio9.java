import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio9 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Añada el numero");
        int tabla = scanner.nextInt();
        for (int posicion = 0; posicion <= 10; posicion++) {
            int valor = posicion * tabla;
            System.out.println(posicion+" * "+tabla+" = "+valor);
        }

    }
}
