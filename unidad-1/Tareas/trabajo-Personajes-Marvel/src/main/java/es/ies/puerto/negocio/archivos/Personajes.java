package es.ies.puerto.negocio.archivos;

import org.simpleframework.xml.ElementList;

import java.util.List;

public class Personajes {
    @ElementList(inline = true)
    List<Personaje> personajes;

    public Personajes(){};

    public Personajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
}
