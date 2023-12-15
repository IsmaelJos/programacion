package ies.puerto;

public class Ejercicio6 {
    /**
     * recorrer los numeros del 1 al 1000
     * para un numero comprobar si es un numero armstrong
     * si es imprime en pantalla
     * si no, continua
     */
    /**
     * Funcion que verifica si un numero es Armstrong
     * @param numero para realizar la verificacion
     * @return boolean true/false con el resultado
     */
    public boolean verificaArmstrong(int numero){
        boolean resultado = false;

        int digitos = 0;
        int calculoDigitos = numero;
        while (calculoDigitos > 0){
            calculoDigitos =calculoDigitos/10;
            digitos++;
        }

        int resto = 0;
        calculoDigitos = numero;
        int suma = 0;
        int exponente = 0;
        while (digitos > 0){
            resto =calculoDigitos%10;
            calculoDigitos =calculoDigitos/10;
            suma +=
            digitos--;
        }

        return resultado;
    }
}