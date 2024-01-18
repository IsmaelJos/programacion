package vehiculos;

public class AppMotocicleta {
    static Conductor conductor;
    static Motocicleta motocicleta;

    public static void main(String[] args) {
        conductor = new Conductor("Paco",19,"7473467E");
        motocicleta = new Motocicleta("Yamaha","LTG",15000,"9285UFS",conductor);
        System.out.println(motocicleta.toString());
    }
}
