package es.ies.puerto.vehiculos;

import es.ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo {
    @Override
    public int velocidadMaxima() {
        return 120;
    }

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

}
