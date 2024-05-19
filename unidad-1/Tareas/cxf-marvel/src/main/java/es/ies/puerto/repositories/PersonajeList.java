package es.ies.puerto.repositories;

import es.ies.puerto.models.Personaje;
import es.ies.puerto.models.Song;

import java.util.ArrayList;
import java.util.List;

public class PersonajeList {

    private List<Personaje> personajeList;

    public PersonajeList (){
        personajeList = new ArrayList<>();
        personajeList.add(new Personaje("1", "Iron Man", "Masculino", "Tony Stark", "Traje Mark XLV", "Vuelo"));
        personajeList.add(new Personaje("2", "Spider-Man", "Masculino", "Peter Parker", "Red de Spider-Man", "Agilidad sobrehumana"));
    }
    public Personaje getPersonajeById(String id) {
        return personajeList.get(Integer.parseInt(id));
    }
    public List<Personaje> getPersonajes() {
        return personajeList;
    }
    public void savePersonaje(Personaje personaje){
        if (personajeList.contains(personaje)) {
            return;
        }
        personajeList.add(personaje);
    }
}
