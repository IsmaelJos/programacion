import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat.
 */
public class Ejercicio8 {
    public static void main(String[] args) throws ParseException {
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        String fechaString = "18-11-23";
        Date fecha = formatoFecha.parse(fechaString);
        System.out.println(fecha);
    }
}
