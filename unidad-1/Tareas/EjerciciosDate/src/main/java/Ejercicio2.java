import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss"
 * utilizando la clase SimpleDateFormat de DateFormat.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Date fecha = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println(fechaFormateada);
    }
}
