package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        int num = pedirNumero();
        String[][] montanas;
    }

    /**
    public static String[][] montanas(int repeticiones){
        if (repeticiones%2==1){
            repeticiones=repeticiones-1;
        }
        int numColumnas = 5;
        int contador = 0; // contador que se usara para saber el cresimiento del triangulo

        String[][] array = new String[numColumnas*repeticiones][3];
        int puntoMedio = numColumnas / 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j > (puntoMedio + contador) || j < (puntoMedio - contador)) {
                    array[j][i] = " ";
                } else {
                    array[j][i] = "1";
                }
                System.out.print(array[j][i]);
            }
            System.out.println("");
            contador += 1;
        }
        return array;
    }
    */
    public static Integer pedirNumero() throws Exception {
        System.out.println("Añada el numero de columnas");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (InputMismatchException n){
            System.out.println("introduzca un numero");
        }
        if (numero<4){
            throw new Exception("El numero de columnas tiene que ser mayor de 3");
        }
        return numero;
    }
}
