import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        System.out.println(texto.length());
    }
    public static String pedirTexto(){
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
