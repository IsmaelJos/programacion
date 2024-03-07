package ies.puerto.presentacion;

import ies.puerto.modelo.entity.*;
import ies.puerto.negocio.TiendaNegocio;

import java.util.Scanner;

public class AppTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiendaNegocio tiendaNegocio = new TiendaNegocio();
        tiendaNegocio.setAlimentos(tiendaNegocio.obtenerAlimentosCsv());
        tiendaNegocio.setAparatos(tiendaNegocio.obtenerAparatosCsv());
        tiendaNegocio.setCuidados(tiendaNegocio.obtenerCuidadosCsv());
        tiendaNegocio.setSouvenirs(tiendaNegocio.obtenerSouvenirsCsv());



        System.out.println(
                "Elije sobre cual producto quiere operar"+"\n"+
                        "1. Alimento"+"\n"+
                        "2. Aparato"+"\n"+
                        "3. Cuidado Personal"+"\n"+
                        "4. Souvenir");
        int opcion = scanner.nextInt();
        int opcion2 = 0;


        switch (opcion) {
            case 1:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        tiendaNegocio.anadirAlimento(new Alimento(pedirNombre(),pedirPrecio(),pedirFechaEntrega(),pedirID(),pedirFechaCaducidad()));
                        System.out.println("Se ha creado el producto");
                        break;
                    case 2:
                        System.out.println(tiendaNegocio.buscarAlimento(pedirID()));
                        break;
                    case 3:
                        /*
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        fechaCaducidad = pedirFechaCaducidad();
                        tienda.removeAlimento(id);
                        tienda.addAlimento(nombre,precio,fechaEntrega,id,fechaCaducidad);
                        break;
                        */
                        break;
                    case 4:
                        /*
                        id = pedirID();
                        tienda.removeAlimento(id);
                        break;
                        */
                        break;
                    case 5:
                        tiendaNegocio.leerAlimentos();
                        break;
                }
                break;
            case 2:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        tiendaNegocio.anadirAparato(new Aparato(pedirNombre(),pedirPrecio(),pedirFechaEntrega(),pedirID()));
                        System.out.println("Se ha creado el producto");
                        break;
                    case 2:
                        System.out.println(tiendaNegocio.buscarAparato(pedirID()));
                        break;
                    case 3:
                        /*
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.removeAparato(id);
                        tienda.addAparato(nombre,precio,fechaEntrega,id);
                        break;
                         */
                        break;

                    case 4:
                        /*
                        id = pedirID();
                        tienda.removeAparato(id);
                        */
                        break;

                    case 5:
                        tiendaNegocio.leerAparatos();
                        break;
                }
                break;
            case 3:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        tiendaNegocio.anadirCuidados(new CuidadoPersonal(pedirNombre(),pedirPrecio(),pedirFechaEntrega(),pedirID(),pedirPopularidad()));
                        System.out.println("Se ha creado el producto");
                        break;
                    case 2:
                        System.out.println(tiendaNegocio.buscarCuidado(pedirID()));
                        break;
                    case 3:
                        /*
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        popularidad = pedirPopularidad();
                        tienda.removeCuidadoPersonal(id);
                        tienda.addCuidadoPersonal(nombre,precio,fechaEntrega,id,popularidad);
                        break;
                         */
                        break;
                    case 4:
                        /*
                        id = pedirID();
                        tienda.removeCuidadoPersonal(id);
                        break;
                         */
                        break;
                    case 5:
                        tiendaNegocio.leerCuidados();
                        break;
                }
                break;
            case 4:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        tiendaNegocio.anadirSouvenir(new Souvenir(pedirNombre(),pedirPrecio(),pedirFechaEntrega(),pedirID()));
                        System.out.println("Se ha creado el producto");
                        break;
                    case 2:
                        System.out.println(tiendaNegocio.buscarSouvenir(pedirID()));
                        break;
                    case 3:
                        /*
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.removeSouvenir(id);
                        tienda.addSouvenir(nombre,precio,fechaEntrega,id);
                        break;
                         */
                        break;
                    case 4:
                        /*
                        id = pedirID();
                        tienda.removeSouvenir(id);
                        break;
                         */
                        break;
                    case 5:
                        tiendaNegocio.leerSouvenirs();
                        break;
                }
                break;
            default:
                System.out.println("Ha escojido un numero fuera del rango");
                break;
        }
    }
    public static int pedirEleccion2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Elija uno de las siguientes opciones" +"\n"+
                        "1. Añadir"+"\n"+
                        "2. Obtener"+"\n"+
                        "3. Modificar"+"\n"+
                        "4. Eliminar"+"\n"+
                        "5. Mostrar todos");
        return scanner.nextInt();
    }
    public static String pedirNombre(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada un nombre");
        return scanner.nextLine();
    }
    public static float pedirPrecio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada un precio");
        return scanner.nextInt();
    }
    public static String pedirFechaEntrega(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada un Fecha de Entrega");
        return scanner.nextLine();
    }
    public static String pedirID(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada un ID");
        return scanner.nextLine();
    }
    public static String pedirFechaCaducidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada un Fecha de Caducidad");
        return scanner.nextLine();
    }
    public static int pedirPopularidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Añada la popularidad");
        return scanner.nextInt();
    }
}
