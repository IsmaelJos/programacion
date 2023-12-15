package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        String texto = pedirTexto();
        comprobarTexto(texto);
        String textoInverso = invertir(texto);
        System.out.println(texto);
        System.out.println(textoInverso);
    }
    public static String invertir (String texto){
        String textoInveso = "";
        for (int i = texto.length(); i > 0; i--) {
            textoInveso += texto.charAt(i-1);
        }
        return textoInveso;
    }
    public static void comprobarTexto(String texto) throws Exception {
        if (!texto.matches("[^ ]{10}")) { //se intento con "[^\s]{10}" pero decia que no funcionaba en esta version
            System.out.println("Añada una cadena con 10 caracteres sin espacios");
            throw new Exception();
        }
    }
    public static String pedirTexto(){
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }
}