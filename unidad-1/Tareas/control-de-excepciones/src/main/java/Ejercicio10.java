import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws NombreInvalidoException {
        String nombre = pedirNombre();
        if (noEsNull(nombre)){
            System.out.println("El nombre es "+nombre);
        }
    }

    public static boolean noEsNull(String texto) throws NombreInvalidoException {
        if (texto == null){
            throw new NombreInvalidoException("El campo nombre esta vacio");
        }
        return true;
    }

    private static String pedirNombre() {
        System.out.println("Introduce un nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        if(nombre.isEmpty()){
            nombre=null;
        }
        return nombre;
    }
}
