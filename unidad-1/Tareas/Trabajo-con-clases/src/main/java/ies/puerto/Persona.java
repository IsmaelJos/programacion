package ies.puerto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * constructor por defecto
     */
    public Persona(){}

    /**
     * Constructor con el parametro nombre
     * @param nombre de la persona
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor con el parametro nombre y la edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor con el parametro nombre, la edad y el email
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor con el parametro nombre, la edad, el email y el email
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String imprimir(){
        return "Nombre: "+nombre+" Edad: "+edad+" Email: "+email+" Telefono: "+telefono;
    }
}