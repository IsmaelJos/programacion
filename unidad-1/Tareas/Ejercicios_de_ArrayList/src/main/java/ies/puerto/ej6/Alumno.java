package ies.puerto.ej6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Float> calificaciones;

    public float media(){
        float resultado = 0;
        if (calificaciones.isEmpty()){
            return resultado;
        }
        for (float calificacion : calificaciones) {
            resultado += calificacion;
        }
        return resultado/calificaciones.size();
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
