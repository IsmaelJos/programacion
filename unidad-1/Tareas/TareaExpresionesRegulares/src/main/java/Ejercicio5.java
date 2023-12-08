import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String regex = "(<p>)([A-Z a-z]*)(<\\/p>)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            String textoCortado = matcher.group(2);
            System.out.println(textoCortado);
        }
    }
    public static String pedirTexto(){
        System.out.println("Añada el texto");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
// <p>Texto</p><p>Abadj</p><p>ajfni</p><p>Te txto</p><p>adk jn</p>
