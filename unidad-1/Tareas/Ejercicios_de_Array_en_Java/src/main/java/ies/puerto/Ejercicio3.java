package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    public int[] sumarArrays(){
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        for (int i = 0; i <= 5; i++) {
            System.out.println("introduzca el numero "+i+"para el primer array");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println("introduzca el numero "+i+"para el segundo array");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 5; i++) {
            array3[i] = array1[i]+array2[i];
        }

        return array3;
    }
}
