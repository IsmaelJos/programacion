import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 6
 */
public class Ejercicio6 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {
        int j = 2;
        int s = 0;
        System.out.println("Añada un valor");
        int n = scanner.nextInt();
        while (j<=(n/2)){
            if(n/j==0) {
                s=s+1;
                j=j+1;
            }
        }
        if(s==0){
           System.out.println(n+" es primo"); 
        }else{
            System.out.println(n+" no es primo");
        }
    }
}