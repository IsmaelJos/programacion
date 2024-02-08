package es.ies.puerto.app;

import es.ies.puerto.productos.Alimento;
import es.ies.puerto.productos.Electronica;
import es.ies.puerto.productos.Soubenir;
import es.ies.puerto.productos.Supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AppTienda {
    public static void main(String[] args) {
        HashSet<Alimento> alimentos = new HashSet<>();
        ArrayList<Electronica> electronicas = new ArrayList<>();
        HashMap<String, Soubenir> soubenirs = new HashMap<>();
        Supermercado supermercado = new Supermercado(alimentos,electronicas,soubenirs);
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Elija el ARTICULO seleccionando el numero"+"\n"+
                        "1 ALIMENTO"+"\n"+
                        "2 ELECTRONICA"+"\n"+
                        "3 SOUBENIR"+"\n"
        );
        int eleccion = scanner.nextInt();
        int eleccion2 = 0;
        String nombre = "";
        float precio = 0;
        String fechaEntrada = "";
        String udi = "";
        switch (eleccion){
            case 1 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir "+"\n"+
                                "2 Mostrar "+"\n"+
                                "3 Eliminar "+"\n"+
                                "4 Modificar "+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca el nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.addAlimento(new Alimento(nombre,precio,fechaEntrada,udi));
                        System.out.println("ALIMENTO añadido");
                        break;
                    case 2 :
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        System.out.println(supermercado.obtenerAlimento(udi));
                        break;
                    case 3 :
                        System.out.println("Introduzca la nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeAlimento(new Alimento(nombre,precio,fechaEntrada,udi));
                        System.out.println("ALIMENTO eliminado");
                        break;
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeAlimento(supermercado.obtenerAlimento(udi));
                        supermercado.addAlimento(new Alimento(nombre,precio,fechaEntrada,udi));
                        System.out.println("Se han hecho los cambios a su ALIMENTO");
                        break;
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                        break;
                }
                break;
            case 2 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir "+"\n"+
                                "2 Mostrar "+"\n"+
                                "3 Eliminar "+"\n"+
                                "4 Modificar "+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca el nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.addElectronica(new Electronica(nombre,precio,fechaEntrada,udi));
                        System.out.println("ELECTRONICA añadido");
                        break;
                    case 2 :
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        System.out.println(supermercado.obtenerElectronica(udi));
                        break;
                    case 3 :
                        System.out.println("Introduzca la nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeElectronica(new Electronica(nombre,precio,fechaEntrada,udi));
                        System.out.println("ELECTRONICA eliminado");
                        break;
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeElectronica(supermercado.obtenerElectronica(udi));
                        supermercado.addElectronica(new Electronica(nombre,precio,fechaEntrada,udi));
                        System.out.println("Se han hecho los cambios a su ELECTRONICA");
                        break;
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                        break;
                }
                break;
            case 3 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir "+"\n"+
                                "2 Mostrar "+"\n"+
                                "3 Eliminar "+"\n"+
                                "4 Modificar "+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2) {
                    case 1 :
                        System.out.println("Introduzca el nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.addSoubenir(new Soubenir(nombre,precio,fechaEntrada,udi));
                        System.out.println("SOUBENIR añadido");
                        break;
                    case 2 :
                        System.out.print("Introduzca la udi");
                        udi = scanner.nextLine();
                        System.out.println(supermercado.obtenerSoubenir(udi));
                        break;
                    case 3 :
                        System.out.print("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeSoubenir(udi);
                        System.out.println("SOUBENIR eliminado");
                        break;
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la nombre");
                        nombre = scanner.nextLine();
                        System.out.println("Introduzca el precio");
                        precio = scanner.nextInt();
                        System.out.println("Introduzca la fechaEntrada");
                        fechaEntrada = scanner.nextLine();
                        System.out.println("Introduzca la udi");
                        udi = scanner.nextLine();
                        supermercado.removeSoubenir(udi);
                        supermercado.addSoubenir(new Soubenir(nombre,precio,fechaEntrada,udi));
                        System.out.println("Se han hecho los cambios a su SOUBENIR");
                        break;
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                        break;
                }
            default:
                System.out.println("Ha elegido un numero fuera del margen, " +
                        "eliga 1,2 o 3 dependiendo de lo que este buscando");
                break;
        }
    }
}
