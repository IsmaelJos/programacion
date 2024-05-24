package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Alias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoAlias extends Conexion {

    public DaoAlias() throws MarvelException {
        super();
    }

    public void actualizarAlias(String query) throws MarvelException{
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

    private Set<Alias> obtenerDeAlias(String query) throws MarvelException {
        Set<Alias> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String aliasId = rs.getString("id");
                String aliasDescripcion = rs.getString("alias");
                String characterId = rs.getString("personaje_id");
                Alias alias = new Alias(aliasId, aliasDescripcion, characterId);
                lista.add(alias);
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

    public Set<Alias> findAllAlias() throws MarvelException {
        String query = "select a.id, a.alias, a.personaje_id from Alias as a";
        return obtenerDeAlias(query);
    }

    public Alias findAlias(Alias alias) throws MarvelException {
        String query = "select a.id, a.alias, a.personaje_id from Alias as a where a.id='"+alias.getId()+"'";
        Set<Alias> aliasSet = obtenerDeAlias(query);
        if (aliasSet.isEmpty()){
            return null;
        }
        return aliasSet.iterator().next();
    }

    public boolean updateAlias(Alias alias) throws MarvelException {
        String query = "select a.id, a.alias, a.personaje_id from Alias as a where a.id='"+alias.getId()+"'";
        Set<Alias> lista = obtenerDeAlias(query);
        if (lista.isEmpty()){
            query = "INSERT INTO Alias as a (id, personaje_id, alias)" +
                    " VALUES ('"+alias.getId()+"',"  +
                    "'"+alias.getPersonaje_id()+"'," +
                    " '"+alias.getDescripcion()+"')";
            actualizarAlias(query);
        }else {
            query = "update Alias set alias='"+alias.getDescripcion()+"' " +
                    "where id= '"+alias.getId()+"'";
            actualizarAlias(query);
        }

        return true;
    }

    public boolean deleteAlias(Alias alias) throws MarvelException {
        String query = "delete FROM Alias" +
                " where id='"+alias.getId()+"'";
        actualizarAlias(query);
        return true;
    }


}
