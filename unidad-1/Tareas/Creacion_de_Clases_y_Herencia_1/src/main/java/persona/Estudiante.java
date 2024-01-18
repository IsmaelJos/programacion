package persona;

public class Estudiante extends Persona {
    static String curso;
    static int nota;


    @Override
    public String saludar(){
        return "Buenos dias"+nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }

    public Estudiante() {}

    public Estudiante(String nombre, int edad, String dni,String curso,int nota) {
        super(nombre, edad, dni);
    }

    public static String getCurso() {
        return curso;
    }

    public static void setCurso(String curso) {
        Estudiante.curso = curso;
    }

    public static int getNota() {
        return nota;
    }

    public static void setNota(int nota) {
        Estudiante.nota = nota;
    }
}
