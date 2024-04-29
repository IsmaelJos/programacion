package es.ies.puerto.intercambio;

import java.io.Serializable;
import java.util.Objects;

public class AliasInt implements Serializable {
    String id;
    String descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AliasInt aliasInt = (AliasInt) o;
        return Objects.equals(id, aliasInt.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
