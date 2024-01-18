package vehiculos;

public class Motocicleta extends Vehiculo{
    String matricula;
    Conductor conductor;

    public Motocicleta(String marca, String modelo, int precio, String matricula) {
        super(marca, modelo, precio);
        this.matricula = matricula;
    }
    public Motocicleta(String marca, String modelo, int precio, String matricula,Conductor conductor) {
        super(marca, modelo, precio);
        this.matricula = matricula;
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "matricula='" + matricula + '\'' +
                ", conductor=" + conductor +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
