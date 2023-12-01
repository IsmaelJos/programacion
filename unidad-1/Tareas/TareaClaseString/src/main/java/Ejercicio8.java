import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String textoMayus = texto.toUpperCase();
        String textoMinus = texto.toLowerCase();
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
