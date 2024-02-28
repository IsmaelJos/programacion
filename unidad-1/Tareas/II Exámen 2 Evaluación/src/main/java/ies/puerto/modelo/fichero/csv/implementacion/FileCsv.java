package ies.puerto.modelo.fichero.csv.implementacion;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Aparato;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.entity.Producto;
import ies.puerto.modelo.fichero.IFileInterface;
import ies.puerto.modelo.fichero.abstractas.FicheroAbstract;

import java.io.*;
import java.util.*;

public class FileCsv extends FicheroAbstract implements IFileInterface {

    public FileCsv(){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";
    }
    public List<Producto> obtenerAlimentos(){return lectura(FICHERO_ALIMENTOS,"alimento");}

    public List<Producto> obtenerAparatos(){return lectura(FICHERO_APARATOS,"aparato");}

    public List<Producto> obtenerSouvenirs(){return lectura(FICHERO_SOUVENIRS,"souvernir");}

    public List<Producto> obtenerCuidados(){return lectura(FICHERO_CUIDADO_PERSONAL,"cuidado");}

    @Override
    public List<Producto> lectura(String path, String producto) {
        List<Producto> articulos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (producto) {
                            case "alimento":
                                articulos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                articulos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                articulos.add(splitToDefault(arrayElemento)) ;
                                break;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
    private Alimento splitToAlimento(String[] splitArray){
        return new Alimento(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3],
                splitArray[4]);
    }
    private Aparato splitToDefault(String[] splitArray) {
        return new Aparato(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3]);
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        return new CuidadoPersonal(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3],
                Integer.parseInt(splitArray[4]));
    }

    @Override
    public boolean escritura(String tipoProducto, String contenido) {
        switch (tipoProducto) {
            case "alimento":
                return almacenarEnFichero(FICHERO_ALIMENTOS, contenido);
            case "aparato":
                return almacenarEnFichero(FICHERO_APARATOS, contenido);
            case "cuidado-personal":
                return almacenarEnFichero(FICHERO_CUIDADO_PERSONAL, contenido);
            case "soubenir":
                return almacenarEnFichero(FICHERO_SOUVENIRS, contenido);
            default:
                return false;
        }
    }
}
