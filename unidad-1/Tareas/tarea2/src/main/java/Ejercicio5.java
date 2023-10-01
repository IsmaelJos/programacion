import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 5
 */
public class Ejercicio5 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Añada dos valores");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int extra = 0;
        if (a>b) {
            extra = b;
            b=a;
            a=extra;
        } 
        System.out.println("Orden = "+a+" "+b);
    }
}