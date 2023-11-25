import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
 * y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String operacion = pedirOperacion();
        int resultado = resultOperacion(operacion);
        System.out.println(resultado);
    }
    public static String pedirOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade una operacion");
        String operacion = scanner.nextLine();
        return operacion;
    }
    public static int resultOperacion(String operacion){
        int num = 0;
        try{

        }
        catch (ArithmeticException e){
            System.out.println("Se ha encontrado un ArithmeticException");
        }
        return num;
    }
}
