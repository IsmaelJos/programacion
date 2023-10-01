import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 3
 */
public class Ejercicio3 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        int sumatoria = 0;
        for (int i = 0; i < 11; i++) {
            sumatoria+=i;
        }
        System.out.println("Suma en bucle for: "+sumatoria);
        
        int sumatoria2 = 0;
        int suma = 0;
        
        while ( suma < 10){
            
            suma += 1;
            sumatoria2 += suma;


        }
        System.out.println("Suma en bucle while: "+sumatoria2);
    }
}