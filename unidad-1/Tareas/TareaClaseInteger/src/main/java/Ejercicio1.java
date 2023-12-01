import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Integer numInteger = pedirNumero();
        if (numInteger%2 == 0){
            System.out.println(numInteger+" es un numero par");
        } else {
            System.out.println(numInteger+" es un numero impar");
        }
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
