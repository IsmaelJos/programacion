import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String textoTrimed = texto.trim();
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
