import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio Ejercicio1
 */
public class Ejercicio1 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        int numero = 1;
        int nPorLinea = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < nPorLinea; j++) {
                System.out.print(numero+" ");
                numero++;
            }
            nPorLinea++;
            System.out.println(" ");
        }

    }
}