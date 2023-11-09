package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    String autor = "a";
    String titulo = "b";
    int anioPublicacion = 1979;
    Libro libro;

    @BeforeEach
    public void beforeEach(){
       libro = new Libro(titulo,autor,anioPublicacion);
    }

     @Test
    public void constructorTest(){
         Assertions.assertEquals(autor,libro.getAutor(),"No se ha obtenido el resultado esperado");
         Assertions.assertEquals(titulo,libro.getTitulo(),"No se ha obtenido el resultado esperado");
         Assertions.assertEquals(anioPublicacion,libro.getAnioPublicacion(),"No se ha obtenido el resultado esperado");
    }
    @Test
    public void setTituloTest(){
        String miTitulo = "otro Titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo,libro.getTitulo(),"No se ha obtenido el resultado esperado");
    }
    @Test
    public void setAutorTest(){
        String miAutor = "otro Autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor,libro.getAutor(),"No se ha obtenido el resultado esperado");
    }
    @Test
    public void setAnioTest(){
        int miAnio = 1833;
        libro.setAnioPublicacion(miAnio);
        Assertions.assertEquals(miAnio,libro.getAnioPublicacion(),"No se ha obtenido el resultado esperado");
    }

}
