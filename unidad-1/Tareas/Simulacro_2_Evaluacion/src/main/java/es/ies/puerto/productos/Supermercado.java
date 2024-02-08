package es.ies.puerto.productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermercado {
    HashSet<Alimento> alimentos;
    ArrayList<Electronica> electronicas;
    HashMap<String,Soubenir> soubenirs;

    public boolean addAlimento(Alimento alimento){

        alimentos.add(alimento);
        return true;
    }
    public boolean removeAlimento(Alimento alimento){

        alimentos.remove(alimento);
        return true;
    }
    public Alimento obtenerAlimento(String udi){
        Alimento alimentoBuscado = new Alimento("",0,"",udi);

        for (Alimento alimento:alimentos) {
            if (alimento.equals(alimentoBuscado)){
                return alimento;
            }
        }
        return null;
    }
    public boolean addElectronica(Electronica electronica){
        if (electronicas.contains(electronica)){
            return true;
        }
        electronicas.add(electronica);
        return true;
    }
    public boolean removeElectronica(Electronica electronica){
        if (!electronicas.contains(electronica)){
            return true;
        }
        electronicas.remove(electronica);
        return true;
    }
    public Electronica obtenerElectronica(String udi){
        Electronica electronicaBuscado = new Electronica("",0,"",udi);
        if(!electronicas.contains(electronicaBuscado)){
            return null;
        }
        for (Electronica electronica:electronicas) {
            if (electronica.equals(electronicaBuscado)){
                return electronica;
            }
        }
        return null;
    }
    public boolean addSoubenir(Soubenir soubenir){
        soubenirs.put(soubenir.getUdi(),soubenir);
        return true;
    }
    public boolean removeSoubenir(String key){
        soubenirs.remove(key);
        return true;
    }
    public Soubenir obtenerSoubenir(String key){
        return soubenirs.get(key);
    }
    public HashSet<Alimento> obtenerAlimientosCaducados(){
        HashSet<Alimento> alimentosCaducados = new HashSet<>();
        for (Alimento alimento:alimentos){
            if (alimento.caducado()){
                alimentosCaducados.add(alimento);
            }
        }
        return alimentosCaducados;
    }
    public float precioAlimentos(){
        float precio = 0;
        for (Alimento alimento : alimentos){
            precio += alimento.getPrecio();
        }
        return precio;
    }
    public float precioElectronica(){
        float precio = 0;
        for (Electronica electronica : electronicas){
            precio += electronica.getPrecio();
        }
        return precio;
    }

    public float precioSoubenirs(){
        float precio = 0;
        //for (Soubenir soubenir : soubenirs){
        //    precio += soubenir.getPrecio();
        //}
        return precio;
    }
    public float precioProductos (){
        return precioAlimentos() + precioElectronica() + precioSoubenirs();
    }

    public Supermercado(HashSet<Alimento> alimentos, ArrayList<Electronica> electronicas, HashMap<String, Soubenir> soubenirs) {
        this.alimentos = alimentos;
        this.electronicas = electronicas;
        this.soubenirs = soubenirs;
    }
}
