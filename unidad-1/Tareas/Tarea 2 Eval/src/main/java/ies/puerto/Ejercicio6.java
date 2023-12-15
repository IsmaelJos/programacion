package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio6 {

    public static void main(String[] args) throws ParseException {
        evento nuevoEvento = new evento("Comida familiar", "18/12/2023");
        String detallles = nuevoEvento.informacion();
        System.out.println(detallles);
    }
}
class evento{
    private String nombre;
    private String fecha;


    public boolean estaProximo() throws ParseException {
        Calendar fechaCalendar = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        fechaCalendar.setTime(formatoFecha.parse(fecha));
        int diffDias = (int)( (fechaCalendar.getTime().getTime() - calendar.getTime().getTime()) / (1000 * 60 * 60 * 24));
        if (diffDias>=7){
            return true;
        }
        return false;
    }
    public String informacion() throws ParseException {
        boolean alarma = estaProximo();
        if (alarma){
            System.out.println("El evento ocurrira proximamente");
        }
        String informacion = nombre+"\n"+fecha;
        return informacion;
    }
    public evento() {}
    public evento(String nombre) {
        this.nombre = nombre;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH)+1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.fecha = dia+"/"+mes+"/"+anio;
    }
    public evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }
}
