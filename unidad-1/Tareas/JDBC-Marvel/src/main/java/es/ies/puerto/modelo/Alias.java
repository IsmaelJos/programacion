package es.ies.puerto.modelo;

import java.util.Objects;

public class Alias {
    private int id;
    private int personaje_id;
    private String alias;

    public Alias(int id) {
        this.id = id;
    }

    public Alias(int id, int personaje_id, String alias) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return id == alias.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Alias{" +
                "id=" + id +
                ", personaje_id=" + personaje_id +
                ", alias='" + alias + '\'' +
                '}';
    }
}
