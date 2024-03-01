package ies.puerto.presentacion;

import java.util.HashMap;
import java.util.Scanner;

public class AppTiendaOld {
    /*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Alimento> AlimentosHashMap = new HashMap<>();
        HashMap<String, Aparato> aparatoHashMap = new HashMap<>();
        HashMap<String, CuidadoPersonal> cuidadoPersonalHashMap = new HashMap<>();
        HashMap<String, Souvenir> souvenirHashMap = new HashMap<>();
        Tienda tienda = new Tienda(AlimentosHashMap,aparatoHashMap,cuidadoPersonalHashMap,souvenirHashMap);
        String nombre;
        float precio;
        String fechaEntrega;
        String id;
        String fechaCaducidad;
        int popularidad;
        int opcion2 = 0;
        System.out.println(
                "Elije sobre cual producto quiere operar"+"\n"+
                "1. Alimento"+"\n"+
                "2. Aparato"+"\n"+
                "3. Cuidado Personal"+"\n"+
                "4. Souvenir");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        fechaCaducidad = pedirFechaCaducidad();
                        tienda.addAlimento(nombre,precio,fechaEntrega,id,fechaCaducidad);
                        break;
                    case 2:
                        id = pedirID();
                        System.out.println(tienda.getAlimento(id));
                        break;
                    case 3:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        fechaCaducidad = pedirFechaCaducidad();
                        tienda.removeAlimento(id);
                        tienda.addAlimento(nombre,precio,fechaEntrega,id,fechaCaducidad);
                        break;
                    case 4:
                        id = pedirID();
                        tienda.removeAlimento(id);
                        break;
                }
                break;
            case 2:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.addAparato(nombre,precio,fechaEntrega,id);
                        break;
                    case 2:
                        id = pedirID();
                        System.out.println(tienda.getAparato(id));
                        break;
                    case 3:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.removeAparato(id);
                        tienda.addAparato(nombre,precio,fechaEntrega,id);
                        break;
                    case 4:
                        id = pedirID();
                        tienda.removeAparato(id);
                        break;
                }
                break;
            case 3:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        popularidad = pedirPopularidad();
                        tienda.addCuidadoPersonal(nombre,precio,fechaEntrega,id,popularidad);
                        break;
                    case 2:
                        id = pedirID();
                        System.out.println(tienda.getCuidadoPersonal(id));
                        break;
                    case 3:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        popularidad = pedirPopularidad();
                        tienda.removeCuidadoPersonal(id);
                        tienda.addCuidadoPersonal(nombre,precio,fechaEntrega,id,popularidad);
                        break;
                    case 4:
                        id = pedirID();
                        tienda.removeCuidadoPersonal(id);
                        break;
                }
                break;
            case 4:
                opcion2 = pedirEleccion2();
                switch (opcion2){
                    case 1:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.addSouvenir(nombre,precio,fechaEntrega,id);
                        break;
                    case 2:
                        id = pedirID();
                        System.out.println(tienda.getSouvenir(id));
                        break;
                    case 3:
                        nombre = pedirNombre();
                        precio = pedirPrecio();
                        fechaEntrega = pedirFechaEntrega();
                        id = pedirID();
                        tienda.removeSouvenir(id);
                        tienda.addSouvenir(nombre,precio,fechaEntrega,id);
                        break;
                    case 4:
                        id = pedirID();
                        tienda.removeSouvenir(id);
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
                "4. Eliminar");
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
*/
}
