package ies.puerto;


public class Ejercicio1 {
        public int sumar(int[] array) {
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
            System.out.println("La suma de los elementos es: " + suma);
            return suma;
        }
}