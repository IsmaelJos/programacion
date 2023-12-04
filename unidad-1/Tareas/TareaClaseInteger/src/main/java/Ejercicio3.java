import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = pedirNumero();
        Boolean resultado = esPrimo(numero);
        if (resultado){
            System.out.println("el numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }
    }
    public static boolean esPrimo(int numero){
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static Integer pedirNumero(){
        System.out.println("Añada un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (InputMismatchException n){
            System.out.println("introduzca un numero");
        }
        return numero;
    }
}
