import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio10 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Añada el numero");
        int ultimo = scanner.nextInt();
        int contador=0;
        int suma = 0;
        do {
            contador++;
            if (contador%2 == 0) {
                suma+=contador;
            }
        }while(contador!=ultimo);
        System.out.println("la suma es de "+suma);
    }
}
