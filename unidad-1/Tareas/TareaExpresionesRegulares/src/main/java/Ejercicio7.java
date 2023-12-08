import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String regex = "([A-Za-z]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        int contador = 0;
        while (matcher.find()) {
            contador++;
        }
        System.out.println("Se han encontrado "+contador+" palabras");
    }
    public static String pedirTexto(){
        System.out.println("Añada un texto");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
