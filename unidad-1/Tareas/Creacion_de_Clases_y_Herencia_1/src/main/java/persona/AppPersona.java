package persona;

import acceso.Autenticacion;

public class AppPersona {
    static Persona persona;
    static Estudiante estudiante;

    public static void main(String[] args) {
        persona = new Persona("Paco",19,"7473467E");
        estudiante = new Estudiante("Paco",19,"7473467E","Primero",6);
        if(persona.validar(persona.getNombre())){
            System.out.println(persona.toString());
        }
        if(estudiante.validar(estudiante.getNombre())){
            System.out.println(estudiante.toString());
        }
    }
}
