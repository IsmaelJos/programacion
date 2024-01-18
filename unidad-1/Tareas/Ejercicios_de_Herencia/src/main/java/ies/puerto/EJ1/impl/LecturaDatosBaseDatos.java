package ies.puerto.EJ1.impl;

import ies.puerto.EJ1.abstracto.LecturaDatosAbstract;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {
    @Override
    public String lectura() {
        return "Lectura de la BBDD";
    }

    @Override
    public String apertura() {
        return "Apertura de la BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre de la BBDD";
    }


}
