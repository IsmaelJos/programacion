package es.ies.puerto.app;

import es.ies.puerto.vehiculos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AppConcecionario {
    public static void main(String[] args) {
        HashSet<Coche> coches = new HashSet<>();
        ArrayList<Motocicleta> motocicletas = new ArrayList<>();
        HashMap<String,Camion> camiones = new HashMap<>();
        HashMap<String, Bicicleta> bicicletas = new HashMap<>();
        Concesionario concesionario = new Concesionario(coches,motocicletas,camiones,bicicletas);
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Elija el Vehiculo seleccionando el numero"+"\n"+
                "1 MOTOCICLETA"+"\n"+
                "2 COCHE"+"\n"+
                "3 CAMION"+"\n"+
                "4 BICICLETA"+"\n"
        );
        int eleccion = scanner.nextInt();
        int eleccion2 = 0;
        String marca = "";
        String modelo = "";
        String matricula = "";
        int velocidad = 0;
        switch (eleccion){
            case 1 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir MOTOCICLETA"+"\n"+
                                "2 Mostrar MOTOCICLETA"+"\n"+
                                "3 Eliminar MOTOCICLETA"+"\n"+
                                "4 Modificar MOTOCICLETA"+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addMotocicleta(new Motocicleta(marca,modelo,matricula,velocidad));
                        System.out.println("MOTOCICLETA añadida");
                    case 2 :
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println(concesionario.obtenerMotocicleta(matricula));
                    case 3 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeMotocicleta(new Motocicleta(marca,modelo,matricula,velocidad));
                        System.out.println("MOTOCICLETA eliminada");
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeMotocicleta(concesionario.obtenerMotocicleta(matricula));
                        concesionario.addMotocicleta(new Motocicleta(marca,modelo,matricula,velocidad));
                        System.out.println("Se han hecho los cambios a su MOTOCICLETA");
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                }
                break;
            case 2 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir COCHE"+"\n"+
                                "2 Mostrar COCHE"+"\n"+
                                "3 Eliminar COCHE"+"\n"+
                                "4 Modificar COCHE"+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addCoche(new Coche(marca,modelo,matricula,velocidad));
                        System.out.println("COCHE añadido");
                    case 2 :
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println(concesionario.obtenerCoche(matricula));
                    case 3 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeCoche(new Coche(marca,modelo,matricula,velocidad));
                        System.out.println("COCHE eliminado");
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeCoche(concesionario.obtenerCoche(matricula));
                        concesionario.addCoche(new Coche(marca,modelo,matricula,velocidad));
                        System.out.println("Se han hecho los cambios a su COCHE");
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                }
                break;
            case 3 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir CAMION"+"\n"+
                                "2 Mostrar CAMION"+"\n"+
                                "3 Eliminar CAMION"+"\n"+
                                "4 Modificar CAMION"+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addCamion(new Camion(marca,modelo,matricula,velocidad));
                        System.out.println("CAMION añadido");
                    case 2 :
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println(concesionario.obtenerCamion(matricula));
                    case 3 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeCamion(new Camion(marca,modelo,matricula,velocidad));
                        System.out.println("CAMION eliminado");
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeCamion(concesionario.obtenerCamion(matricula));
                        concesionario.addCamion(new Camion(marca,modelo,matricula,velocidad));
                        System.out.println("Se han hecho los cambios a su CAMION");
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                }
                break;
            case 4 :
                System.out.println(
                        "Elija la accion seleccionando el numero"+"\n"+
                                "1 Añadir BICICLETA"+"\n"+
                                "2 Mostrar BICICLETA"+"\n"+
                                "3 Eliminar BICICLETA"+"\n"+
                                "4 Modificar BICICLETA"+"\n"
                );
                eleccion2 = scanner.nextInt();
                switch (eleccion2){
                    case 1 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addBicicleta(new Bicicleta(marca,modelo,matricula,velocidad));
                        System.out.println("BICICLETA añadido");
                    case 2 :
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println(concesionario.obtenerBicicleta(matricula));
                    case 3 :
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeBicicleta(new Bicicleta(marca,modelo,matricula,velocidad));
                        System.out.println("BICICLETA eliminado");
                    case 4 :
                        System.out.println("Introduzca los nuevos datos y se modificaran los antiguos");
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.removeBicicleta(concesionario.obtenerBicicleta(matricula));
                        concesionario.addBicicleta(new Bicicleta(marca,modelo,matricula,velocidad));
                        System.out.println("Se han hecho los cambios a su BICICLETA");
                    default:
                        System.out.println("Ha elegido un numero fuera del margen, " +
                                "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
                }
                break;
            default:
                System.out.println("Ha elegido un numero fuera del margen, " +
                        "eliga 1,2,3 o 4 dependiendo de lo que este buscando");
        }
    }
/*
    public static void main(String[] args) {
        ArrayList<Motocicleta> motocicletas = new ArrayList<>();
        motocicletas.add(new Motocicleta("Harley-Davidson","Sportster","MNO345",50));
        motocicletas.add(new Motocicleta("Yamaha","YZF R6","PQR678",90));
        motocicletas.add(new Motocicleta("Ducati","Monster","STU901",70));
        motocicletas.add(new Motocicleta("Suzuki","GSX-R750","VWX234",80));
        motocicletas.add(new Motocicleta("Kawasaki","Ninja","ZAB567",85));
        HashSet<Coche> coches = new HashSet<>();
        coches.add(new Coche("Toyota","Corolla","ABC123",60));
        coches.add(new Coche("Honda","Civic","XYZ789",75));
        coches.add(new Coche("Ford","Mustang","DEF456",100));
        coches.add(new Coche("Chevrolet","Impala","GHI789",80));
        coches.add(new Coche("Volkswagen","Golf","JKL012",65));
        Concesionario concesionario = new Concesionario(coches,motocicletas);

        System.out.println();
        System.out.println("FUNCIONAMIENTO DE METODOS DE MOTOCICLETA");
        System.out.println(concesionario.obtenerMotocicleta("MNO345"));
        concesionario.removeMotocicleta(new Motocicleta("Harley-Davidson","Sportster","MNO345",50));
        System.out.println(concesionario.obtenerMotocicleta("MNO345"));
        concesionario.addMotocicleta(new Motocicleta("Harley-Davidson","Sportster","MNO345",50));
        System.out.println(concesionario.obtenerMotocicleta("MNO345"));
        System.out.println(concesionario.velocidadMediaMotocicletas());

        System.out.println();
        System.out.println("FUNCIONAMIENTO DE METODOS DE COCHE");
        System.out.println(concesionario.obtenerCoche("ABC123"));
        concesionario.removeCoche(new Coche("Toyota","Corolla","ABC123",60));
        System.out.println(concesionario.obtenerCoche("ABC123"));
        concesionario.addCoche(new Coche("Toyota","Corolla","ABC123",60));
        System.out.println(concesionario.obtenerCoche("ABC123"));
        System.out.println(concesionario.velocidadMediaCoches());

        System.out.println();
        System.out.println(concesionario.velocidadMediaVehiculos());
    }
*/
}
