package prueba;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;
    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0F);
        System.out.println("Valor del cuadrado: "+cuadrado.toString());
        calcularArea(cuadrado);
        triangulo = new Triangulo(10F, 5F);
        System.out.println("Valor del triangulo: "+triangulo.toString());
        calcularArea(triangulo);
        rectangulo = new Rectangulo(4F,3F);
        System.out.println("valor del Rectangulo: "+rectangulo.toString());
        calcularArea(rectangulo);
    }
    public static void calcularArea(Figura figura){
        System.out.println("Valor del area: "+figura.calcularArea());
    }
}
