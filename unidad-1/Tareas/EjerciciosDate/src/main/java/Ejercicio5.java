import java.util.Calendar;

/**
 * Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, +1);
            int año = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH)+1;
            int dia = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println("Fecha actual: " + año + "-" + mes + "-" + dia);
    }
}
