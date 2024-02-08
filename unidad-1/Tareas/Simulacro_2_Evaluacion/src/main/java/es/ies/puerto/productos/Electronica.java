package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Electronica extends Producto {
    @Override
    public float precioMaximo() {
        return super.precioMaximo()+super.precioMaximo()*0.6f;
    }

    public Electronica(String nombre, float precio, String fechaEntrega, String udi) {
        super(nombre, precio, fechaEntrega, udi);
    }
}
