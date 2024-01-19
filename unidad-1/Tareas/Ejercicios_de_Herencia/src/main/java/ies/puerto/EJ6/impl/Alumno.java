package ies.puerto.EJ6.impl;

import ies.puerto.EJ6.abstracto.Persona;

public class Alumno extends Persona {
    String nivel;

    public String estudiar(){
        return "el alumno esta estudiando";
    }

    public Alumno() {
    }

    public Alumno(String nombre, String fechaNac, String nivel) {
        super(nombre, fechaNac);
        this.nivel = nivel;
    }
}
