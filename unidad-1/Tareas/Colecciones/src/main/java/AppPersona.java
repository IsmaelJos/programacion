import java.util.ArrayList;
import java.util.List;

public class AppPersona {
    static Persona ramon;
    static Persona juan;
    static List<Persona> personas;
    static String dni1 = "00000000T";
    static String dni2 = "11111111H";

    public static void main(String[] args) {
        ramon = new Persona(dni1,"Ramon","Gonzales","Perez");
        juan = new Persona(dni2,"Juan","Gonzales","Perez");
        personas = new ArrayList<>();
        personas.add(ramon);
        personas.add(juan);
        System.out.println(personas);
        if (personas.contains(ramon)){
            System.out.println("La lista contiene a Ramon");
        }
    }
}
