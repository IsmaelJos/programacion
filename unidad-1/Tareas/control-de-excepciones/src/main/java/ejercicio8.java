import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números y realice la división. Maneja la excepción
 * InputMismatchException si el usuario ingresa algo que no es un número.
 */
public class ejercicio8 {
    public static void main(String[] args) {
        int num1 = pedirNum();
        int num2 = pedirNum();
        int resultado = divNum(num1,num2);
        System.out.println(resultado);
    }
    public static int pedirNum(){
        System.out.println("Introduce un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Se ha producido un InputMismatchException");
        }
        return numero;
    }
    public static int divNum(int num1, int num2){
        int resultado = resultado = num1 / num2;
        return resultado;
    }
}
