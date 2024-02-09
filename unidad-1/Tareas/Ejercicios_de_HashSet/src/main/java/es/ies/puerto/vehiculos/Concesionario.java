package es.ies.puerto.vehiculos;

import es.ies.puerto.vehiculos.Coche;
import es.ies.puerto.vehiculos.Motocicleta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Concesionario {
    private HashSet<Coche> coches;
    private ArrayList<Motocicleta> motocicletas;
    private HashMap<String, Camion> camiones;
    private HashMap<String, Bicicleta> bicicletas;

    /**
     * MOTOCICLETA
     */

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

    /**
     * COCHE
     */

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

    /**
     * CAMION
     */



    public boolean existeCamion(Camion camion){
        if(camiones.isEmpty()){
            return false;
        }
        if(!camiones.containsKey(camion.getMatricula())){
            return false;
        }
        return true;
    }

    public Camion obtenerCamion(String matricula){
        return camiones.get(matricula);
    }

    public boolean addCamion(Camion camion){
        if (!existeCamion(camion)){
            camiones.put(camion.getMatricula(),camion);
            return true;
        }
        return false;
    }

    public boolean removeCamion(Camion camion){
        if (existeCamion(camion)){
            camiones.remove(camion.getMatricula());
            return true;
        }
        return false;
    }
    public float velocidadMediaCamiones(){
        float velocidadMedia = 0f;
        for (Camion camion : camiones.values()){
            velocidadMedia += camion.getVelocidad();
        }
        velocidadMedia = velocidadMedia/camiones.size();
        return velocidadMedia;
    }

    /**
     * BICICLETA
     */
    public boolean existeBicicleta(Bicicleta bicicleta){
        if(bicicletas.isEmpty()){
            return false;
        }
        if(!bicicletas.containsKey(bicicleta.getMatricula())){
            return false;
        }
        return true;
    }

    public Bicicleta obtenerBicicleta(String matricula){
        return bicicletas.get(matricula);
    }

    public boolean addBicicleta(Bicicleta bicicleta){
        if (!existeBicicleta(bicicleta)){
            bicicletas.put(bicicleta.getMatricula(),bicicleta);
        }
        return false;
    }
    public boolean removeBicicleta(Bicicleta bicicleta){
        if (existeBicicleta(bicicleta)){
            bicicletas.remove(bicicleta.getMatricula());
        }
        return false;
    }
    public float velocidadMediaBicicletas(){
        float velocidadMedia = 0f;
        for (Bicicleta bicicleta : bicicletas.values()){
            velocidadMedia += bicicleta.getVelocidad();
        }
        velocidadMedia = velocidadMedia/bicicletas.size();
        return velocidadMedia;
    }


    public float velocidadMediaVehiculos(){
        return (velocidadMediaCoches()+
                velocidadMediaMotocicletas()+
                velocidadMediaCamiones()+
                velocidadMediaBicicletas())
                /4;
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

    public HashMap<String, Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(HashMap<String, Camion> camiones) {
        this.camiones = camiones;
    }

    public HashMap<String, Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(HashMap<String, Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public Concesionario(HashSet<Coche> coches, ArrayList<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
        this.camiones = new HashMap<>();
        this.bicicletas = new HashMap<>();
    }

    public Concesionario(HashMap<String, Camion> camiones, HashMap<String, Bicicleta> bicicletas) {
        this.coches = new HashSet<>();
        this.motocicletas = new ArrayList<>();
        this.camiones = camiones;
        this.bicicletas = bicicletas;
    }

    public Concesionario(HashSet<Coche> coches, ArrayList<Motocicleta> motocicletas, HashMap<String, Camion> camiones, HashMap<String, Bicicleta> bicicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
        this.camiones = camiones;
        this.bicicletas = bicicletas;
    }
}
