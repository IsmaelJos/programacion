package ies.puerto.EJ1.impl;

import ies.puerto.EJ1.interfaz.ILecturaDatos;

public class LecturaDatosFicheros implements ILecturaDatos {
    @Override
    public String Lectura() {
        return "Lectura de Ficheros";
    }

    @Override
    public String Apertura() {
        return "Apertura de Ficheros";
    }

    @Override
    public String Cierre() {
        return "Cierre de Ficheros";
    }
}
