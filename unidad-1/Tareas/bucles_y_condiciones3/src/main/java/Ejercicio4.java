import java.util.Scanner;

/**
 * @author IsmaelJos
 */
public class Ejercicio4 {

    static Scanner scanner=new Scanner(System.in);

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        int n,resto,resultado,contador;
        resultado=0;
        n= scanner.nextInt();
        contador=n;

        while(contador>0){

            resto=contador%10;
            resultado=resultado*10+resto;
            contador=contador/10;



        }
        if (resultado==n){
            System.out.println(n+" es un palindromo");
        }else{
            System.out.println(n+" no es un palindromo");
        }
    }
}