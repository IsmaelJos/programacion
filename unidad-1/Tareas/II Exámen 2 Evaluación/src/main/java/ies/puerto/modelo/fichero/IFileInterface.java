package ies.puerto.modelo.fichero;

import ies.puerto.modelo.entity.Producto;

import java.util.List;

public interface IFileInterface {
    public List<Producto> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
}
