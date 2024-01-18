package utilidades;

import java.util.Scanner;

public class Calculadora extends UtilidadesCal{
    static int num1;
    static int num2;

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añada un numero");
        num1 = scanner.nextInt();
        System.out.println("Añada otro numero");
        num2 = scanner.nextInt();
        System.out.println("su suma es "+super.sumar(num1,num2));
        System.out.println("su resta es "+super.resta(num1,num2));
        System.out.println("su multiplicacion es "+super.multiplicar(num1,num2));
        System.out.println("su divicion es "+super.dividir(num1,num2));
    }
}
