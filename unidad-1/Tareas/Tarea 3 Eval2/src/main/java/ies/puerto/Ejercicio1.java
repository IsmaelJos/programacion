package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int columnas = pedirColumnas();
        if (columnas%2==0){
            columnas = columnas+1;
        }

        int filas = (columnas/2)+1;

        String[][] trianguloInvertido = new String[columnas][filas];
        int contador = columnas/2;

        int puntoMedio = columnas / 2;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j > (puntoMedio + contador) || j < (puntoMedio - contador)) {
                    trianguloInvertido[j][i] = " ";
                } else {
                    trianguloInvertido[j][i] = "1";
                }
                System.out.print(trianguloInvertido[j][i]);
            }
            System.out.println("");
            contador -= 1;
        }

    }
    static int pedirColumnas(){
        Scanner scanner = new Scanner(System.in);
        int columnas = scanner.nextInt();
        return columnas;
    }
}
