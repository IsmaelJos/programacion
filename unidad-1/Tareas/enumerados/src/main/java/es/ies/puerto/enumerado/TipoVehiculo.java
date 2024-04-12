package es.ies.puerto.enumerado;

public enum TipoVehiculo {
    COCHE(1), MOTOCICLETA(2), CAMIÓN(3), BICICLETA(4), ETC(5);

    int tipo;

    TipoVehiculo(int tipo) {
        this.tipo = tipo;
    }
    TipoVehiculo(){}

    public int getTipo() {
        return tipo;
    }
}
