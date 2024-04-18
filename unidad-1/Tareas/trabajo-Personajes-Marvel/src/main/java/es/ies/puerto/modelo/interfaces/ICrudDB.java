package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.negocio.PersonajeDB;

import java.util.Set;

public interface ICrudDB {
        public Set<PersonajeDB> obtenerPersonajes() throws UsuarioException;
        public PersonajeDB obtenerPersonaje(PersonajeDB personaje) throws UsuarioException;
        public void addPersonaje(PersonajeDB personaje) throws UsuarioException;
        public void deletePersonaje(PersonajeDB personaje) throws UsuarioException;
        public void updatePersonaje(PersonajeDB personaje) throws UsuarioException;
}
