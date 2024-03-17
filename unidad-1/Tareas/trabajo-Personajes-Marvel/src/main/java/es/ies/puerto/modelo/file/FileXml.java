package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.negocio.Personajes;
import es.ies.puerto.utilidades.Utilidades;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FileXml extends Utilidades implements ICrud {

    List<Personaje> personajes;
    String path = "src/main/resources/datos.xml";
    @Override
    public List<Personaje> obtenerPersonajes() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            Personajes personajeList = serializer.read(Personajes.class, file);
            personajes = personajeList.getPersonajes();
            return personajes;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)){
            return null;
        }
        int posicion =  personajes.indexOf(personaje);
        return personajes.get(posicion);
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        if (personajes.contains(personaje)){
            return;
        }
        personajes.add(personaje);
        Personajes personaList = new Personajes(personajes);
        actualizarFichero(personaList);
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)){
            return;
        }
        personajes.remove(personaje);
        Personajes personajeList = new Personajes(personajes);
        actualizarFichero(personajeList);
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        int posicion =  personajes.indexOf(personaje);
        if (posicion < 0 ) {
            return;
        }
        personajes.set(posicion,personaje);
        Personajes personajeList = new Personajes(personajes);
        actualizarFichero(personajeList);
    }
    private void actualizarFichero(Personajes personajeList){
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
