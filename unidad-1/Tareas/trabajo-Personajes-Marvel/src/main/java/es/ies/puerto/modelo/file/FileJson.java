package es.ies.puerto.modelo.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.utilidades.Utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends Utilidades implements ICrud {
    List<Personaje> personajes;
    String path = "src/main/resources/datos.json";
    @Override
    public List<Personaje> obtenerPersonajes() {
        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            personajes = new Gson().fromJson(json, listType);
        }catch (IOException exception){
            throw  new RuntimeException(exception.getMessage());
        }
        return personajes;
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
        guardarDatos(personajes);
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)){
            return;
        }
        personajes.remove(personaje);
        guardarDatos(personajes);
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        if (!personajes.contains(personaje)){
            return;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion,personaje);
        guardarDatos(personajes);
    }
    private void guardarDatos(List<Personaje> personaje) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personaje, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
