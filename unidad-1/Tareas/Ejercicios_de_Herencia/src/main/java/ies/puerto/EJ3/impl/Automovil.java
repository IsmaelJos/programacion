package ies.puerto.EJ3.impl;

import ies.puerto.EJ3.abstracto.Conductor;
import ies.puerto.EJ3.interfaz.IConductor;

public class Automovil extends Conductor implements IConductor{

    @Override
    public String arrancar() {
        return "Se ha arrancado el Automovil";
    }

    @Override
    public String detener() {
        return "Se ha detenido el Automovil";
    }
    public String conducir(){
        return "Estas conduciendo el Automovil";
    }
}
