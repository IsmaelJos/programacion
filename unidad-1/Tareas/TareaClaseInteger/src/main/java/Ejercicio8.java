import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = pedirNumero();
        double factorial = factorial(numero);
        System.out.println("el factorial de "+numero+" es "+factorial);
    }
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
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
