package ies.puerto.parte2.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Aula() {
        alumnos = new ArrayList<>();
    }

    public Aula(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(nombre, aula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
