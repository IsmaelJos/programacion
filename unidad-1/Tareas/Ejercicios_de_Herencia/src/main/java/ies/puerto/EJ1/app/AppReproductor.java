package ies.puerto.EJ1.app;

import ies.puerto.EJ1.impl.ReproductorMP3;

public class AppReproductor {
    static ReproductorMP3 reproductorMP3;

    public static void main(String[] args) {
        reproductorMP3 = new ReproductorMP3();
        System.out.println(reproductorMP3.reproducir());
        System.out.println(reproductorMP3.detener());
    }
}
