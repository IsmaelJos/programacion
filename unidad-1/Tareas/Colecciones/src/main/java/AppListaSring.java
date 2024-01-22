import java.util.ArrayList;
import java.util.List;

public class AppListaSring {
    static List<String> miListaString;

    public static void main(String[] args) {
        String dni1 = "12345678H";
        String dni2 = "11111111H";
        miListaString = new ArrayList<>();
        miListaString.add(dni1);
        miListaString.add(dni2);
        System.out.println(miListaString);
        if(existeElemento(dni1)){
            System.out.println("existe el elemento "+dni1+" el la lista "+miListaString);
        }
    }
    public static Boolean existeElemento(String elemento){
        return miListaString.contains(elemento);
    }
}
