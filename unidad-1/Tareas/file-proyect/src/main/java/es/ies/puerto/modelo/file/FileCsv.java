package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass {
    String path ="src/main/resources/data.csv";
    public List<Persona> obtenerPersonas(){
        List<Persona> personas = new ArrayList<>();
        int contador=0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if(contador>0){
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    String email = datos[3];
                    personas.add(new Persona(id, nombre, edad, email));
                }
                contador++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }
    public Persona obtenerPersona(Persona persona){
        int contador=0;
        Boolean encontrada = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null && !encontrada) {
                if(contador>0){
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    if (id == persona.getId()){
                        String nombre = datos[1];
                        int edad = Integer.parseInt(datos[2]);
                        String email = datos[3];
                        persona.setNombre(nombre);
                        persona.setEdad(edad);
                        persona.setEmail(email);
                        encontrada = true;
                    }
                }
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;
    }
    public void addPersona(Persona persona){
        Persona personaBuscar = new Persona(persona.getId());
        personaBuscar = obtenerPersona(personaBuscar);
        if(personaBuscar.getNombre() == null){
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(persona.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
