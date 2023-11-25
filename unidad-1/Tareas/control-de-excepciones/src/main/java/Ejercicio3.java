import java.sql.Array;
import java.util.Scanner;

/**
 * Declara un array de 3 elementos e intenta acceder al cuarto elemento.
 * Maneja la excepción ArrayIndexOutOfBoundsException
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que longitud tendra el array");
        int longitudArray = scanner.nextInt();
        System.out.println("Que valor quieres mirar");
        int posArray = scanner.nextInt();
        int[] array = crearArray(longitudArray);
        int numPedido = leerPosArray(array,posArray);
        System.out.println("el numero en la buscado es " +numPedido);
    }
    public static int[] crearArray(int longitud){
        int[] array = new int[longitud];
        for (int i=0;i<array.length;i++)
            array[i] = (int) (Math.random()*20)+1;
        return array;
    }
    public static int leerPosArray(int[] array, int posicion){
        int numArray = 0;
        try {
            numArray = array[posicion];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("se ha encontrado un error ArrayIndexOutOfBoundsException la posicion " +
                    "no puede ser mas grande que la longitud del array");
        }
        return numArray;
    }

}
