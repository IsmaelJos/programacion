package es.ies.puerto.modelo;

public class Poderes {
    private int id;
    private String poder;

    public Poderes(int id) {
        this.id = id;
    }

    public Poderes(int id, String poder) {
        this.id = id;
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
}
