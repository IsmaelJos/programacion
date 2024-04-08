package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.Personaje;
import es.ies.puerto.negocio.Personajes;

import java.security.PrivateKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesBd extends Conexion implements ICrud {
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
            rs = statement.executeQuery("select p.poder from Poderes as p where p.personaje_id= '"+idPersonaje+"'");
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

    private Set<Personaje> obtenerPersonaje(String query) throws UsuarioException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userName = rs.getString("nombre");
                String userTag = rs.getString("alias");
                String userGender = rs.getString("genero");
                List<String> userPowers = obtenerPoderes(rs.getString("id"));
                Personaje personaje = new Personaje(userName, userTag, userGender, userPowers);
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
