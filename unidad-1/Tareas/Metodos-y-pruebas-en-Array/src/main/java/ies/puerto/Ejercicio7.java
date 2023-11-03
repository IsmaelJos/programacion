package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {

    public int[] ordenarArrayAsc(int[] original){

        for (int i = 0; i < original.length -1; i++) {
            for (int j = 0; j < original.length -i -1; j++) {
                if (original[j] > original[j+1]){
                    int temp = original[j];
                    original[j] = original[j+1];
                    original[j+1] = temp;
                }
            }
        }

        return original;
    }

}
