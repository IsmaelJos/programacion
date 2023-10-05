import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio Bucles_Y_Condiciones1
 */
public class Bucles_Y_Condiciones1 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        int promedio=0;
        int acumula=0;
        int cuenta=0;
        int n = 0;
        System.out.println("Añada varios valores, para terminar use 0");
        do{
            n = scanner.nextInt();
            if (n!=0){
                cuenta+=1;
                acumula+=n;
            }
        }while(n!=0);
        promedio = acumula / cuenta;
        System.out.println("Promedio "+promedio);
    }
}