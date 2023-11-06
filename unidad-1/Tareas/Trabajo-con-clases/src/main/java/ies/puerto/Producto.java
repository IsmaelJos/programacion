package ies.puerto;

public class Producto {
    private String nombre;
    private int precio;
    private int stock;

    public Producto(){}

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void agregarStock(int num){
        setStock(getStock()+num);
    }
    public void retirarStock(int num){
        setStock(getStock()-num);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
