import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        String cadena = pedirTexto();
        if (texto.startsWith(cadena)||texto.endsWith(cadena)){
            System.out.println("el texto empieza o termina por "+cadena);
        }else{
            System.out.println("el texto no empieza o termina por "+cadena);
        }
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
