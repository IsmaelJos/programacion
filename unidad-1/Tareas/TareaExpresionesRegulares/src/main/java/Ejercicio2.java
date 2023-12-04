import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        String numeroTelefono = pedirTexto();
        String regex = "(\\+[\\d]{2}-[\\d]{3}-[\\d]{2}-[\\d]{2}-[\\d]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeroTelefono);

        while (matcher.find()) {
            System.out.println("numero encontrado: " + matcher.group());
        }

    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
