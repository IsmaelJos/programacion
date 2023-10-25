package ies.puerto;

public class Ejercicio2 {

    public String determinarNumero(double num){
        return determinarPosNeg(num) +" y "+ determinarParImpar(num);
    }

    /**
     * Determina si el numero introducido es Positivo o Negativo
     * @param num
     * @return resultado que puede ser "Positivo" o "Negativo"
     */
    public String determinarPosNeg(double num) {
        String resultado = "Negativo";
        if (num >= 0 ){
            resultado = "Positivo";
        }
        return resultado;
    }

    /**
     *Determina si es par o impar
     * @param num
     * @return resultado que puede ser "Par" o "Impar"
     */
    public String determinarParImpar(double num){
        String resultado = "Impar";
        if (num % 2 == 0 ){
            resultado = "Par";
        }
        return resultado;
    }
}
