package ies.puerto;

public class Ejercicio4 {

    public String pares( int[] array){
        String resultado = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                resultado += array[i]+",";
            }
        }

        return resultado;
    }
}
