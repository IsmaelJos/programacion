import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Integer num = pedirNumero();
        String respuesta = valor(num);
        System.out.println("El numero "+num+" es "+respuesta);
    }
    public static String valor(Integer num){
        String respuesta = "";
        int result = num.compareTo(0);
        switch (result){
            case -1: respuesta = "negativo";
            break;
            case 0: respuesta = "cero";
            break;
            case 1: respuesta = "positivo";
            break;
        }
        return respuesta;
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
