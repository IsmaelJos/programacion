package ies.puerto;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private int promedio;

    public Estudiante(){}

    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public Estudiante(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre,int edad, String carrera, int promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    public String imprimir(){
        return "Nombre: "+nombre+" Edad: "+edad+" Nombre de la carrera: "+carrera;
    }
    public boolean Aprobado(){
        boolean aprobado = true;
        if (this.promedio < 5){
            aprobado = false;
        }
        return aprobado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
