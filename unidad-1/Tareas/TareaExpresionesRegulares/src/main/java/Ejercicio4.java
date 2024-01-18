import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://regexr.com/
public class Ejercicio4 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String regex = "([A-Z][a-z]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("numero encontrado: " + matcher.group());
        }
    }
    public static String pedirTexto(){
        System.out.println("Añada un texto");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
