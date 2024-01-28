package ies.puerto.parte2.impl;

import ies.puerto.parte2.abstracto.Empleado;

public class Profesor extends Empleado {
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, String dni, String fechaNacimiento, float valor, String especialidad) {
        super(nombre, dni, fechaNacimiento, valor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
