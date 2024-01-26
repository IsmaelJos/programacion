package ies.puerto.ej6;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String Nombre;
    private List<Alumno> alumnos;

    public float media(){
        float resultado = 0f;

        if (alumnos.isEmpty()){
            return resultado;
        }

        for (Alumno alumnos: alumnos){
            resultado += alumnos.media();
        }
        return resultado/ alumnos.size();
    }

    public Curso(String nombre) {
        Nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
    }

    public Curso(String nombre, List<Alumno> alumnos) {
        Nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
