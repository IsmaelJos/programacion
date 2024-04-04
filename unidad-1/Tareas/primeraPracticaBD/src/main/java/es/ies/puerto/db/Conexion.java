package es.ies.puerto.db;

import es.ies.puerto.exeption.UsuarioExeption;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;
    private String url;
    private String user;
    private String password;

    public Conexion(String url) {
        this.url = "jdbc.sqlite"+url;
    }

    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    public Connection getConexion() throws UsuarioExeption {
        try {
           // Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(url);
        } catch (Exception exception) {
            throw new UsuarioExeption("no se ha podido establecer la conexion", exception);
        }
        return con;
    }
}
