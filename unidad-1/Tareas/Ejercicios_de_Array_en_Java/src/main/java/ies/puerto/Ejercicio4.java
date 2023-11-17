package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public int[][] crearMatriz(){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }
    public void sumaColumna(int[][] matriz){
        int sumaColumna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de columna "+i+" = "+sumaColumna);
            sumaColumna = 0;
        }
    }
    public void sumaFila(int[][] matriz){
        int sumaFila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[j][i];
            }
            System.out.println("Suma de Fila "+i+" = "+sumaFila);
            sumaFila = 0;
        }
    }
}
