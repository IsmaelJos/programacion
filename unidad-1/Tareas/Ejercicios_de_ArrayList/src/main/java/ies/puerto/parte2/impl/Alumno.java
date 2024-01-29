package ies.puerto.parte2.impl;

import ies.puerto.parte2.abstracto.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno extends Persona{
    private List<Nota> notas;

    public float media(){
        float resultado = 0f;
        if (notas.isEmpty()){
            return resultado;
        }
        for (Nota nota:notas) {
            resultado += nota.getValor();
        }
        resultado = resultado/notas.size();
        return resultado;
    }

    public Alumno() {
        notas = new ArrayList<>();
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
