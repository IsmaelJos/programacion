package ies.puerto;

public class Ejercicio2 {
    public int[] ordenamientoBurbuja(int[] array){
        int tamanio = array.length;
        int[] respuesta = new int[tamanio];
        boolean cambiado;
        do {
            cambiado = false;
            for (int i = 1; i < tamanio-1; i++) {
                if (array[i-1]>array[i]){
                    int auxiliar = array[i];
                    array[i] = array[i-1];
                    array[i-1] = auxiliar;
                    cambiado = true;
                }
            }
        }while (cambiado);
        return respuesta;
    }
}
