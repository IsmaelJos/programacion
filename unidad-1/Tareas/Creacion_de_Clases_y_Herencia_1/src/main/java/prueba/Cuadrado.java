package prueba;

public class Cuadrado extends Rectangulo{
    public Cuadrado(){}
    public Cuadrado(float lado){
        super(lado, lado);
    }
    @Override
    public String toString(){
        return "base: "+getBase()+", altura: "+getAltura();
    }

}
