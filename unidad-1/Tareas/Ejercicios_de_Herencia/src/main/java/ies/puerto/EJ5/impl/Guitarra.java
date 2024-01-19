package ies.puerto.EJ5.impl;

import ies.puerto.EJ5.abstracto.InstrumentoMusical;
import ies.puerto.EJ5.interfaz.IInstrumentoMusical;

public class Guitarra extends InstrumentoMusical implements IInstrumentoMusical {
    @Override
    public String tocarNota(String nota) {
        return "Tocar "+nota;
    }

    @Override
    public String afinar() {
        return "afinada la guitarra";
    }

    public String cambiarCuerdas(){
        return "Se han cambiado las cuerda";
    }
}
