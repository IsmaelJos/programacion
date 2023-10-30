package ies.puerto;

public class Ejercicio3 {
    public int mayor( int[] array){
        int resultado = 0;

        for (int i = 0; i < array.length; i++) {
            if (resultado<array[i]){
                resultado=array[i];
            }
        }

        return resultado;
    }
    public int menor( int[] array){
        int resultado = 1000000000;

        for (int i = 0; i < array.length; i++) {
            if (resultado>array[i]){
                resultado=array[i];
            }
        }

        return resultado;
    }
}
