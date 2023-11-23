public class Continue5 {
    /**
     * Escribe un programa que imprima todos los números positivos en
     * un array, usando continue para omitir los números negativos.
     * @param array
     */
    public void numPosArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
