import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer num1 = pedirNumero();
        String num2 = pedirTexto();
        String num1String = intToString(num1);
        int num2Int = stringToInt(num2);
        System.out.println(num1String + " " +num2Int);
    }
    public static String intToString(Integer numero){
        String numeroString = numero.toString();
        return numeroString;
    }
    public static int stringToInt(String texto){
        int num = Integer.parseInt(texto);
        return num;
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
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
