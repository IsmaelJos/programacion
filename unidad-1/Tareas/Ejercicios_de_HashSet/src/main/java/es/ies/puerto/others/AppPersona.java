package es.ies.puerto.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {
    static HashMap<String, Persona> personaHashMap;
    static List<Persona> personaList;

    public static void main(String[] args) {
        personaHashMap = new HashMap<>();
        personaList = new ArrayList<>();

        Persona persona1 = new Persona("Carlos","34567892E");

        addPersonaLista(persona1);
        addPersonaMap(persona1);

    }
    static public boolean addPersonaLista(Persona persona){
        if (!existePersonaLista(persona)){
            return personaList.add(persona);
        }

        return true;
    }
    static public boolean addPersonaMap(Persona persona){
        if (!existePersonaMap(persona)){
            personaHashMap.put(persona.getDni(),persona);
        }
        return true;
    }
    static public boolean existePersonaLista(Persona persona){
        if (personaHashMap.isEmpty()){
            return false;
        }
        if (!personaHashMap.containsKey(persona.getDni())){
            return false;
        }
        return true;
    }
    static public boolean existePersonaMap(Persona persona){
        if (personaList.isEmpty()){
            return false;
        }
        if (!personaList.contains(persona)){
            return false;
        }
        return true;
    }
}
