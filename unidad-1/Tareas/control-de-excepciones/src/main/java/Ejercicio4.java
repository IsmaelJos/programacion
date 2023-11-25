/**
 * Crea un programa que intente acceder a un método de un objeto que es null. Por ejemplo un String.
 * Maneja la excepción NullPointerException.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String respuesta = respuestaNull();
        respuestaMinus(respuesta);
    }
    public static String respuestaNull(){
        return null;
    }
    public static void respuestaMinus(String respuesta){
        try {
            System.out.println(respuesta.toLowerCase());
        }catch (NullPointerException e){
            System.out.println("Se ha encontrado un NullPointerException");
        }
    }
}
