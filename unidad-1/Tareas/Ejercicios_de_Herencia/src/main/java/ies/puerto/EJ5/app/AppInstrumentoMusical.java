package ies.puerto.EJ5.app;

import ies.puerto.EJ5.impl.Guitarra;

public class AppInstrumentoMusical {
    static Guitarra guitarra;

    public static void main(String[] args) {
        guitarra = new Guitarra();
        System.out.println(guitarra.afinar());
        System.out.println(guitarra.cambiarCuerdas());
        System.out.println(guitarra.tocarNota("Fa"));
    }
}
