package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/usuarios.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";

    Usuario usuario;
    @BeforeEach
    public void beforeEach() {
        operacionesBd = new OperacionesBd(urlBd);
        usuario = new Usuario("11","pepe",20,"miciudad");
    }

    @Test
    public void obtenerUsuariosAllTest() {
        try {
            Set<Usuario> lista = operacionesBd.obtenerUsuarios();
            Assertions.assertEquals(10, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest() {
        Usuario usuario = new Usuario("5");
        try {
            usuario = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getEdad(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarUsuarioTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerUsuarios().size();
            operacionesBd.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarUsuario(usuarioObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerUsuarios().size();
            Assertions.assertEquals(numeroUsuarios,numeroUsuariosFinal,MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void actualizarUsuario(){
        String nombreUpdate = "pepe Juan";
        int edadUpdate = 22;
        String ciudadUpdate = "Miami";
        try {
            operacionesBd.insertarUsuario(usuario);
            usuario.setCiudad(ciudadUpdate);
            usuario.setEdad(edadUpdate);
            usuario.setNombre(nombreUpdate);
            operacionesBd.actualizarUsuario(usuario);
            Usuario usuarioEncontrado = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getCiudad(),usuarioEncontrado.getCiudad(),MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getEdad(),usuarioEncontrado.getEdad(),MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
            operacionesBd.eliminarUsuario(usuarioEncontrado);
        } catch (UsuarioException e) {
            Assertions.fail(MESSAGE_ERROR+":"+e.getMessage());
        }
    }

}
