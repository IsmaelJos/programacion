package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.UsuarioException;
import es.ies.puerto.negocio.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;
    String nombre = "Iron Man";
    String alias = "Tony Stark";
    String genero = "Masculino";
    List<String> poderes = Arrays.asList("Vuelo","Armadura tecnológica avanzada","Rayos láser");
    @BeforeEach
    public void beforeEach() {
        operacionesBd = new OperacionesBd(urlBd);
        personaje = new Personaje(nombre,alias,genero,poderes);
    }
    @Test
    public void obtenerPoderesTest(){
        try {
            List<String> poderes = operacionesBd.obtenerPoderes("1");
            Assertions.assertNotNull(poderes, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }

    }
}
