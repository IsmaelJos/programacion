package ies.puerto.modelo.fichero.csv.implementacion;

import ies.puerto.modelo.entity.*;
import ies.puerto.modelo.fichero.IFileInterface;
import ies.puerto.modelo.fichero.abstractas.FicheroAbstract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileCsv extends FicheroAbstract implements IFileInterface {

    public FileCsv(){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";
    }
    public List<Producto> obtenerAlimentos(){return obtenerProductos(FICHERO_ALIMENTOS,"alimento");}

    public List<Producto> obtenerAparatos(){return obtenerProductos(FICHERO_APARATOS,"aparato");}

    public List<Producto> obtenerSouvenirs(){return obtenerProductos(FICHERO_SOUVENIRS,"souvernir");}

    public List<Producto> obtenerCuidados(){return obtenerProductos(FICHERO_CUIDADO_PERSONAL,"cuidado");}


    public List<Producto> obtenerProductos(String path, String producto) {
        List<Producto> productos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(DELIMITADOR);
                        switch (producto) {
                            case "alimento":
                                productos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                productos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                productos.add(splitToDefault(arrayElemento)) ;
                                break;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return productos;
    }
    private Alimento splitToAlimento(String[] splitArray){
        return new Alimento(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3],
                splitArray[4]);
    }
    private Aparato splitToDefault(String[] splitArray) {
        return new Aparato(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3]);
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        return new CuidadoPersonal(
                splitArray[0],
                Float.parseFloat(splitArray[1]),
                splitArray[2],
                splitArray[3],
                Integer.parseInt(splitArray[4]));
    }

    public Producto obtenerAlimento(Producto producto){return obtenerProducto(FICHERO_ALIMENTOS,producto);}
    public Producto obtenerAparato(Producto producto){return obtenerProducto(FICHERO_APARATOS,producto);}
    public Producto obtenerSouvenir(Producto producto){return obtenerProducto(FICHERO_SOUVENIRS,producto);}
    public Producto obtenerCuidado(Producto producto){return obtenerProducto(FICHERO_CUIDADO_PERSONAL,producto);}
    public Producto obtenerProducto(String path, Producto producto){
        int contador=0;
        boolean encontrada = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null && !encontrada) {
                if(contador>0){
                    String[] datos = linea.split(DELIMITADOR);
                    String id = datos[3];
                    if (id == producto.getId()){
                        switch (path){
                            case ("src/main/resources/alimentos.csv"):
                                producto = new Alimento(datos[0],Float.parseFloat(datos[1]),datos[2],datos[3],datos[4]);
                                break;
                            case ("src/main/resources/aparatos.csv"):
                                producto = new Aparato(datos[0],Float.parseFloat(datos[1]),datos[2],datos[3]);
                                break;
                            case ("src/main/resources/souvenirs.csv"):
                                producto = new Souvenir(datos[0],Float.parseFloat(datos[1]),datos[2],datos[3]);
                                break;
                            case ("src/main/resources/cuidado-personal.csv"):
                                producto = new CuidadoPersonal(datos[0],Float.parseFloat(datos[1]),datos[2],datos[3],Integer.parseInt(datos[4]));
                                break;
                        }
                        encontrada = true;
                    }
                }
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return producto;
    }
    public void addAlimento(Producto producto){
        Producto productoBuscar = new Producto(producto.getId()) {};
        productoBuscar = obtenerAlimento(productoBuscar);
        if(productoBuscar.getNombre() == null){
            try (FileWriter writer = new FileWriter(FICHERO_ALIMENTOS, true)) {
                writer.write(producto.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void addAparato(Producto producto){
        Producto productoBuscar = new Producto(producto.getId()) {};
        productoBuscar = obtenerAparato(productoBuscar);
        if(productoBuscar.getNombre() == null){
            try (FileWriter writer = new FileWriter(FICHERO_APARATOS, true)) {
                writer.write(producto.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void addSouvenir(Producto producto){
        Producto productoBuscar = new Producto(producto.getId()) {};
        productoBuscar = obtenerSouvenir(productoBuscar);
        if(productoBuscar.getNombre() == null){
            try (FileWriter writer = new FileWriter(FICHERO_SOUVENIRS, true)) {
                writer.write(producto.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void addCuidado(Producto producto){
        Producto productoBuscar = new Producto(producto.getId()) {};
        productoBuscar = obtenerCuidado(productoBuscar);
        if(productoBuscar.getNombre() == null){
            try (FileWriter writer = new FileWriter(FICHERO_CUIDADO_PERSONAL, true)) {
                writer.write(producto.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void updateAlimento(Producto producto){updateProducto(FICHERO_ALIMENTOS,producto,obtenerAlimentos());}
    public void updateAparato(Producto producto){updateProducto(FICHERO_APARATOS,producto,obtenerAparatos());}
    public void updateSouvenir(Producto producto){updateProducto(FICHERO_SOUVENIRS,producto, obtenerSouvenirs());}
    public void updateCuidado(Producto producto){updateProducto(FICHERO_CUIDADO_PERSONAL,producto, obtenerCuidados());}

    public void updateProducto(String path,Producto producto, List<Producto> productos) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Producto p : productos) {
                if (Objects.equals(p.getId(), producto.getId())) {
                    writer.write(producto.toCsv()+ "\n");
                } else {
                    writer.write(p.toCsv()+ "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteAlimento(Producto producto){deleteProducto(FICHERO_ALIMENTOS,producto,obtenerAlimentos());}
    public void deleteAparato(Producto producto){deleteProducto(FICHERO_APARATOS,producto,obtenerAlimentos());}
    public void deleteSouvenir(Producto producto){deleteProducto(FICHERO_SOUVENIRS,producto,obtenerAlimentos());}
    public void deleteCuidado(Producto producto){deleteProducto(FICHERO_CUIDADO_PERSONAL,producto,obtenerAlimentos());}
    public void deleteProducto(String path,Producto productoBuscar, List<Producto> productos) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Producto producto : productos) {
                if (!Objects.equals(producto.getId(), productoBuscar.getId())) {
                    writer.write(producto.toCsv()+ "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean crearProducto(Producto producto) {
        return false;
    }

    @Override
    public boolean eliminarProducto(Producto producto) {
        return false;
    }

    @Override
    public List<Producto> obtenerProductos() {return null;}

    @Override
    public Producto obtenerProducto(Producto producto) {
        return null;
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
        return false;
    }

}
