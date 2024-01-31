package es.ies.puerto.app;

import es.ies.puerto.vehiculos.Coche;
import es.ies.puerto.vehiculos.Concesionario;
import es.ies.puerto.vehiculos.Motocicleta;

import java.util.ArrayList;
import java.util.HashSet;

public class AppConcecionario {

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
}
