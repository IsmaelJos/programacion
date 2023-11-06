package ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(){}

    public Libro(String titulo){
        this.titulo = titulo;
    }

    public Libro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(String titulo,int anioPublicacion){
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    public Libro(String titulo,String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String imprimir(){
        return "Titulo: "+titulo+" Autor: "+autor+" Año de publicacion: "+anioPublicacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
