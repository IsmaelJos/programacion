
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.
 */
public class Ejercicio6 {
    public static void main(String[] args) throws ParseException {
        Date fecha1 = fecha1();
        Date fecha2 = fecha2();
        int diferencia = fecha1.compareTo(fecha2);
        if (diferencia == 0){
            System.out.println(fecha1+" y "+fecha2+" son iguales");
        }else{
            System.out.println(fecha1+" y "+fecha2+" son diferentes");
        }
    }
    public static Date fecha1() throws ParseException {
        Date fecha = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaSinTiempo = formatter.parse(formatter.format(fecha));
        return fechaSinTiempo;
    }
    public static Date fecha2() throws ParseException {
        Date fecha = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaSinTiempo = formatter.parse(formatter.format(fecha));
        return fechaSinTiempo;
    }
}
