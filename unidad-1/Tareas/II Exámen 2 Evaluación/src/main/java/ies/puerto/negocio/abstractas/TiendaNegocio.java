package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.entity.*;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.*;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio() {fileCsv = new FileCsv();}
    public boolean buscarProducto(Producto producto, List<Producto> productos){
        if (productos.contains(producto)){
            return true;
        }
        return true;
    }

    private List<Producto> alimentos;
    private Set<Producto> aparatos;
    private Map<String, Producto> souvenirs;
    private List<Producto> cuidados;


    public List<Producto> obtenerAlimentosCsv() {
        return fileCsv.obtenerAlimentos();
    }

    public Set<Producto> obtenerAparatosCsv() {
        return new HashSet<>(fileCsv.obtenerAparatos());
    }

    public Map<String,Producto> obtenerSouvenirsCsv() {
        List<Producto> souvenirsList = fileCsv.obtenerSouvenirs();
        HashMap<String,Producto> soubenirsMap= new HashMap<>();
        for (Producto producto:souvenirsList) {
            soubenirsMap.put(producto.getId(),producto);
        }
        return soubenirsMap;
    }
    public List<Producto> obtenerCuidadosCsv() {return fileCsv.obtenerCuidados();}

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.addAll(fileCsv.obtenerAlimentos());
        productos.addAll(fileCsv.obtenerAparatos());
        productos.addAll(fileCsv.obtenerSouvenirs());
        productos.addAll(fileCsv.obtenerCuidados());
        return productos;
    }

    public void leerAlimentos(){
        for (Producto producto : alimentos){
            System.out.println(producto.toString());
        }
    }
    public void leerAparatos(){
        for (Producto producto : aparatos){
            System.out.println(producto.toString());
        }
    }
    public void leerSouvenirs(){
        for (Producto producto : souvenirs.values()){
            System.out.println(producto.toString());
        }
    }
    public void leerCuidados(){
        for (Producto producto : cuidados){
            System.out.println(producto.toString());
        }
    }

    public boolean anadirAlimento(Alimento alimento){

        alimentos.add(alimento);

        if (fileCsv.obtenerAlimentos().contains(alimento)){
            return true;
        }
        return fileCsv.escritura("alimento", alimento.toCsv());
    }
    public boolean anadirAparato(Aparato aparato){

        aparatos.add(aparato);

        if (fileCsv.obtenerAparatos().contains(aparato)){
            return true;
        }
        return fileCsv.escritura("aparato", aparato.toCsv());
    }

    public boolean anadirSouvenir(Souvenir souvenir){

        souvenirs.put(souvenir.getId(),souvenir);

        if (fileCsv.obtenerSouvenirs().contains(souvenir)){
            return true;
        }
        return fileCsv.escritura("souvenir", souvenir.toCsv());
    }

    public boolean anadirCuidados(CuidadoPersonal cuidadoPersonal){

        cuidados.add(cuidadoPersonal);

        if (fileCsv.obtenerCuidados().contains(cuidadoPersonal)){
            return true;
        }
        return fileCsv.escritura("souvenir", cuidadoPersonal.toCsv());
    }

    public Producto buscarAlimento(String key){
        for (Producto alimento : alimentos){
            if (alimento.getId().equals(key)){
                return alimento;
            }
        }
        return null;
    }

    public Producto buscarAparato(String key){
        for (Producto aparato : aparatos){
            if (aparato.getId().equals(key)){
                return aparato;
            }
        }
        return null;
    }

    public Producto buscarSouvenir(String key){
        return souvenirs.get(key);
    }

    public Producto buscarCuidado(String key){
        for (Producto cuidado : cuidados){
            if (cuidado.getId().equals(key)){
                return cuidado;
            }
        }
        return null;
    }




    public List<Producto> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Producto> alimentos) {
        this.alimentos = alimentos;
    }

    public Set<Producto> getAparatos() {
        return aparatos;
    }

    public void setAparatos(Set<Producto> aparatos) {
        this.aparatos = aparatos;
    }

    public Map<String, Producto> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(Map<String, Producto> souvenirs) {
        this.souvenirs = souvenirs;
    }

    public List<Producto> getCuidados() {
        return cuidados;
    }

    public void setCuidados(List<Producto> cuidados) {
        this.cuidados = cuidados;
    }
}
