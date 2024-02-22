package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.entity.Producto;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.List;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio(){fileCsv = new FileCsv();}
    public boolean buscarProducto(Producto producto, List<Producto> productos){
        if (productos.contains(producto)){
            return true;
        }
        return true;
    }
}
