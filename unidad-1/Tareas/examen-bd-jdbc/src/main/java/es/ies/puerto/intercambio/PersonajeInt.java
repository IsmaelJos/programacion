package es.ies.puerto.intercambio;

import java.io.Serializable;
import java.util.Objects;

public class PersonajeInt implements Serializable {
    String id;
    AliasInt alias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AliasInt getAlias() {
        return alias;
    }

    public void setAlias(AliasInt alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeInt that = (PersonajeInt) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
