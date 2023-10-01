import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 7
 */
public class Ejercicio7 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Añada un valor en kilómetros por hora");
        int vel = scanner.nextInt();
        int versal = (vel*100)/3600;
        System.out.println("Son "+versal+" metros por segundo");
    }
}