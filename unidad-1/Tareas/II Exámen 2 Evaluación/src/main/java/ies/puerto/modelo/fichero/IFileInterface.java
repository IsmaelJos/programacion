package ies.puerto.modelo.fichero;

import ies.puerto.modelo.entity.Producto;

import java.util.List;

public interface IFileInterface {
    public boolean crearProducto(Producto producto);
    public boolean eliminarProducto(Producto producto);
    public List<Producto> obtenerProductos();
    public Producto obtenerProducto(Producto producto);
    public boolean actualizarProducto(Producto producto);
}
