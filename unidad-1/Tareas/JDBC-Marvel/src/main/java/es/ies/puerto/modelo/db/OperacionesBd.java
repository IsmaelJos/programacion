package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personajes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends Conexion{

    public OperacionesBd(String url) throws UsuarioException {
        super(url);
    }

    private void actualizar(String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
    }

    private Set<Personajes> obtenerDePersonaje(String query) throws UsuarioException {
        Set<Personajes> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userName = rs.getString("nombre");
                String userCity = rs.getString("genero");
                Personajes personaje = new Personajes(userId, userName, userCity);
                lista.add(personaje);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
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
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }
    public Set<Personajes> obtenerPersonajes() throws UsuarioException {
        String query = "select p.id, p.nombre, p.genero from Personajes as p";
        return obtenerDePersonaje(query);
    }

    public Personajes obtenerPersonaje(Personajes personajes) throws UsuarioException {
        String query = "select p.id, p.nombre, p.genero from Personajes as p" +
                " where p.nombre='"+personajes.getNombre()+"'";
        Set<Personajes> lista = obtenerDePersonaje(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personajes personaje) throws UsuarioException {
        String query = "INSERT INTO Personajes as p (nombre, genero)" +
                " VALUES ('"+personaje.getNombre()+"'," +
                " '"+personaje.getGenero()+"')";
        actualizar(query);
    }

    public void actualizarPersonaje(Personajes personaje) throws UsuarioException{
        String query = "update Personajes set genero='"+personaje.getGenero()+"' " +
                "where nombre= '"+personaje.getNombre()+"'";
        actualizar(query);
    }

    public void eliminarPersonaje(Personajes personaje) throws UsuarioException{
        String query = "delete FROM Personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        actualizar(query);
    }


     Set<Alias> obtenerDeAlias(String query) throws UsuarioException {
        Set<Alias> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int aliasId = rs.getInt("id");
                int personajeId = rs.getInt("personaje_id");
                String aliasAlias = rs.getString("alias");
                Alias alias = new Alias(aliasId, personajeId, aliasAlias);
                lista.add(alias);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
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
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }
    public Set<Alias> obtenerAlias() throws UsuarioException {
        String query = "select a.id, a.alias, a.personaje_id from Alias as a";
        return obtenerDeAlias(query);
    }
    public Alias obtenerAlias(Alias alias) throws UsuarioException {
        String query = "select a.id, a.personaje_id, a.alias from Alias as a" +
                " where a.alias='"+alias.getAlias()+"'";
        Set<Alias> lista = obtenerDeAlias(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

}
