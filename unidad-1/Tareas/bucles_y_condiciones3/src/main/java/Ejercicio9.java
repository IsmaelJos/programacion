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
        for (int i = 0; i <= 10; i++) {
            int valor = i * tabla;
            System.out.println(i+" * "+tabla+" = "+valor);
        }

    }
}
