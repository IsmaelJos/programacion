package es.ies.puerto.guia_pokmon.modelo.entidades;

import java.util.List;
import java.util.Objects;

public class Pokmon {
    int numero;
    String nombre;

    public Pokmon() {
    }

    public Pokmon(int numero) {
        this.numero = numero;
    }

    public Pokmon(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokmon pokmon = (Pokmon) o;
        return numero == pokmon.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
