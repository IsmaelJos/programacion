package es.ies.puerto.modelo;

import java.util.Objects;

public class Personajes_Poderes {
    private int personaje_id;
    private int poder_id;

    public Personajes_Poderes(int personaje_id, int poder_id) {
        this.personaje_id = personaje_id;
        this.poder_id = poder_id;
    }

    public int getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public int getPoder_id() {
        return poder_id;
    }

    public void setPoder_id(int poder_id) {
        this.poder_id = poder_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personajes_Poderes that = (Personajes_Poderes) o;
        return personaje_id == that.personaje_id && poder_id == that.poder_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personaje_id, poder_id);
    }
}

