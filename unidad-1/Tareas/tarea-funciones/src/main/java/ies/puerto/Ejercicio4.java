package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {

    }
    public int maximoDosNumeros(int num1, int num2){
        int resultado = 0;
            if (num1>num2){
                resultado=num1;
            }else {
                resultado=num2;
            }
        return resultado;
    }
    public int maximoDosNumeros(int num1, int num2,int num3){
        int resultado = 0;
        int max1 = maximoDosNumeros(num1, num2);
        if (max1>num3){
            resultado=max1;
        }else {
            resultado=num3;
        }
        return resultado;
    }
}