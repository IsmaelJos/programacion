package ies.puertoCruz.abstracts;

import ies.puertoCruz.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {

    public int popularidad;
    @Override
    public boolean recomendarProducto() {
        if (popularidad<7){
            return false;
        }
        return true;
    }

    @Override
    public int popularidad() {
        return getPopularidad();
    }

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id);
        this.popularidad = popularidad;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
}
