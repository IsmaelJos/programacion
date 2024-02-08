package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Alimento extends Producto {

    @Override
    public float precioMaximo() {
        return super.precioMaximo()+super.precioMaximo()*0.23f;
    }

    public int diasDisponible(){

        return 0;
    }

    public boolean caducado(){
        if (diasDisponible()>30){
            return true;
        }
        return false;
    }

    public Alimento(String nombre, float precio, String fechaEntrega, String udi) {
        super(nombre, precio, fechaEntrega, udi);
    }
}
