import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        String email = pedirTexto();
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("sigue el formato de fecha común");
        } else {
            System.out.println("no sigue el formato de fecha común");
        }
    }
    public static String pedirTexto(){
        System.out.println("Añada una fecha");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
