package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = pedirNumero();
        int sum = sumDigitos(num);
        System.out.println(sum);
    }
    public static int sumDigitos(int num){
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static Integer pedirNumero(){
        System.out.println("Añada un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (InputMismatchException n){
            System.out.println("introduzca un numero");
        }
        return numero;
    }
}
