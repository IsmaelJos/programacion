package es.ies.puerto.modelo;

public class Poderes {
    private int id;
    private int personaje_id;
    private String poder;

    public Poderes(int id) {
        this.id = id;
    }

    public Poderes(int id, int personaje_id, String poder) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
}
