package es.ies.puerto.guia_pokmon.modelo.entidades;

import java.util.Objects;

public class Objeto {
    String nombre;
    String descripcion;
    String efecto;

    public Objeto() {
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public Objeto(String nombre, String descripcion, String efecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(nombre, objeto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
