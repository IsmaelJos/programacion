package es.ies.puerto.modelo;

public class Usuarios extends Persona{

    public Usuarios(String id) {
        super(id);
    }

    public Usuarios(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }


}
