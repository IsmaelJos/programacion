package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numColumnas = pedirNumColumnas();
        System.out.println(crearTrianguloInvertido(numColumnas));
    }
    public static String crearTrianguloInvertido(int numColumnas) throws Exception {
        String piramideInvertida="";
        System.out.println(validarNumero(numColumnas));
         if (numColumnas%2==0){
            numColumnas = numColumnas + 1;
        }
        int numLineas = (numColumnas/2)+1;
        int puntoMedio = (numColumnas/2);
        int contador = (numColumnas/2);
        for (int i = 0; i < numLineas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (j > (puntoMedio + (contador-i)) || j < (puntoMedio - (contador-i))){
                    piramideInvertida+=(" ");
                }
                else {
                    piramideInvertida+=("*");
                }
            }
            piramideInvertida+=("\n");
        }
        return piramideInvertida;
    }
    public static int pedirNumColumnas(){
        System.out.println("Introduzca un numero mayor a 5");
        Scanner scanner = new Scanner(System.in);
        int numColumnas = scanner.nextInt();
        return numColumnas;
    }
    public static String validarNumero(int numero) throws Exception {
        if (numero<=5){
            throw new Exception("El numero agregado es menor a 6");
        }else{
            return "El numero es Valido";
        }
    }
}
