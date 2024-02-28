package ies.puerto.negocio.abstractas;

import ies.puertoCruz.productos.Alimento;
import ies.puertoCruz.productos.Aparato;
import ies.puertoCruz.productos.CuidadoPersonal;
import ies.puertoCruz.productos.Souvenir;

import java.util.HashMap;
import java.util.Map;

public class TiendaOld {
    Map<String, Alimento> alimentoHashMap;
    Map<String, Aparato> aparatoHashMap;
    Map<String, CuidadoPersonal> cuidadoPersonalHashMap;
    Map<String, Souvenir> souvenirHashMap;

    public Alimento getAlimento(String id) {
        return alimentoHashMap.get(id);
    }
    public boolean addAlimento(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad){
        if (getAlimento(id)==null){
            return false;
        }
        alimentoHashMap.put(id,new Alimento(nombre,precio,fechaEntrada,id,fechaCaducidad));
        return true;
    }
    public boolean removeAlimento(String id){
        if (getAlimento(id)!=null){
            return false;
        }
        alimentoHashMap.remove(id);
        return true;
    }
    public Aparato getAparato(String key) {
        return aparatoHashMap.get(key);
    }
    public boolean addAparato(String nombre, float precio, String fechaEntrada, String id){
        if (getAparato(id)==null){
            return false;
        }
        aparatoHashMap.put(id,new Aparato(nombre,precio,fechaEntrada,id));
        return true;
    }
    public boolean removeAparato(String id){
        if (getAparato(id)!=null){
            return false;
        }
        aparatoHashMap.remove(id);
        return true;
    }
    public CuidadoPersonal getCuidadoPersonal(String key) {
        return cuidadoPersonalHashMap.get(key);
    }
    public boolean addCuidadoPersonal(String nombre, float precio, String fechaEntrada, String id,int popularidad){
        if (getCuidadoPersonal(id)==null){
            return false;
        }
        cuidadoPersonalHashMap.put(id,new CuidadoPersonal(nombre,precio,fechaEntrada,id,popularidad));
        return true;
    }
    public boolean removeCuidadoPersonal(String id){
        if (getCuidadoPersonal(id)!=null){
            return false;
        }
        cuidadoPersonalHashMap.remove(id);
        return true;
    }
    public Souvenir getSouvenir(String key) {
        return souvenirHashMap.get(key);
    }
    public boolean addSouvenir(String nombre, float precio, String fechaEntrada, String id){
        if (getSouvenir(id)==null){
            return false;
        }
        souvenirHashMap.put(id,new Souvenir(nombre,precio,fechaEntrada,id));
        return true;
    }
    public boolean removeSouvenir(String id){
        if (getSouvenir(id)!=null){
            return false;
        }
        souvenirHashMap.remove(id);
        return true;
    }
    public float precioAlimentoTotal(){
        float sumaTotal = 0;
        for (Alimento alimento: alimentoHashMap.values()){
            if (!alimento.caducado()) {
                sumaTotal += alimento.getPrecio();
            }
        }
        return sumaTotal;
    }
    public float precioAparatoTotal(){
        float sumaTotal = 0;
        for (Aparato aparato: aparatoHashMap.values()){
            sumaTotal += aparato.getPrecio();
        }
        return sumaTotal;
    }
    public float precioCuidadoPersonalTotal(){
        float sumaTotal = 0;
        for (CuidadoPersonal cuidadoPersonal: cuidadoPersonalHashMap.values()){
            sumaTotal += cuidadoPersonal.getPrecio();
        }
        return sumaTotal;
    }
    public float precioSouvenirTotal(){
        float sumaTotal = 0;
        for (Souvenir souvenir: souvenirHashMap.values()){
            sumaTotal += souvenir.getPrecio();
        }
        return sumaTotal;
    }
    public float sumaTotalTienda(){
        return precioAlimentoTotal()+precioAparatoTotal()+precioCuidadoPersonalTotal()+precioSouvenirTotal();
    }

    public float gananciaAlimentoTotal(){
        float sumaTotal = 0;
        for (Alimento alimento: alimentoHashMap.values()){
            if (!alimento.caducado()) {
                sumaTotal += alimento.precioMaximo() - alimento.getPrecio();
            }
        }
        return sumaTotal;
    }
    public float gananciaAparatoTotal(){
        float sumaTotal = 0;
        for (Aparato aparato: aparatoHashMap.values()){
            sumaTotal += aparato.precioMaximo()-aparato.getPrecio();
        }
        return sumaTotal;
    }
    public float gananciaCuidadoPersonalTotal(){
        float sumaTotal = 0;
        for (CuidadoPersonal cuidadoPersonal: cuidadoPersonalHashMap.values()){
            sumaTotal += cuidadoPersonal.precioMaximo()-cuidadoPersonal.getPrecio();
        }
        return sumaTotal;
    }
    public float gananciaSouvenirTotal(){
        float sumaTotal = 0;
        for (Souvenir souvenir: souvenirHashMap.values()){
            sumaTotal += souvenir.precioMaximo()-souvenir.getPrecio();
        }
        return sumaTotal;
    }
    public float sumaGananciaTienda(){
        return gananciaAlimentoTotal()+gananciaAparatoTotal()+gananciaCuidadoPersonalTotal()+gananciaSouvenirTotal();
    }

    public float cantidadAlimeto(){
        return alimentoHashMap.size();
    }
    public float cantidadAparato(){
        return aparatoHashMap.size();
    }
    public float cantidadCuidadoPersonal(){
        return cuidadoPersonalHashMap.size();
    }
    public float cantidadSouvenir(){
        return souvenirHashMap.size();
    }
    public void cuidadoPersonalPopular(){
        for (CuidadoPersonal producto : cuidadoPersonalHashMap.values()){
            if(producto.recomendarProducto()){
                System.out.println(producto);
            }
        }
    }

    public TiendaOld(HashMap<String, Alimento> alimentoHashMap, HashMap<String, Aparato> aparatoHashMap, HashMap<String, CuidadoPersonal> cuidadoPersonalHashMap, HashMap<String, Souvenir> souvenirHashMap) {
        this.alimentoHashMap = alimentoHashMap;
        this.aparatoHashMap = aparatoHashMap;
        this.cuidadoPersonalHashMap = cuidadoPersonalHashMap;
        this.souvenirHashMap = souvenirHashMap;
    }

    public Map<String, Alimento> getAlimentoHashMap() {
        return alimentoHashMap;
    }

    public void setAlimentoHashMap(HashMap<String, Alimento> alimentoHashMap) {
        this.alimentoHashMap = alimentoHashMap;
    }

    public Map<String, Aparato> getAparatoHashMap() {
        return aparatoHashMap;
    }

    public void setAparatoHashMap(HashMap<String, Aparato> aparatoHashMap) {
        this.aparatoHashMap = aparatoHashMap;
    }

    public Map<String, CuidadoPersonal> getCuidadoPersonalHashMap() {return cuidadoPersonalHashMap;}

    public void setCuidadoPersonalHashMap(HashMap<String, CuidadoPersonal> cuidadoPersonalHashMap) {
        this.cuidadoPersonalHashMap = cuidadoPersonalHashMap;
    }

    public Map<String, Souvenir> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public void setSouvenirHashMap(HashMap<String, Souvenir> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "alimentoHashMap=" + alimentoHashMap +
                ", aparatoHashMap=" + aparatoHashMap +
                ", cuidadoPersonalHashMap=" + cuidadoPersonalHashMap +
                ", souvenirHashMap=" + souvenirHashMap +
                '}';
    }
}
