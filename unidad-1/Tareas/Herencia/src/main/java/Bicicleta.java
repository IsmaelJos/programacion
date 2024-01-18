public class Bicicleta extends Vehiculo{
    private String talla;

    public Bicicleta(String talla, String Color){
        super(Color);
        this.talla = talla;

    }
    @Override
    public String toString(){
        return "yo soy una Bicicleta con talla "+this.talla+" y color "+this.getColor();
    }
}
