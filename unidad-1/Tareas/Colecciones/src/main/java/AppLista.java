import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppLista {
    static List <Integer> miListaEnteros;

    public static void main(String[] args) {
        miListaEnteros = new ArrayList<>();
        addElemento(1);
        addElemento(2);
        List<Integer> subSublista = new ArrayList<>();
        subSublista.add(3);
        subSublista.add(4);
        addSublista(subSublista);
        System.out.println(miListaEnteros);


    }
    public static Boolean addElemento(Integer elemento){
        return miListaEnteros.add(elemento);
    }
    public static boolean removeElemento (Integer elemento){
        return miListaEnteros.remove(elemento);
    }
    public static boolean addSublista(Collection sublista){
        return miListaEnteros.addAll(sublista);
    }
}
