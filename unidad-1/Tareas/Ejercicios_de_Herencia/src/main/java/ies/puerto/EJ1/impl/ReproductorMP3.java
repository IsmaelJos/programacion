package ies.puerto.EJ1.impl;

import ies.puerto.EJ1.interfaz.IReproductor;

public class ReproductorMP3 implements IReproductor {

    @Override
    public String reproducir() {
        return "Reproduciendo mp3";
    }

    @Override
    public String detener() {
        return "Deteniendo mp3";
    }
}
