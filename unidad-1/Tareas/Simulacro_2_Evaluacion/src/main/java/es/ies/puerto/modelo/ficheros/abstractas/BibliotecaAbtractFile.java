package es.ies.puerto.modelo.ficheros.abstractas;

import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.File;

public class BibliotecaAbtractFile {
    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public boolean esDirectorio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isDirectory();
    }

}
