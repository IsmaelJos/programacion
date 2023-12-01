import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar
 * y muestre un mensaje apropiado.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int diaDeLaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        if (diaDeLaSemana==7){
            System.out.println("es sabado");
        } else if (diaDeLaSemana==1) {
            System.out.println("es domingo");
        }
    }
}
