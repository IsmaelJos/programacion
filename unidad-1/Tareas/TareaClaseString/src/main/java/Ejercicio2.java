import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto1 = pedirTexto();
        String texto2 = pedirTexto();
        Boolean esIgual = texto1.equals(texto2);
        if (esIgual){
            System.out.println("Son iguales");
        }else{
            System.out.println("son diferentes");
        }
    }
    public static String pedirTexto(){
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
