import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego
 * intente convertirla a un objeto Date. Maneja la excepción ParseException.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        String fechaStr = pedirFecha();
        Date fecha = fechaDate(fechaStr);
        System.out.println(fecha);
    }
    public static String pedirFecha(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha");
        String fecha = scanner.nextLine();
        return fecha;
    }

    public static Date fechaDate(String fecha) {
        SimpleDateFormat localDate = new SimpleDateFormat("dd/mm/yyyy");
        try {
            return localDate.parse(fecha);
        }catch (ParseException e){
            System.out.println("Ha ocurrido un ParseException");
        }
        return null;
    }
}
