import java.util.Calendar;

/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println("Fecha: " + mes + "-" + dia);
    }
}
