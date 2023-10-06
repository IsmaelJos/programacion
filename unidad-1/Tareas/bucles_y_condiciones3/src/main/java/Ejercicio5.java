import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio5 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Añada la posicion");
        int pos = scanner.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 0;
        System.out.println( "pocicion 1 = "+fibo1);

        for (int i = 2; i <= pos; i++) {

            fibo3 = fibo2 + fibo1;
            System.out.println("pocicion " + i + " = " + fibo3);
            if (fibo1 < fibo2) {
                fibo1 = fibo3;
            } else {
                fibo2 = fibo3;
            }
        }
    }
}