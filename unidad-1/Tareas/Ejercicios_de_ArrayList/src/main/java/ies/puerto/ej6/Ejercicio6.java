package ies.puerto.ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {
    static Curso dam1;

    public static void main(String[] args) {
        dam1 = new Curso("DAM1");
        Alumno alumno1 = new Alumno("nombre1", "apelpuertlido1", Arrays.asList(1f, 2f, 4f));
        Alumno alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(3f, 7f, 8f));
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

        dam1.setAlumnos(alumnos);
        System.out.println("media de los alumnos "+ dam1.media());
    }
}
