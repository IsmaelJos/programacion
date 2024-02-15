package es.ies.puerto.modelo.entity;

public class LibroEntity {
    private String isbn;
    private String titulo;
    private String autor;
    private String publicacion;
    private int idBiblioteca;

    public LibroEntity(String isbn, String titulo, String autor, String publicacion, int idBiblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.idBiblioteca = idBiblioteca;
    }

    public String getIsbn() {
        return isbn;
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

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

}
