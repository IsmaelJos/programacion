package es.iespuerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CorreoInvalidoException {
        System.out.println("Añada un correo");
        Scanner scanner = new Scanner(System.in);
        String correo = scanner.nextLine();
        CorreoElectronico correoElec = new CorreoElectronico(correo);
        correoElec.validar();
    }
}
