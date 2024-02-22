package ies.puerto.modelo.entity;

public class CuidadoPersonal extends ProductoRecomendable {



    @Override
    public float precioMaximo() {
        return getPrecio()+(getPrecio()*80)/100;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public boolean recomendarProducto() {
        return super.recomendarProducto();
    }

    @Override
    public int popularidad() {
        return super.popularidad();
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id,int popularidad) {
        super(nombre, precio, fechaEntrada, id,popularidad);
    }
}
