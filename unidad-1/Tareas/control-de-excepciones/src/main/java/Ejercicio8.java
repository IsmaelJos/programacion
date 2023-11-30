import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números y realice la división. Maneja la excepción
 * InputMismatchException si el usuario ingresa algo que no es un número.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int divisor = pedirNumDivisor();
        int dividendo = pedirNumDividendo();
        int resultado = divNum(divisor,dividendo);
        System.out.println(resultado);
    }
    public static int pedirNumDivisor(){
        System.out.println("Introduce un numero para ser Divisor");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        return numero;
    }
    public static int pedirNumDividendo(){
        System.out.println("Introduce un numero para ser Dividendo");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Se ha producido un InputMismatchException");
        }
        return numero;
    }
    public static int divNum(int divisor, int dividendo){
        int resultado = divisor / dividendo;
        return resultado;
    }
}
