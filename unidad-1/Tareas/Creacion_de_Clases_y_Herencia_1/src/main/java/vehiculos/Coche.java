package vehiculos;

public class Coche extends Vehiculo{
    String matricula;
    Conductor conductor;

    public Coche(String marca, String modelo, int precio, String matricula) {
        super(marca, modelo, precio);
        this.matricula = matricula;
    }
    public Coche(String marca, String modelo, int precio, String matricula,Conductor conductor) {
        super(marca, modelo, precio);
        this.matricula = matricula;
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", conductor=" + conductor +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
