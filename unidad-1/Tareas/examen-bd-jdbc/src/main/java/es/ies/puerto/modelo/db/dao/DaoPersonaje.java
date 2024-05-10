package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPersonaje  extends Conexion {

    public DaoPersonaje() throws MarvelException {
        super();
    }

    public void actualizarPersonaje(String query) throws MarvelException{
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new MarvelException(e.getMessage(), e);
            }
        }
    }

    private Set<Personaje> obtenerDePersonaje(String query) throws MarvelException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                Personaje personaje = new Personaje(id, nombre, genero, null,null,null);
                lista.add(personaje);
            }
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new MarvelException(e.getMessage(), e);
            }
        }
        return lista;
    }

    public Set<Personaje> findAllPersonaje() throws MarvelException {
        String query = "select p.id, p.nombre, p.genero from Personaje as p";
        return obtenerDePersonaje(query);
    }

    public Personaje findPersonaje(Personaje personaje) throws MarvelException {
        String query = "select p.id, p.nombre, p.genero from Personaje as p where id='"+personaje.getId()+"'";
        Set<Personaje> personajeSet = obtenerDePersonaje(query);
        if (personajeSet.isEmpty()){
            return null;
        }
        return personajeSet.iterator().next();
    }

    public boolean updatePersonaje(Personaje personaje) throws MarvelException {
        String query = "select p.id, p.nombre, p.genero from Personaje as p where id='"+personaje.getId()+"'";
        Set<Personaje> personajeSet = obtenerDePersonaje(query);
        if (personajeSet.isEmpty()){
            query = "INSERT INTO Personaje as p (id, nombre, genero)" +
                    " VALUES ('"+personaje.getId()+"'," +
                    " '"+personaje.getNombre()+"',"+
                    " '"+personaje.getGenero()+"')";
            actualizarPersonaje(query);
        }else {
            query = "update Personaje set nombre='"+personaje.getNombre()+"', " +
                    "genero='"+personaje.getGenero()+"' " +
                    "where id= '"+personaje.getId()+"'";
            actualizarPersonaje(query);
        }
        return true;
    }

    public void deletePersonaje(Personaje personaje) throws MarvelException {

        String query = "delete FROM Personaje" +
                " where id='"+personaje.getId()+"'";
        actualizarPersonaje(query);

    }

}
