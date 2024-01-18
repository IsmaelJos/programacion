package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {

    public static void main(String[] args) {
        Persona persona = new Persona("Paco","19/7/2022");
    }
}

class Persona{
    private String nombre;
    private Date fechaNacimiento;

    public int calcularEdad(){

        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        Calendar fechaDif = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);
        fechaDif.set(
                fechaActual.get(Calendar.YEAR)-fechaNac.get(Calendar.YEAR),
                fechaActual.get(Calendar.MONTH)-fechaNac.get(Calendar.MONTH),
                fechaActual.get(Calendar.DAY_OF_MONTH)-fechaNac.get(Calendar.DAY_OF_MONTH)
        );


        return 0;
    }

    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String fechaNacimiento) throws ParseException {
        this.nombre = nombre;
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimientoForm = formatoFecha.parse(formatoFecha.format(fechaNacimiento));
        this.fechaNacimiento = fechaNacimientoForm;
    }



}