package ies.puerto.EJ3.app;

import ies.puerto.EJ3.abstracto.Conductor;
import ies.puerto.EJ3.impl.Automovil;
import ies.puerto.EJ3.interfaz.IConductor;

public class AppConductor {
    static Automovil automovil;
    static IConductor automovil2;
    static Conductor automovil3;

    public static void main(String[] args) {
        automovil = new Automovil();
        System.out.println(automovil.detener());
        System.out.println(automovil.arrancar());
        System.out.println(automovil.conducir());
        automovil2 = new Automovil();
        System.out.println(automovil2.detener());
        System.out.println(automovil2.arrancar());
        automovil3 = new Automovil();
        System.out.println(automovil3.detener());
        System.out.println(automovil3.arrancar());

    }
}
