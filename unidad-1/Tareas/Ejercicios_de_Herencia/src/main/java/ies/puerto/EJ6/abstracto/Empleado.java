package ies.puerto.EJ6.abstracto;

import ies.puerto.EJ6.interfaz.ITrabajador;

public abstract class Empleado extends Persona implements ITrabajador {
    float salario;

    public abstract float salario();

    public abstract String toString();
    @Override
    public String trabajar() {
        return "el empleado esta trabajando";
    }


    public Empleado(){}

    public Empleado(String nombre, String fechaNac, float salario) {
        super(nombre, fechaNac);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
