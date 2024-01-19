package ies.puerto.EJ6.impl;

import ies.puerto.EJ6.abstracto.Empleado;
import ies.puerto.EJ6.abstracto.Persona;

public class Profesor extends Empleado {

    String Especialidad;

    @Override
    public float salario() {
        return getSalario();
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+", fecha nacimiento: "+getFechaNac()+", salario: "+getSalario()+", especialidad: "+getEspecialidad();
    }

    public String impartirClase(){
        return "El profesor esta impartiendo clases";
    }

    public Profesor() {
    }

    public Profesor(String nombre, String fechaNac, float salario, String especialidad) {
        super(nombre, fechaNac, salario);
        Especialidad = especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
