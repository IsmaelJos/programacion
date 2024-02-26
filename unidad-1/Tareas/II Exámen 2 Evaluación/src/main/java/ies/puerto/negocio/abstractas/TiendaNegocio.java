package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.entity.*;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.*;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio(){fileCsv = new FileCsv();}
    public boolean buscarProducto(Producto producto, List<Producto> productos){
        if (productos.contains(producto)){
            return true;
        }
        return true;
    }

    private List<Alimento> alimentos;
    private Set<Aparato> aparatos;
    private Map<String, Souvenir> soubenirs;
    private List<CuidadoPersonal> cuidados;


    public List<Producto> obtenerAlimentos() {
        return fileCsv.obtenerAlimentos();
    }

    public Set<Producto> obtenerAparatos() {
        return new HashSet<>(fileCsv.obtenerAparatos());
    }

    public Map<String,Producto> obtenerSouvenirs() {
        List<Producto> souvenirsList = fileCsv.obtenerSouvenirs();
        HashMap<String,Producto> soubenirsMap= new HashMap<>();
        for (Producto producto:souvenirsList) {
            soubenirsMap.put(producto.getId(),producto);
        }
        return soubenirsMap;
    }
    public List<Producto> obtenerCuidados() {return fileCsv.obtenerCuidados();}

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.addAll(fileCsv.obtenerAlimentos());
        productos.addAll(fileCsv.obtenerAparatos());
        productos.addAll(fileCsv.obtenerSouvenirs());
        productos.addAll(fileCsv.obtenerCuidados());
        return productos;
    }

    public boolean crearAlimento(Alimento alimento){

        if (fileCsv.obtenerAlimentos().contains(alimento)){
            return true;
        }
        return fileCsv.escritura("alimento", alimento.toCsv());
    }

}
