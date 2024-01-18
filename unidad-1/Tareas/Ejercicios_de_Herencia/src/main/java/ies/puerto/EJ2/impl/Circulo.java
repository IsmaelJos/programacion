package ies.puerto.EJ2.impl;

import ies.puerto.EJ2.interfaz.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return 3.14f*(radio*radio);
    }
}
