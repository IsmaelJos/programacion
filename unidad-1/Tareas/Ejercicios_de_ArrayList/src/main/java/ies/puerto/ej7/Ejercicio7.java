package ies.puerto.ej7;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    static List<String> listaCadenas;
    static List<String> listaCadenasSinDuplicado;

    public static void main(String[] args) {
        listaCadenasSinDuplicado = new ArrayList<>();
        listaCadenas = new ArrayList<>();
        listaCadenas.add("abc");
        listaCadenas.add("abc");
        listaCadenas.add("def");
        listaCadenas.add("def");
        listaCadenas.add("aecf");
        for(String cadena : listaCadenas){
            if (!listaCadenasSinDuplicado.contains(cadena)){
                listaCadenasSinDuplicado.add(cadena);
            }
        }
        System.out.println("Array normal "+ listaCadenas);
        System.out.println("Array sin duplicados "+ listaCadenasSinDuplicado);

    }
}
