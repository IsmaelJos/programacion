import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Integer numero = pedirNumero();
        Integer sumaDigitos = sumaDigitos(numero);
        System.out.println(sumaDigitos);
    }
    public static Integer sumaDigitos(Integer numero){
        String numeroStr = numero.toString();
        int sumaDigitos = 0;
        for (int i = 0; i < numeroStr.length(); i++) {
            String siguienteNumero = numeroStr.substring(i, i+1);
            sumaDigitos += Integer.parseInt(siguienteNumero);
        }
        return sumaDigitos;
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
