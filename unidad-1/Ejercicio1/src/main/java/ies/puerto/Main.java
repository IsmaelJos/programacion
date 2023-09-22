package ies.puerto;

import java.util.Scanner;

/**
 * se realiza el ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {


        int valorA;
        int valorB;

        Scanner lectura = new Scanner (System.in);

        //Bloque 1: pide por pantalla y asigna valor

        //Bloque 2: verifica si los valores son iguales

        do{
            System.out.println("Los valores no pueden ser iguales");

            System.out.println("Ingresa el valor de la variable A");

            valorA = lectura.nextInt();
            System.out.println("valor de la variable A:"+valorA);

            System.out.println("Ingresa el valor de la variable B");

            valorB = lectura.nextInt();
            System.out.println("valor de la variable B:"+valorB);
            if (valorA == valorB){
                System.out.println("Los valores no pueden ser iguales");
            }
        }while(valorA == valorB);

        //Bloque 3: verifica si A > B

        //Bloque 4: muestra por pantalla el valor mayor

            if (valorA > valorB){
                System.out.println("A es mayor que B: "+valorA+" > "+valorB);
            }else{
                System.out.println("B es mayor que A: "+valorB+" > "+valorA);
            }


        //Bloque 3: verifica si A > B

        //Bloque 4: muestra por pantalla el valor mayor





    }
}