/** package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {
        Eventos evento = new Eventos("Fiesta","18/12/2023");
        System.out.println(evento.informacion());
    }

}
class Eventos{
    private String nombre;
    private String fecha;


    public String informacion(){
        return this.nombre + this.fecha;
    }
    public void eventoProximo(){
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = new Date(calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.MONTH),calendar.get(Calendar.YEAR));

    }

    public Eventos() {
    }

    public Eventos(String nombre) throws Exception {
        if (nombre.length()>20){
            throw new Exception("El nombre de el evento tiene que tener menos de 20 caracteres");
        }
        this.nombre = nombre;
        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("dd/MM/aaaa");
        Date fecha = new Date(calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.MONTH),calendar.get(Calendar.YEAR));
        String newFecha = fecha.toString();
        this.fecha = String.valueOf(format.parse(newFecha));
    }

    public Eventos(String nombre, String fecha) throws Exception {
        if (nombre.length()>20){
            throw new Exception("El nombre de el evento tiene que tener menos de 20 caracteres");
        }
        this.nombre = nombre;

        this.fecha = fecha;
    }
}
**/