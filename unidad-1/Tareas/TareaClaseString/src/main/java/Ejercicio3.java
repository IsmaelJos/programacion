import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidadVocales = 0;
        String texto = pedirTexto();
        char[] vocales = {'a','e','i','o','u'};
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (texto.charAt(i)==vocales[j]){
                    cantidadVocales++;
                }
            }
        }
        System.out.println("La cantidad de vocales es "+cantidadVocales);
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
