import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        char letra = 'a';
        String nuevoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)==letra){
                nuevoTexto+="";
            }else {
                nuevoTexto+=texto.charAt(i);
            }
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
