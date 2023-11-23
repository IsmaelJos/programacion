public class Break4 {
    /**
     * Escribe un programa que encuentre el primer número
     * negativo en un array, utilizando break.
     */
    public void primNumNegativo(float[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                System.out.println(array[i]);
                break;
            }
        }
    }
}
