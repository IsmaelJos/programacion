public class Vehiculo {
    private String Color;

    public Vehiculo() {

    }

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
    public Vehiculo(String color){
        this.Color = color;
    }
    public void miColor(){
        System.out.println("Mi color es "+Color);
    }
    @Override
    public String toString() {

        return "Mi color es "+Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
