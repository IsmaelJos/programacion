package es.ies.puerto.vehiculos;

import es.ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo {

    @Override
    public int velocidadMaxima() {
        return 180;
    }

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

}
