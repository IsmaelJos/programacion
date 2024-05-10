package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoEquipamiento  extends Conexion {

    public DaoEquipamiento() throws MarvelException {
        super();
    }

    public void actualizarEquipamiento(String query) throws MarvelException{
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

    private Set<Equipamiento> obtenerDeEquipamiento(String query) throws MarvelException {
        Set<Equipamiento> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String personaje_id = rs.getString("personaje_id");
                Equipamiento equipamiento = new Equipamiento(id, nombre, descripcion, personaje_id);
                lista.add(equipamiento);
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

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        String query = "select e.id, e.nombre, e.descripcion, e.personaje_id from Equipamiento as e";
        return obtenerDeEquipamiento(query);
    }

    public Equipamiento findEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "select e.id, e.nombre, e.descripcion, e.personaje_id from Equipamiento as e where id='"+equipamiento.getId()+"'";
        Set<Equipamiento> equipamientoSet = obtenerDeEquipamiento(query);
        if (equipamientoSet.isEmpty()){
            return null;
        }
        return equipamientoSet.iterator().next();
    }

    public boolean updateEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "select e.id, e.nombre, e.descripcion, e.personaje_id from Equipamiento as e where id='"+equipamiento.getId()+"'";
        Set<Equipamiento> equipamientoSet = obtenerDeEquipamiento(query);
        if (equipamientoSet.isEmpty()){
            query = "INSERT INTO Equipamiento as e (id, nombre, descripcion, personaje_id)" +
                    " VALUES ('"+equipamiento.getId()+"'," +
                    " '"+equipamiento.getNombre()+"',"+
                    " '"+equipamiento.getDescripcion()+"',"+
                    " '"+equipamiento.getPersonaje_id()+"')";
            actualizarEquipamiento(query);
        }else {
            query = "update Equipamiento set nombre='"+equipamiento.getNombre()+"', " +
                    "descripcion='"+equipamiento.getDescripcion()+"', " +
                    "personaje_id='"+equipamiento.getPersonaje_id()+"' " +
                    "where id= '"+equipamiento.getId()+"'";
            actualizarEquipamiento(query);
        }

        return true;
    }

    public void deleteEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "delete FROM Equipamiento" +
                " where id='"+equipamiento.getId()+"'";
        actualizarEquipamiento(query);
    }


}
