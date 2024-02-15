package es.ies.puerto.modelo.ficheros.csv.implementacion;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;
import es.ies.puerto.modelo.ficheros.abstractas.BibliotecaAbtractFile;
import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.File;
import java.util.List;

public class BibliotecaCSV extends BibliotecaAbtractFile implements IBiblioteca {
    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {

        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity eliminarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

}
