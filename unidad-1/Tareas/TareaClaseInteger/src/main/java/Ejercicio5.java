import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int resultado = mcd(num1, num2);
        System.out.println("El MCD de "+num1+" y "+num2+" es "+resultado);
    }
    public static int mcd (int num1, int num2){
        int temporal;
        while (num2 != 0) {
            temporal = num2;
            num2 = num1 % num2;
            num1 = temporal;
        }
        return num1;
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

