package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        int numFilas = pedirNumFilas();
        System.out.println(crearEstrella(numFilas));
    }
    public static String crearEstrella(int numFilas) throws Exception {
        String estrella="";
        System.out.println(validarNumero(numFilas));
        if (numFilas%2==0){
            numFilas = numFilas + 1;
        }
        int numColumnas = numFilas;
        int puntoMedio = (numFilas/2);
        int contador = (numFilas/2);

        for (int i = 0; i < numFilas/2; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (j > puntoMedio +i || j < puntoMedio -i){
                    estrella+=(" ");
                }
                else {
                    estrella+=("*");
                }
            }
            estrella+=("\n");
        }
        for (int i = 0; i < numFilas/2+1; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (j > (puntoMedio + (contador-i)) || j < (puntoMedio - (contador-i))){
                    estrella+=(" ");
                }
                else {
                    estrella+=("*");
                }
            }
            estrella+=("\n");
        }
        return estrella;
    }
    public static int pedirNumFilas(){
        System.out.println("Introduzca un numero mayor a 3");
        Scanner scanner = new Scanner(System.in);
        int numFilas = scanner.nextInt();
        return numFilas;
    }
    public static String validarNumero(int numero) throws Exception {
        if (numero<4){
            throw new Exception("El numero agregado es menor a 4");
        }else{
            return "El numero es Valido";
        }
    }
}
