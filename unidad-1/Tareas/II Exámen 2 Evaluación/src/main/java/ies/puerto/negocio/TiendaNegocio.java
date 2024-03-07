package ies.puerto.negocio;

import ies.puerto.modelo.entity.*;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.*;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio() {
        fileCsv = new FileCsv();
        alimentos = new ArrayList<>();
        aparatos = new HashSet<>();
        souvenirs = new HashMap<>();
        cuidados = new ArrayList<>();
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

    // CRUD Alimentos

    public boolean existeAlimento(Producto producto){
        return alimentos.contains(producto);
    }

    public boolean crearAlimento(Producto producto) {
        if (!existeAlimento(producto)){
            alimentos.add(producto);
        }
        return true;
    }

    public boolean eliminarAlimento(Producto producto) {
        alimentos.remove(producto);
        return true;
    }



    public Producto obtenerAlimento(Producto producto) {
        if (existeAlimento(producto)){
            int posicion = alimentos.indexOf(producto);
            return alimentos.get(posicion);
        }
        return null;
    }

    public boolean actualizarAlimento(Producto producto) {
        if (existeAlimento(producto)){
            int posicion = alimentos.indexOf(producto);
            alimentos.set(posicion,producto);
            return true;
        }
        return false;
    }
    //CRUD Aparatos

    public boolean existeAparato(Producto producto){
        return aparatos.contains(producto);
    }

    public boolean crearAparato(Producto producto) {
        if (!existeAparato(producto)){
            aparatos.add(producto);
        }
        return true;
    }

    public boolean eliminarAparato(Producto producto) {
        aparatos.remove(producto);
        return true;
    }



    public Producto obtenerAparato(Producto producto) {
        if (existeAparato(producto)){
            for (Producto producto2 : aparatos) {
                if (producto2.equals(producto)){
                    return producto2;
                }
            }
        }
        return null;
    }

    public boolean actualizarAparato(Producto producto) {
        if (existeAparato(producto)){
            for (Producto producto2 : aparatos) {
                if (producto2.equals(producto)){
                    aparatos.remove(producto2);
                    aparatos.add(producto);
                }
            }
        }
        return false;
    }

    //CRUD Souvenirs

    public boolean existeSouvenir(Producto producto){
        return souvenirs.containsKey(producto.getId());
    }

    public boolean crearSouvenir(Producto producto) {
        if (!existeSouvenir(producto)){
            souvenirs.put(producto.getId(), producto);
        }
        return true;
    }

    public boolean eliminarSouvenir(Producto producto) {
        souvenirs.remove(producto.getId());
        return true;
    }



    public Producto obtenerSouvenir(Producto producto) {
        if (existeSouvenir(producto)){
            return souvenirs.get(producto.getId());
        }
        return null;
    }

    public boolean actualizarSouvenir(Producto producto) {
        if (existeSouvenir(producto)){
            souvenirs.replace(producto.getId(),producto);
            return true;
        }
        return false;
    }

    //CRUD Cuidados

    public boolean existeCuidado(Producto producto){
        return cuidados.contains(producto);
    }

    public boolean crearCuidado(Producto producto) {
        if (!existeCuidado(producto)){
            alimentos.add(producto);
        }
        return true;
    }

    public boolean eliminarCuidado(Producto producto) {
        alimentos.remove(producto);
        return true;
    }



    public Producto obtenerCuidado(Producto producto) {
        if (existeCuidado(producto)){
            int posicion = alimentos.indexOf(producto);
            return alimentos.get(posicion);
        }
        return null;
    }

    public boolean actualizarCuidado(Producto producto) {
        if (existeCuidado(producto)){
            int posicion = alimentos.indexOf(producto);
            alimentos.set(posicion,producto);
            return true;
        }
        return false;
    }

    //FIN CRUD

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

        if (buscarAlimento(alimento.getId())!=null){
            return false;
        }

        alimentos.add(alimento);

        if (fileCsv.obtenerAlimentos().contains(alimento)){
            return true;
        }
        return fileCsv.escritura("alimento", alimento.toCsv());
    }
    public boolean anadirAparato(Aparato aparato){

        if (buscarAparato(aparato.getId())!=null){
            return false;
        }

        aparatos.add(aparato);

        if (fileCsv.obtenerAparatos().contains(aparato)){
            return true;
        }
        return fileCsv.escritura("aparato", aparato.toCsv());
    }

    public boolean anadirSouvenir(Souvenir souvenir){

        if (buscarSouvenir(souvenir.getId())!=null){
            return false;
        }

        souvenirs.put(souvenir.getId(),souvenir);

        if (fileCsv.obtenerSouvenirs().contains(souvenir)){
            return true;
        }
        return fileCsv.escritura("souvenir", souvenir.toCsv());
    }

    public boolean anadirCuidados(CuidadoPersonal cuidadoPersonal){

        if (buscarCuidado(cuidadoPersonal.getId())!=null){
            return false;
        }

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
