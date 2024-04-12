package es.ies.puerto;

public class Ejercicio5 {

    public int potenciaTradicional(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
        int resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    public int potenciaRecursividad(int base, int exponente){
        if (exponente == 0){
            return 1;
        }
        if (exponente == 1){
            return base;
        }
        return base*potenciaRecursividad(base,exponente-1);
    }

}
