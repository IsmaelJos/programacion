package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.IProducto;

import java.util.Objects;

public abstract class Producto implements IProducto {

    private String nombre;
    private float precio;
    private String fechaEntrega;
    private String udi;

    @Override
    public float precioMaximo() {
        return precio;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public Producto(String nombre, float precio, String fechaEntrega, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrega = fechaEntrega;
        this.udi = udi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(udi, producto.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", udi='" + udi + '\'' +
                '}';
    }

}
