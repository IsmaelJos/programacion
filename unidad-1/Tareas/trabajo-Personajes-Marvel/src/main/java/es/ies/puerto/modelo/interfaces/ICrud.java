package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.negocio.Personaje;

import java.util.List;

public interface ICrud {
    public List<Personaje> obtenerPersonajes();
    public Personaje obtenerPersonaje(Personaje personaje);
    public void addPersonaje(Personaje personaje);
    public void deletePersonaje(Personaje personaje);
    public void updatePersonaje(Personaje personaje);
}
