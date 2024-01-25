package ies.puerto.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ejercicio2 {
    static List<String> listaCadenas;

    public static void main(String[] args) {
        //System.out.println(listaCadenas);
        listaCadenas = new ArrayList<>();
        listaCadenas.add("No comiezo por A");
        listaCadenas.add("tampoco comiezo por A");
        listaCadenas.add("aveces comiezo por A");
        listaCadenas.add("Adios mundo cruel");
        int contador = 0;
        for (String cadena : listaCadenas) {
            if (comiezaPorA(cadena)) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    private static boolean comiezaPorA(String cadena) {
        String regexp = "^[a|A].*";
        if (Pattern.matches(regexp,cadena)){
            return true;
        }
        return false;
    }


}
