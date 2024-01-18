package vehiculos;

public class AppVehiculo {
    static Coche coche;
    static Conductor conductor;

    public static void main(String[] args) {
        conductor = new Conductor("Paco",19,"7473467E");
        coche = new Coche("Audi","TH50",30000,"FD83748TF",conductor);
        System.out.println(coche.toString());
    }
}
