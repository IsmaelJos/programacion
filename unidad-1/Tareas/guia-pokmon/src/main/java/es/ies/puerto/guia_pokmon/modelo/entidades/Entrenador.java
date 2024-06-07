package es.ies.puerto.guia_pokmon.modelo.entidades;

import java.util.List;

public class Entrenador {
    String nombre;
    String categoria;
    List<Pokmon> pokmons;

    public Entrenador() {
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador(String nombre, String categoria, List<Pokmon> pokmons) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.pokmons = pokmons;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Pokmon> getPokmons() {
        return pokmons;
    }

    public void setPokmons(List<Pokmon> pokmons) {
        this.pokmons = pokmons;
    }
}
