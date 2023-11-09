package ies.puerto;

public class Circulo {
    private int radio;

    public Circulo(){}

    public Circulo(int radio){
        this.radio = radio;
    }

    public double areaCirculo(){return Math.PI * Math.pow(radio,2);}
    public double perimetroCirculo(){
        return 2 * Math.PI * radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
