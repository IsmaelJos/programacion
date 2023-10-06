import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio8 {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Añada el primer numero de la cadena");
        int primero = scanner.nextInt();
        System.out.println("Añada el ultimo numero de la cadena");
        int ultimo = scanner.nextInt();
        while (primero < ultimo) {
            int suma = 0;
            int n;
            n = primero;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    suma = suma + i;
                }
            }
            if (suma == n) {
                System.out.println("Perfecto");
            } else {
                System.out.println("No es perfecto");

            }
            primero++;

        }
    }
}