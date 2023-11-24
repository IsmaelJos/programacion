public class Continue3 {
    /**
     * Escribe un programa que sume todos los números pares del 1 al 10,
     * usando continue para omitir los números impares.
     */
    public void numImpar1A10(){
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            if ((i%2!=0)){
                continue;
            }
            suma+=i;
        }
        System.out.println(suma);
    }
}
