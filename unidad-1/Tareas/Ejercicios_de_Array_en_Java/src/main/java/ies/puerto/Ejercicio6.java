package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    public int[][] crearMarco(){
        int[][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i==0 || i==marco.length-1 || j==0 || j==marco[i].length){
                    marco[i][j]=1;
                }
            }
        }
        return marco;
    }
    public void mostrarMarco(int[][] marco){
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j]);
            }
        }
    }
}
