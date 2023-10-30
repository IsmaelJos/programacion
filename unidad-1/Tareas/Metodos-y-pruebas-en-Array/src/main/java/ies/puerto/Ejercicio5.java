package ies.puerto;

public class Ejercicio5 {
    public String buscar(int elemento){

        int[] array = {1, 2, 3, 4, 5};
        String posicion = "";
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento){
                posicion += i;
            }else{
                contador++;
            }
        }
        if (contador == array.length){
            posicion = "No se ha encontrado el numero";
        }


        return posicion;
    }
}
