package ies.puerto.EJ4.impl;

import ies.puerto.EJ4.abstracto.ConexionRed;
import ies.puerto.EJ4.interfaz.IConexionRed;

public class ConexionEthernet extends ConexionRed implements IConexionRed {

    @Override
    public String conectar() {
        return "Se ha conectado mediante Ethernet";
    }
}
