package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {

    }
    public boolean verificarPrimo(int num){
        boolean resultado = true;
        int contador = 2;
        while (resultado&&(contador!=num)){
            if (num % contador == 0)
                resultado = false;
            contador++;
        }
        return resultado;
    }
}