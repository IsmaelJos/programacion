package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Soubenir extends Producto {
    @Override
    public float precioMaximo() {
        return super.precioMaximo()+super.precioMaximo()*0.4f;
    }

    public Soubenir(String nombre, float precio, String fechaEntrega, String udi) {
        super(nombre, precio, fechaEntrega, udi);
    }
}
