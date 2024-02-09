package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.regex.Pattern;

public class Alimento extends Producto {

    @Override
    public float precioMaximo() {
        return super.precioMaximo()+super.precioMaximo()*0.23f;
    }

    public float diasDisponible() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaEntrega = sdf.parse(getFechaEntrega());
        long diferenciaMilisegundos = new java.util.Date().getTime() - fechaEntrega.getTime();
        float diferenciaDias = ((((diferenciaMilisegundos/1000)/60)/60)/24);
        return diferenciaDias;
    }
    /*
    private static boolean comiezaPorA(String cadena) {
        String regexp = "^[a|A].*";
        if (Pattern.matches(regexp,cadena)){
            return true;
        }
        return false;
    }
    */
    public boolean caducado() throws ParseException {
        if (diasDisponible()>30){
            return true;
        }
        return false;
    }

    public Alimento(String nombre, float precio, String fechaEntrega, String udi) {
        super(nombre, precio, fechaEntrega, udi);
    }
}
