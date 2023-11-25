import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego
 * intente convertirla a un objeto Date. Maneja la excepción ParseException.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        String fechaStr = pedirFecha();
        LocalDate fecha = fechaDate(fechaStr);
        System.out.println(fecha);
    }
    public static String pedirFecha(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha");
        String Fecha = scanner.nextLine();
        return Fecha;
    }

    public static LocalDate fechaDate(String fecha) {
        LocalDate localDate = null;
        /*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        try {
            localDate = LocalDate.parse(fecha, formatter);
        }catch (ParseException e){
            System.out.println("Se ha encontrado un error ParseException, la fecha no esta puesta correctamente");
        }

         */
        return localDate;
    }
}
