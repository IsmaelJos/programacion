package ies.puerto.EJ2.impl;

import ies.puerto.EJ2.abstracto.RegularesAbstract;
import ies.puerto.EJ2.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica {
    public Cuadrado(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return getBase()*getAltura();
    }
}
