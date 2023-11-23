/**
 * Escribe un programa que encuentre el primer número
 * divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Break1 {
    public void numDiv7y5(){
        for (int i = 1; i <= 100; i++) {
            if ((i%7)==0 && (i%5)==0){
                System.out.println("El numero correcto es "+i);
                break;
            }
        }
    }
}
