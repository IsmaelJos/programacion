package ies.puerto.ej3;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String identificador;
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

    public Aula(String identificador) {
        this.identificador = identificador;
        this.alumnos = new ArrayList<>();
    }

    public Aula(String identificador, List<Alumno> Alumnos) {
        this.identificador = identificador;
        this.alumnos = Alumnos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
