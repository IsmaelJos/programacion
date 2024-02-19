package ies.puertoCruz.productos;

import ies.puertoCruz.abstracts.ProductoFresco;

public class Alimento extends ProductoFresco {

    @Override
    public int diasHastaCaducar() {
        return 0;
    }

    @Override
    public boolean caducado() {
        return false;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()+(getPrecio()*35)/100;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id, fechaCaducidad);
    }
}
