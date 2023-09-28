import java.util.Scanner;

/**
 * @author IsmaelJos
 * ejercicio numero 2
 */
public class Ejercicio2 {

    static Scanner scanner=new Scanner(System.in);
    public static int meterValor(){
        System.out.println("Añada un valor");
        return scanner.nextInt();
    }
    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        int valorA;
        int valorB;
        int valorC;

        do {
             valorA = meterValor();
             valorB = meterValor();
             valorC = meterValor();

            if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
            System.out.println("dos o mas valores son iguales");
            }
        }while ((valorA == valorB)||(valorA==valorC)||(valorB==valorC));

        if ((valorA>valorB)&&(valorA>valorC)){
            System.out.println(valorA+" es el mayor");
            if (valorB>valorC){
                System.out.println(valorC+" es el menor");
            }else {
                System.out.println(valorB+" es el menor");
            }
        } else if ((valorB>valorA)&&(valorB>valorC)) {
            System.out.println(valorB+" es el mayor");
            if (valorA>valorC){
                System.out.println(valorC+" es el menor");
            }else {
                System.out.println(valorA+" es el menor");
            }
        } else {
            System.out.println(valorC+" es el mayor");
            if (valorB>valorA){
                System.out.println(valorA+" es el menor");
            }else {
                System.out.println(valorB+" es el menor");
            }
        };


    }
}