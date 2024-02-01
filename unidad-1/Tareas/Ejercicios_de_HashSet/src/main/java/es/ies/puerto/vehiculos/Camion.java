package es.ies.puerto.vehiculos;

import es.ies.puerto.abstractas.Vehiculo;

public class Camion extends Vehiculo {
    @Override
    public int velocidadMaxima() {return 160;}

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
}
