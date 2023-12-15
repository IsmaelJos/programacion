package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        int numVocales = ContarVocales(texto);
        System.out.println(texto);
        System.out.println(numVocales);
    }
    public static int ContarVocales (String texto){
        int numVocales = 0;
        String regex = "([AEIOUaeiou])";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            numVocales++;
        }
        return numVocales;
    }
    public static String pedirTexto(){
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
