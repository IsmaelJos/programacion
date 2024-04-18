package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {
    int anterior = 0, siguiente = 1, resultado = 0;
    List<Integer> lista = new ArrayList<>(Arrays.asList(anterior,siguiente));
    public int fibonacci(int num){
        for (int i = 0; i < num; i++) {
            resultado=anterior+siguiente;
            anterior=siguiente;
            siguiente=resultado;
        }
        return resultado;
    }

    public int fibonacciRecursivo(int num)  {
            if (num < 2) return num;
            return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
    }

}
