package ies.puerto.EJ1.app;

import ies.puerto.EJ1.abstracto.LecturaDatosAbstract;
import ies.puerto.EJ1.impl.LecturaDatosBaseDatos;
import ies.puerto.EJ1.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.cierre());
        //tipo(lecturaDatos);
    }
    public static void tipo(ILecturaDatos lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
