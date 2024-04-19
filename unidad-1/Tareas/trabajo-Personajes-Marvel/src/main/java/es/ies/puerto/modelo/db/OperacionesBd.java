package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.modelo.interfaces.ICrudDB;
import es.ies.puerto.negocio.PersonajeDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesBd extends Conexion implements ICrudDB {
    public OperacionesBd(String url) {super(url);}

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

    public List<String> obtenerPoderes(String idPersonaje) throws UsuarioException {
        List<String> list = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery("select p.poder from Poderes as p where p.personaje_id = '"+idPersonaje+"'");
            while (rs.next()) {
                list.add(rs.getString("poder"));
            }
        }catch (SQLException exception){
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

        return list;
    }

    private Set<PersonajeDB> obtener(String query) throws UsuarioException {
        Set<PersonajeDB> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userName = rs.getString("nombre");
                String userTag = rs.getString("alias");
                String userGender = rs.getString("genero");
                List<String> userPowers = obtenerPoderes(rs.getString("id"));
                PersonajeDB personaje = new PersonajeDB(userId,userName, userTag, userGender, userPowers);
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

    @Override
    public Set<PersonajeDB> obtenerPersonajes() throws UsuarioException {
        String query = "select p.id, p.nombre, p.alias, p.genero from personajes as p";
        return obtener(query);
    }

    @Override
    public PersonajeDB obtenerPersonaje(PersonajeDB personaje) throws UsuarioException {
        String query = "select p.id, p.nombre, p.alias, p.genero from personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        Set<PersonajeDB> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    @Override
    public void addPersonaje(PersonajeDB personaje) throws UsuarioException {
        String query = "INSERT INTO personajes as p (id, nombre, alias, genero)"
                + " VALUES ("
                + personaje.getId()+","
                + " '"+personaje.getNombre()+"',"
                + " '"+personaje.getAlias()+"',"
                + " '"+personaje.getGenero()+"')";
        actualizar(query);
    }

    @Override
    public void deletePersonaje(PersonajeDB personaje) throws UsuarioException{
        String query = "delete FROM personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        actualizar(query);
    }

    @Override
    public void updatePersonaje(PersonajeDB personaje) throws UsuarioException{
        String query = "update personajes set nombre='"+personaje.getNombre()+"', " +
                "alias='"+personaje.getAlias()+"', genero='"+personaje.getGenero()+"'" +
                "where id='"+personaje.getId()+"'";
        actualizar(query);
    }
}
