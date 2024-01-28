package ies.puerto.parte2.abstracto;

public abstract  class Trabajador extends Persona {
    private String nombre;
    private float valor;


    public Trabajador() {
    }

    public Trabajador(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Trabajador(String nombre, String dni, String fechaNacimiento, float valor) {
        super(nombre, dni, fechaNacimiento);
        this.valor = valor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

