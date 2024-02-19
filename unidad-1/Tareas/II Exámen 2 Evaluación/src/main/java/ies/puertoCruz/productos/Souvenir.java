package ies.puertoCruz.productos;

import ies.puertoCruz.abstracts.Producto;

public class Souvenir extends Producto {

    @Override
    public float precioMaximo() {
        return getPrecio()+(getPrecio()*35)/100;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public Souvenir(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }
}
