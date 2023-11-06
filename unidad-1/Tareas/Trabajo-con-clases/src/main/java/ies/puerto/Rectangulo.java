package ies.puerto;

public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int area(int base, int altura){
        return base*altura;
    }
    public int perimetro(int base, int altura){
        return (2*base)+(2*altura);
    }
}
