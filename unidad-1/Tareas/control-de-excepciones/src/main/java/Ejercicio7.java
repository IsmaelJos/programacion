import java.util.Scanner;

/**
 * Crea un método que acepte un número y maneja la excepción IllegalArgumentException si el número es negativo.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = pedirNum();
    }
    public static int pedirNum(){
        System.out.println("Introduce un numero positivo");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        return numero;
    }
}
