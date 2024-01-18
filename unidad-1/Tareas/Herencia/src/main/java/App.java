public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Coche miCocheMatricula;
    static Bicicleta miBicicleta;

    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.miColor();
        miCocheColor = new Coche("Rojo");
        miCocheColor.mover();
        miCocheColor.miColor();
        miBicicleta = new Bicicleta("L", "Negro");
        miBicicleta.mover();
        miBicicleta.miColor();
        System.out.println(miCoche.toString());
        System.out.println(miBicicleta.toString());
        miCocheMatricula = new Coche("Azul","TF1965AK");
        miCocheMatricula.mover();
        miCocheMatricula.miColor();
        System.out.println(miCocheMatricula.toString());
    }
}
