package org.example;

import com.sun.source.tree.SwitchTree;

public class Ejercicio5 {

    public void mesIfElse(int numero){
        if (numero==1){
            System.out.println("enero");
        }
        if (numero==2) {
            System.out.println("Febrero");
        }
        if (numero==3) {
            System.out.println("Marzo");
        }
        if (numero==4) {
            System.out.println("abril");
        }
        if (numero==5) {
            System.out.println("mayo");
        }
        if (numero==6) {
            System.out.println("junio");
        }
        if (numero==7) {
            System.out.println("julio");
        }
        if (numero==8) {
            System.out.println("agosto");
        }
        if (numero==9) {
            System.out.println("septiembre");
        }
        if (numero==10) {
            System.out.println("octubre");
        }
        if (numero==11) {
            System.out.println("noviembre");
        }
        if (numero==12) {
            System.out.println("diciembre");
        }
    }
    public void mesSwitch(int numero){
        switch (numero) {
            case 1: System.out.println("enero");
                break;
            case 2: System.out.println("Febrero");
                break;
            case 3: System.out.println("Marzo");
                break;
            case 4: System.out.println("abril");
                break;
            case 5: System.out.println("mayo");
                break;
            case 6: System.out.println("junio");
                break;
            case 7: System.out.println("julio");
                break;
            case 8: System.out.println("agosto");
                break;
            case 9: System.out.println("septiembre");
                break;
            case 10: System.out.println("octubre");
                break;
            case 11: System.out.println("noviembre");
                break;
            case 12: System.out.println("diciembre");
                break;
        }
    }
}
