package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.utilidades.Utilidades;

import java.util.List;

public class FileXml extends Utilidades implements ICrud {
    @Override
    public List<Personaje> obtenerPersonajes() {
        return null;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        return null;
    }

    @Override
    public void addPersonaje(Personaje personaje) {

    }

    @Override
    public void deletePersonaje(Personaje personaje) {

    }

    @Override
    public void updatePersonaje(Personaje personaje) {

    }
}
