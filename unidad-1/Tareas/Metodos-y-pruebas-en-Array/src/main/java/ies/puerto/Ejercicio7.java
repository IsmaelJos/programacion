package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {

    public String ordenarArrayAsc(int[] original){

        String ordenado = "";

        Arrays.sort(original);

        for (int i = 0; i < original.length; i++) {
            ordenado += original[i]+",";
        }

        return ordenado;
    }

}
