package ies.puerto.ej7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {
    static List<String> listaCadenas;
    static List<String> listaCadenasSinDuplicado;

    public static void main(String[] args) {
        listaCadenasSinDuplicado = new ArrayList<>();
        listaCadenas = new ArrayList<>(Arrays.asList("abc","abc","def","def","aecf"));
        listaCadenasSinDuplicado = eliminarCadenasDuplicadas(listaCadenas);
        System.out.println("Array normal "+ listaCadenas);
        System.out.println("Array sin duplicados "+ listaCadenasSinDuplicado);
    }
    static List<String> eliminarCadenasDuplicadas(List<String> lista){
        List<String> resultado = new ArrayList<>();
        for(String cadena : lista){
            if (!resultado.contains(cadena)){
                resultado.add(cadena);
            }
        }
        return resultado;
    }
}
