package es.ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lectura("pepe.scv");
        System.out.println(alimentos);

    }
    public static List<Articulo> lectura(String path) {
        List<Articulo> articulos = new ArrayList<>();
        if(existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] alimentoArray = linea.split(",");
                        Alimento alimento = new Alimento(
                                alimentoArray[3], alimentoArray[0],
                                Float.parseFloat(alimentoArray[1]), alimentoArray[4],
                                alimentoArray[2]);
                        articulos.add(alimento);
                    }
                    i++;
                }
            } catch (IOException e) {
                // Manejar la excepción en caso de error de lectura
                e.printStackTrace();
            }
        }
        return articulos;
    }

    private static boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
}
