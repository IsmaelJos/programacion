package ies.puerto.ej4;

import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {

    static List<Integer> listaNum1;
    static List<Integer> listaNum2;

    public static void main(String[] args) {
        listaNum1 = new ArrayList<>();
        listaNum2 = new ArrayList<>();
        for (int i = 3; i < 8; i++) {
            listaNum1.add(i);
        }
        for (int i = 5; i < 10; i++) {
            listaNum2.add(i);
        }
        if(comparaLista(listaNum1,listaNum2)){
            System.out.println("Las listas tienen elementos en comun");
        }else {
            System.out.println("Las listas NO tienen elementos en comun");
        }
    }

    private static boolean comparaLista(List<Integer> listaNum1, List<Integer> listaNum2) {

       for (Integer num: listaNum1){
           if (listaNum2.contains(num)){
               return true;
           }
       }
        return false;
    }


}
