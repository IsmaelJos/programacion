import java.util.ArrayList;
import java.util.List;

public class AppAnimal {
    static List<Animal> animales;

    static List<String> fechas;

    public static void main(String[] args) {
        String fecha1 = "22/01/24";
        Animal mario = new Gato("mario",12345678);
        animales = new ArrayList<>();
        fechas = new ArrayList<>();

        if (fechas.contains(fecha1)){
            fechas.add(fecha1);
        }
        if (animales.contains(mario)){
            animales.add(mario);
        }

        System.out.println(fechas);
        System.out.println(animales);
    }
}
