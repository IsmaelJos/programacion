package es.ies.puerto.negocio;

import es.ies.puerto.modelo.Alimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    Tienda tienda;
    String id = "idAlimento";
    String nombre = "nombreAlimento";
    String nombreActualizar = "nombreAlimentoActualizada";
    float precio = 2f;
    float precioActualizar = 3f;
    String fechaEntrada = "01/03/24";
    String fechaEntradaActualizar = "02/03/24";
    String fechaCaducidad = "16/03/24";
    String fechaCaducidadActualizar = "17/03/24";


    Alimento alimento;

    @BeforeEach
    public void beforeEach(){
        tienda = new Tienda();
        alimento = new Alimento(id,nombre,precio,fechaEntrada,fechaCaducidad);
        tienda.crearProducto(alimento);
    }
    @Test
    public void tiendaNotNullTest(){
        tienda = new Tienda();
        Assertions.assertNotNull(tienda,"No puede ser null");
    }
    @Test
    public void addAlimentoTiendaTest(){

        Assertions.assertEquals(1,tienda.obtenerProductos().size(),
                "No se ha obtrenido el tamaño adecuado");
    }
    @Test
    public void eliminarAlimentoTiendaTest(){
        tienda.eliminarProducto(alimento);
        Assertions.assertEquals(0,tienda.obtenerProductos().size(),
                "No se ha obtrenido el tamaño adecuado");
    }
    @Test
    public void obtenerAlimentoTiendaTest(){
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombre,alimentoBuscar.getNombre(),"");
        Assertions.assertEquals(precio,alimentoBuscar.getPrecio(),"");
        Assertions.assertEquals(id,alimentoBuscar.getId(),"");
        Assertions.assertEquals(fechaEntrada,alimentoBuscar.getfEntrada(),"");
        Assertions.assertEquals(fechaCaducidad,alimentoBuscar.getfCaducidad(),"");
    }
    @Test
    public void obtenerAlimentoNoExisteTiendaTest(){
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar,"no se ha obtenido el valor esperado");
    }
    @Test
    public void actualizarAlimentoTiendaTest(){
        Alimento alimentoActualizar = new Alimento(id,nombreActualizar,
                precioActualizar,fechaEntradaActualizar,fechaCaducidadActualizar);
        tienda.actualizarProducto(alimentoActualizar);
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombreActualizar,alimentoBuscar.getNombre(),"");
        Assertions.assertEquals(precioActualizar,alimentoBuscar.getPrecio(),"");
        Assertions.assertEquals(fechaEntradaActualizar,alimentoBuscar.getfEntrada(),"");
        Assertions.assertEquals(fechaCaducidadActualizar,alimentoBuscar.getfCaducidad(),"");
    }
}
