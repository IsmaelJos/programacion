import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String regex = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);



    }
    public static String pedirTexto(){
        System.out.println("Añada un texto de 8 digitos con letras mayusculas, minusculas y numeros");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
// ([A-Z]{1,6}[a-z]{1,6}[1-9]{1,6})