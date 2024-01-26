package ies.puerto.ej8;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {
    static List<Integer> listaNumeros;

    public static void main(String[] args) {
        listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(i);
        }
        if (mayorQue10(listaNumeros)){
            System.out.println("Todos los numeros de la lista son mayores que 10");
        }else {
            System.out.println("No todos los numeros de la lista son mayores que 10");
        }
    }

    private static boolean mayorQue10(List<Integer> listaNumeros) {
        for (Integer numero: listaNumeros){
            if (numero<10){
                return false;
            }
        }
        return true;
    }

}
