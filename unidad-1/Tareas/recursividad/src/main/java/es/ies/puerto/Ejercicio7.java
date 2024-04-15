package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    List<Integer> lista = new ArrayList<>();
    public List<Integer> cuentaRegresiva(int num){
        for (int i = num; i > 0; i--) {
            lista.add(i);
        }
        return lista;
    }
    public List<Integer> cuentaRegresivaRecursiva(int num){
        lista.add(num);
        if (num == 1){
            return lista;
        }
        return cuentaRegresiva(num-1);
    }
}
