public abstract class Animal {
    private int chip;
    private String nombre;

    public Animal(){};
    public Animal(String nombre, int chip){
        this.chip = chip;
        this.nombre = nombre;
    }
    public String suSonido(){
        return "Soy un sonido de animal";
    }
    @Override
    public String toString(){
        return "nombre: "+nombre+" chip: "+chip;
    }
}
