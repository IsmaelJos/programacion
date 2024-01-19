package ies.puerto.EJ6.app;

import ies.puerto.EJ6.impl.Alumno;
import ies.puerto.EJ6.impl.Profesor;

public class AppEscuela {
    static Alumno alumno;
    static Profesor profesor;

    public static void main(String[] args) {
        alumno = new Alumno("Paco","12/02/2008", "Secundaria");
        profesor = new Profesor("Juan","27/10/1993",1200F,"Letras");
        System.out.println(alumno.estudiar());
        System.out.println(alumno.anios());
        System.out.println(" ");
        System.out.println(profesor.impartirClase());
        System.out.println(profesor.trabajar());
        System.out.println("salario de "+profesor.salario()+"€");
        System.out.println(profesor.toString());
    }
}
