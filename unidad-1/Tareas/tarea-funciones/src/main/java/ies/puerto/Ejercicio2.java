package ies.puerto;

public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Programa que calcula el area de un circulo
     * @param radio
     * @return area
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        double pi = 3.14;
        resultado = (radio^2)*pi;
        return resultado;
    }
}