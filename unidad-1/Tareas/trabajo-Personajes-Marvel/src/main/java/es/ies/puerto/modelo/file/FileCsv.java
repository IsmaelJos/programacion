package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.interfaces.ICrud;
import es.ies.puerto.negocio.archivos.Personaje;
import es.ies.puerto.utilidades.Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends Utilidades implements ICrud {

    List<Personaje> personajes;

    String path = "src/main/resources/datos.csv";

    @Override
    public List<Personaje> obtenerPersonajes() {
        List<Personaje> personajes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {

                    String[] datos = linea.split(DELIMITADOR);
                    String nombre = datos[0];
                    String alias = datos[1];
                    String genero = datos[2];
                    List<String> newPoderes = new ArrayList<>();
                    for (int i = 3; i < datos.length; i++) {
                        newPoderes.add(datos[i]);
                    }
                    //List<String> poderes = Arrays.asList(datos[3].split(DELIMITADOR));
                    Personaje personaje = new Personaje(nombre, alias, genero, newPoderes);
                    personajes.add(personaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                if (nombre.equals(personaje.getNombre())) {
                    String alias = datos[1];
                    String genero = datos[2];
                    List<String> newPoderes = new ArrayList<>();
                    for (int i = 3; i < datos.length; i++) {
                        newPoderes.add(datos[i]);
                    }
                    personaje.setAlias(alias);
                    personaje.setGenero(genero);
                    personaje.setPoderes(newPoderes);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaje;
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        Personaje personajeBuscar = new Personaje(personaje.getNombre());
        personajeBuscar = obtenerPersonaje(personajeBuscar);
        if (personajeBuscar.getAlias() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(personaje.toCsv()+'\'');
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        List<Personaje> personajes = obtenerPersonajes();
        personajes.remove(personaje);
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personajeFile : personajes) {
                writer.write(personajeFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePersonaje(Personaje personaje) {
        List<Personaje> personajes = obtenerPersonajes();
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personajeFile : personajes) {
                if (personajeFile.equals(personaje)) {
                    writer.write(personaje.toCsv() + "\n");
                } else {
                    writer.write(personajeFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
