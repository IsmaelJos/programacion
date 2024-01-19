package ies.puerto.EJ4.app;

import ies.puerto.EJ4.impl.ConexionEthernet;
import ies.puerto.EJ4.impl.ConexionWifi;

public class AppConexionRed {
    static ConexionWifi conexionWifi;
    static ConexionEthernet conexionEthernet;

    public static void main(String[] args) {
        conexionWifi = new ConexionWifi();
        System.out.println(conexionWifi.conectar());
        conexionEthernet = new ConexionEthernet();
        System.out.println(conexionEthernet.conectar());
    }
}
