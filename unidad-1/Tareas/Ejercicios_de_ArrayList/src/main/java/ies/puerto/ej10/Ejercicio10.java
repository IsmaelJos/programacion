package ies.puerto.ej10;

import java.util.*;

public class Ejercicio10 {
    static List<String> Nombres;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nombres = new ArrayList<>();
        System.out.println("introduzca el primer nombre");
        Nombres.add(scanner.nextLine());
        System.out.println("introduzca el segundo nombre");
        Nombres.add(scanner.nextLine());
        System.out.println("introduzca el tercer nombre");
        Nombres.add(scanner.nextLine());

        Collections.sort(Nombres);

        System.out.println(Nombres);

    }
}
