import java.time.Duration;
import java.util.Calendar;

/**
 * Escribir un programa que calcule la diferencia en días entre dos fechas utilizando la clase Calendar.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Calendar fecha1 = fecha1();
        Calendar fecha2 = fecha2();
        long days = Duration.between(fecha1.toInstant(), fecha2.toInstant()).toDays();
        System.out.println(days);
    }
    public static Calendar fecha1(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -2);
        return calendar;
    }
    public static Calendar fecha2(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, +2);
        return calendar;
    }
}
