package ies.puerto.parte2.impl;

import ies.puerto.parte2.abstracto.Persona;

import java.util.List;

public class Alumno extends Persona{
    private List<Nota> notas;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
