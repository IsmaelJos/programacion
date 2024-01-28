package ies.puerto.parte2.abstracto;

public abstract class Empleado extends Trabajador{

    public Empleado() {
    }

    public Empleado(String nombre, String dni, String fechaNacimiento, float valor) {
        super(nombre, dni, fechaNacimiento, valor);
    }


}
