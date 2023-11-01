package ies.puerto;

public class Ejercicio6 {
    public int[][] transposicion(int[][] original){
            int extra;
            // se recorre filas
            for(int i=0;i<original.length;i++){
                //se recorre columnas y se cambian los valores
                for(int j=0;j<original[i].length;j++){
                    if(i>j){
                        extra = original[i][j];
                        original[i][j] = original[j][i];
                        original[j][i] = extra;
                    }
                }
            }
        return original;
    }
}
