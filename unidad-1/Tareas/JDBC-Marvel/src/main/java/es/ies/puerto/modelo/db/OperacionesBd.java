package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Personajes;
import es.ies.puerto.modelo.original.Usuario;

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

    private Set<Personajes> obtenerPersonaje(String query) throws UsuarioException {
        Set<Personajes> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userName = rs.getString("nombre");
                String userAlias = rs.getString("alias");
                String userCity = rs.getString("genero");
                Personajes personaje = new Personajes(userId, userName, userAlias, userCity);
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
        String query = "select p.id, p.nombre, p.alias, p.genero from Personajes as p";
        return obtenerPersonaje(query);
    }

    public Personajes obtenerPersonaje(Personajes personajes) throws UsuarioException {
        String query = "select p.id, p.nombre, p.alias, p.genero from Personajes as p" +
                " where p.id='"+personajes.getId()+"'";
        Set<Personajes> lista = obtenerPersonaje(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personajes personaje) throws UsuarioException {
        String query = "INSERT INTO Personajes as p (nombre, alias, genero)" +
                " VALUES ('"+personaje.getNombre()+"',"
                + "'"+personaje.getAlias()+"'," +
                " '"+personaje.getGenero()+"')";
        actualizar(query);
    }

    public void actualizarPersonaje(Personajes personaje) throws UsuarioException{
        String query = "update Personajes set nombre='"+personaje.getNombre()+"', " +
                "alias='"+personaje.getAlias()+"', genero='"+personaje.getGenero()+"' " +
                "where id='"+personaje.getId()+"'";
        actualizar(query);
    }

    public void eliminarPersonaje(Personajes personaje) throws UsuarioException{
        String query = "delete FROM Personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        actualizar(query);
    }


}
