package ies.puerto.ej1;

import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {
    static List<Integer> listaNumeroPares;
    static List<Integer> listaNumeroInpares;

    public static void main(String[] args) {
        listaNumeroPares = new ArrayList<>();
        listaNumeroInpares = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            if (numPar(i)){
                listaNumeroPares.add(i);
            }else {
                listaNumeroInpares.add(i);
            }

        }
        System.out.println("Lista numeros Pares "+listaNumeroPares);
        System.out.println("tamaño "+ listaNumeroPares.size());
        System.out.println("Lista numeros Inpares "+listaNumeroInpares);
        System.out.println("tamaño "+ listaNumeroInpares.size());
    }

    /**
     * funcion que verifica si un numero es par
     * @param i numero que verifica
     * @return true or false si es par o no
     */
    private static boolean numPar(int i) {
        if (i%2==0){
            return true;
        }
        return false;
    }
}
