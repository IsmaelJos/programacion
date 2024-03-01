package ies.puerto.modelo.fichero.abstractas;

import ies.puerto.modelo.entity.Producto;

import java.io.*;

public abstract class FicheroAbstract {
    public String FICHERO_ALIMENTOS="";
    public String FICHERO_APARATOS="";
    public String FICHERO_CUIDADO_PERSONAL="";
    public String FICHERO_SOUVENIRS="";

    public boolean existeFichero(String path){
        if (path == null|| path.isEmpty()){
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public boolean almacenarEnFichero(String path, String texto){
        if (!existeFichero(path)){
            return false;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public Producto buscarEnFichero(String key){
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String[] nextLine;
        boolean found = false;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine[0].equals(key)) {
                System.out.println("Registro encontrado: " + String.join(",", nextLine));
                found = true;
                return String.join(",", nextLine);
                break;
            }
            reader.close();
    }
}
