import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String strNumero = solicitarNumero();
        int numero = transformarStrInt(strNumero);
        System.out.println("valor de numero transformado " + numero);
    }


    public static String solicitarNumero(){
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un valor");
        numero = scanner.nextLine();
        return numero;
    }
    public static int transformarStrInt(String strNumero) throws Exception {
        int resultado = 0;
        try {
            resultado = Integer.parseInt(strNumero);
        }catch (NumberFormatException e){
            throw new Exception("El valor "+strNumero+" no es un numero");
        }

        return resultado;
    }
}
