import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String nuevoTexto = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            nuevoTexto += texto.charAt(i);
        }
        System.out.println(nuevoTexto);
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
