package ies.puerto;

public class Ejercicio9 {
    public int[]joinArray(int[] array1, int[] array2){

        int[] joined = new int[array1.length+array2.length];
        
        int i = 0;

        while (i<array1.length){
            joined[i]=array1[i];
            i++;
        }
        while (i<joined.length){
            joined[i]=array2[i-array1.length];
            i++;
        }

        return joined;
    }

}
