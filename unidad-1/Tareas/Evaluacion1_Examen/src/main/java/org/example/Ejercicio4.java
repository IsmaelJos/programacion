package org.example;

public class Ejercicio4 {
    private boolean[] puerta;
    public void abrirPuerta(int numeroPuerta){
        puerta[numeroPuerta] = true;
    }
    public void cerrarPuerta(int numeroPuerta){
        puerta[numeroPuerta] = true;
    }
    public void cambiarEstadoPuerta(int numeroPuerta){
        puerta[numeroPuerta] = !puerta[numeroPuerta];
    }
    public void mostrarEstadoPuertas(){
        for (int i = 0; i < puerta.length; i++) {
            System.out.println(puerta[i]);
        }
    }
}
