package org.example;

public class Ejercicio1 {
    /**
     * Crea un triangulo equilatero con el mismo numero de filas que se ha introducido
     * @param numFilas numero de filas que tendra el triangulo
     */
    public void trianguloEquilatero(int numFilas) {
        if (numFilas <= 0) {
            System.out.println("El Numero introducido no puede ser negativo o 0");
        } else {
            int numColumnas = ((numFilas - 1) * 2) + 1;
            int contador = 0; // contador que se usara para saber el cresimiento del triangulo
            String[][] array = new String[numColumnas][numFilas];
            int puntoMedio = numColumnas / 2;
            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
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
        }
    }
}