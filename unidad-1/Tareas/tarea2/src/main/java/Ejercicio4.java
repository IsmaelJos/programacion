import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 4
 */
public class Ejercicio4 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Añada un valor");
        int numero = scanner.nextInt();
        if ( numero/2 == 0 ){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}