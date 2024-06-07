package es.ies.puerto.guia_pokmon.modelo.entidades;

import java.util.Objects;

public class Evento {
    String nombre;
    String descripcion;
    String activacion;

    public Evento() {
    }

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public Evento(String nombre, String descripcion, String activacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activacion = activacion;
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

    public String getActivacion() {
        return activacion;
    }

    public void setActivacion(String activacion) {
        this.activacion = activacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombre, evento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
