package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPoder extends Conexion {
    public DaoPoder() throws MarvelException {
        super();
    }

    public void actualizarPoder(String query) throws MarvelException{
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

    private Set<Poder> obtenerDePoder(String query) throws MarvelException {
        Set<Poder> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String poderId = rs.getString("id");
                String nombre = rs.getString("nombre");
                Poder poder = new Poder(poderId, nombre);
                lista.add(poder);
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

    public Set<Poder> findAllPoder() throws MarvelException {
        String query = "select p.id, p.nombre from Poder as p";
        return obtenerDePoder(query);
    }

    public Poder findPoder(Poder poder) throws MarvelException {
        String query = "select p.id, p.nombre from Poder as p where p.id='"+poder.getId()+"'";
        Set<Poder> poderSet = obtenerDePoder(query);
        if (poderSet.isEmpty()){
            return null;
        }
        return poderSet.iterator().next();
    }

    public boolean updatePoder(Poder poder) throws MarvelException {

        String query = "select p.id, p.nombre from Poder as p where p.id='"+poder.getId()+"'";
        Set<Poder> lista = obtenerDePoder(query);
        if (lista.isEmpty()){
            query = "INSERT INTO Poder as p (id, nombre)" +
                    " VALUES ('"+poder.getId()+"'," +
                    " '"+poder.getNombre()+"')";
            actualizarPoder(query);
        }else {
            query = "update Poder set nombre='"+poder.getNombre()+"' " +
                    "where id= '"+poder.getId()+"'";
            actualizarPoder(query);
        }

        return true;
    }

    public void deletePoder(Poder poder) throws MarvelException {

        String query = "delete FROM Poder" +
                " where id='"+poder.getId()+"'";
        actualizarPoder(query);

    }


}
