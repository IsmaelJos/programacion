public class Coche extends Motor {
    public Coche(String color) {
        super(color);
    }

    public Coche(String color, String matricula) {
        super(color, matricula);
    }

    public Coche() {
        super();
    }

    public void encender() {
        System.out.println("El coche está encendido.");
    }
    private void apagar() {
        System.out.println("El coche está apagado.");
    }
    @Override
    public String toString(){
        String mensaje = "yo soy un coche";
        //return "Soy un coche y el color es " +getColor();
        if (getColor()!=null){
            mensaje += ", mi color es "+getColor();
        }
        if (getMatricula()!=null){
            mensaje+= ", mi matricula es "+getMatricula();
        }
        return mensaje;
    }

}
