package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.entity.Producto;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio(){fileCsv = new FileCsv();}
    public boolean buscarProducto(Producto producto, List<Producto> productos){
        if (productos.contains(producto)){
            return true;
        }
        return true;
    }
    List<Producto> obtenerAlimentos() {
        return fileCsv.obtenerAlimentos();
    }

    Set<Producto> obtenerAparatos() {return fileCsv.obtenerAparatos();}

    Map<String,Producto> obtenerSouvenirs() {return fileCsv.obtenerSouvenirs();}

    List<Producto> obtenerCuidados() {return fileCsv.obtenerCuidados();}

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.addAll(fileCsv.obtenerAlimentos());
        productos.addAll(fileCsv.obtenerAparatos());
        productos.addAll(fileCsv.obtenerSouvenirs());
        productos.addAll(fileCsv.obtenerCuidados());
        return productos;
    }


}
