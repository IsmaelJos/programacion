import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio3 {

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

        for (int i = 0; i <= pos - 2; i++) {

            fibo3 = fibo2 + fibo1;
            if (fibo1 < fibo2) {
                fibo1 = fibo3;
            }else {
                fibo2 = fibo3;
            }

        }




        System.out.println(fibo3);
    }
}