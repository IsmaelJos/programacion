import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws NumeroNegativoException {
        int numero = pedirNum();
        if (esPositivo(numero)){
            System.out.println("El numero "+numero+" es positivo");
        }
    }
    public static boolean esPositivo(int numero) throws NumeroNegativoException {

        if (numero<0){
            throw new NumeroNegativoException("El numero "+numero+" es negativo");
        }

        return true;
    }
    public static int pedirNum(){
        System.out.println("Introduce un numero positivo");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        return numero;
    }
}
