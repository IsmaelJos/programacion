import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String regex = "(\\b4\\d{3}-\\d{4}-\\d{4}-\\d{4}\\b)|(\\b4\\d{3} \\d{4} \\d{4} \\d{4}\\b)|(\\b4\\d{15}\\b)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        if (matcher.matches()) {
            System.out.println("formato correcto con visa "+ texto);
        } else {
            System.out.println("formato incorrecto con visa "+ texto);
        }
    }
    public static String pedirTexto(){
        System.out.println("Añada el numero de visa");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
// 4005 5500 0000 0001