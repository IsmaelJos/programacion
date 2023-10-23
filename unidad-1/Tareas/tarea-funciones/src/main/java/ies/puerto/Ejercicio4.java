package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {

    }
    public int maximoDosNumeros(int num1, int num2){
        int resultado = num2;
            if (num1>num2){
                resultado=num1;
            }
        return resultado;
    }
    public int maximoDosNumeros(int num1, int num2,int num3){
        int resultado = 0;
        int max = maximoDosNumeros(num1, num2);
        resultado = maximoDosNumeros(max, num3);
        return resultado;
    }
}