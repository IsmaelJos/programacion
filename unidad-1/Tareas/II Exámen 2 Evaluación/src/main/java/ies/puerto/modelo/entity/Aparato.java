package ies.puerto.modelo.entity;

public class Aparato extends Producto {

    @Override
    public float precioMaximo() {
        return getPrecio()+(getPrecio()*42)/100;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public Aparato(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }
}
