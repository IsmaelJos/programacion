import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = divicion(numero1, numero2);
        System.out.println("Resultado de la division "+ resultado);
    }

    /**
     * Solicita un numero al usuario por teclado
     * @return numero obtenido
     */
    public static int solicitarNumero(){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un valor");
        numero = scanner.nextInt();
        return numero;
    }

    /**
     * funcion que realiza la division de dos numeros
     * @param dividendo
     * @param divisor
     * @return resultado de la division
     */
    public static int divicion(int dividendo, int divisor) throws Exception {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        }catch (ArithmeticException e){
            String mensajeError = "se ha hecho una division por cero";
            System.out.println(""+mensajeError);
            throw new Exception(mensajeError);
        }
        return resultado;
    }
}
