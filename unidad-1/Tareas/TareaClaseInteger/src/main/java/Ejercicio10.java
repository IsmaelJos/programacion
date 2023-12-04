import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String numString = pedirTexto();
        int num = stringToInt(numString);
        System.out.println(num);
    }
    public static int stringToInt(String texto){
        int num = 0;
        try {
            num = Integer.parseInt(texto);
        }catch (NumberFormatException e){
            System.out.println("introduzca un numero");
        }
        return num;
    }
    public static String pedirTexto(){
        System.out.println("Añada una palabra");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}
