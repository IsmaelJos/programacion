public class Continue2 {
    /**
     * Escribe un programa que imprima todos los números impares del 1 al 20,
     * usando continue para omitir los números pares.
     */
    public void numImpar1A20(){
        for (int i = 1; i <= 20; i++) {
            if ((i%2)==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
