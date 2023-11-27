import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
 * y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int operacion = pedirOperacion();
        System.out.println(operacion);
    }
    public static int pedirOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade una operacion");
        int operacion = 0;
        try{
            operacion = scanner.nextInt();
        }catch (ArithmeticException n){
            System.out.println("Ha habido una ArithmeticException");
        }

        return operacion;
    }

}
