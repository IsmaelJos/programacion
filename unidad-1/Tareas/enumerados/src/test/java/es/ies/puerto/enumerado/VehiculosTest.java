package es.ies.puerto.enumerado;

import org.junit.jupiter.api.Test;

public class VehiculosTest {
    TipoVehiculo tipoVehiculo;
    @Test
    public void cehiculoBiciTest(){
        tipoVehiculo = TipoVehiculo.BICICLETA;
        System.out.println(tipoVehiculo.getTipo());
    }
}
