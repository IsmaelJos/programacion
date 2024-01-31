package es.ies.puerto.vehiculos;

import es.ies.puerto.vehiculos.Coche;
import es.ies.puerto.vehiculos.Motocicleta;

import java.util.ArrayList;
import java.util.HashSet;

public class Concesionario {
    HashSet<Coche> coches;
    ArrayList<Motocicleta> motocicletas;

    public boolean addMotocicleta(Motocicleta motocicleta){
        if(motocicletas.contains(motocicleta)){
            return false;
        }
        motocicletas.add(motocicleta);
        return true;
    }
    public boolean removeMotocicleta(Motocicleta motocicleta){
        if (motocicletas.isEmpty()){
            return false;
        }
        if(!motocicletas.contains(motocicleta)){
            return false;
        }
        motocicletas.remove(motocicleta);
        return true;
    }
    public Motocicleta obtenerMotocicleta(String matricula){
        Motocicleta motoBuscada = new Motocicleta("","",matricula,0);
        if (!motocicletas.contains(motoBuscada)){
            return null;
        }
        for (Motocicleta motocicleta: motocicletas){
            if (motoBuscada.equals(motocicleta)){
                return motocicleta;
            }
        }
        return null;
    }
    public float velocidadMediaMotocicletas(){
        float velocidadMedia = 0f;
        for (Motocicleta motocicleta : motocicletas){
            velocidadMedia += motocicleta.getVelocidad();
        }
        velocidadMedia = velocidadMedia/motocicletas.size();
        return velocidadMedia;
    }
    public boolean addCoche(Coche coche){
        if(coches.contains(coche)){
            return false;
        }
        coches.add(coche);
        return true;
    }

    public boolean removeCoche(Coche coche){
        if (coches.isEmpty()){
            return false;
        }
        if(!coches.contains(coche)){
            return false;
        }
        coches.remove(coche);
        return true;
    }
    public Coche obtenerCoche(String matricula){
        Coche cocheBuscado = new Coche("","",matricula,0);
        if (!coches.contains(cocheBuscado)){
            return null;
        }
        for (Coche coche : coches){
            if (cocheBuscado.equals(coche)){
                return coche;
            }
        }
        return null;
    }
    public float velocidadMediaCoches(){
        float velocidadMedia = 0f;
        for (Coche coche : coches){
            velocidadMedia += coche.getVelocidad();
        }
        velocidadMedia = velocidadMedia/coches.size();
        return velocidadMedia;
    }
    public float velocidadMediaVehiculos(){
        return (velocidadMediaCoches()+velocidadMediaMotocicletas())/2;
    }

    public HashSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Motocicleta> getMotocicletas() {
        return motocicletas;
    }

    public void setMotocicletas(ArrayList<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public Concesionario(HashSet<Coche> coches, ArrayList<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }
}
