package es.ies.puerto.negocio;

import es.ies.puerto.utilidades.Utilidades;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Root(name = "personaje")
public class Personaje extends Utilidades {

    @Element(name = "nombre")
    String nombre;
    @Element(name = "alias")
    String alias;
    @Element(name = "genero")
    String genero;
    @ElementList(name = "poderes",entry = "poder")
    List<String> poderes;

    public Personaje(){
        this.poderes = new ArrayList<>();
    };

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.poderes = new ArrayList<>();
    }

    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes.toString() +'\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    public String toCsv(){
        return nombre+DELIMITADOR+alias+DELIMITADOR+genero+DELIMITADOR+String.join(DELIMITADOR," "+poderes);
    }
}
