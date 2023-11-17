package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {

    public int[] pedirElemento(){
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        boolean salir = false;
        do {
            int numIntroducido = scanner.nextInt();
            if(numIntroducido>=0){
                array[contador] = numIntroducido;
                contador++;
            }else{
                salir = true;
            }
        }while (contador<10 || salir);
        int[] arrayCorrecto = new int[contador];
        for (int i = 0; i < arrayCorrecto.length; i++) {
            arrayCorrecto[i] = array[i];
        }
        return arrayCorrecto;
    }
    public void imprimirArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("num"+i+": "+array[i]);
        }

    }
}
