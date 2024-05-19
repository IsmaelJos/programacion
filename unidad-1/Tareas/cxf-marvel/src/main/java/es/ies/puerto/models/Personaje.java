package es.ies.puerto.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;
import java.util.Set;
@XmlRootElement
public class Personaje {
    private String id;
    private String nombre;
    private String genero;
    private String alias;
    private String equipamientos;
    private String poderes;

    public Personaje() {
    }

    public Personaje(String id) {
        this.id = id;
    }

    public Personaje(String id, String nombre, String genero, String alias, String equipamientos, String poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(String equipamientos) {
        this.equipamientos = equipamientos;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias='" + alias + '\'' +
                ", equipamientos='" + equipamientos + '\'' +
                ", poderes='" + poderes + '\'' +
                '}';
    }
}
