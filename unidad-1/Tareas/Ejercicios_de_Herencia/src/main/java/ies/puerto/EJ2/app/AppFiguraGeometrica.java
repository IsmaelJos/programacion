package ies.puerto.EJ2.app;

import ies.puerto.EJ2.impl.Circulo;
import ies.puerto.EJ2.impl.Cuadrado;
import ies.puerto.EJ2.impl.Rectangulo;
import ies.puerto.EJ2.interfaz.IFormaGeometrica;

public class AppFiguraGeometrica {
    static IFormaGeometrica circulo;
    static IFormaGeometrica cuadrado;
    static IFormaGeometrica rectangulo;

    public static void main(String[] args) {
        cuadrado=new Cuadrado(5F,5F);
        circulo= new Circulo(5F);
        rectangulo=new Rectangulo(5F,6F);

        System.out.println("area del circulo: "+circulo.calcularArea());
        System.out.println("area del cuadrado: "+cuadrado.calcularArea());
        System.out.println("area del rectangulo: "+rectangulo.calcularArea());
    }

}
