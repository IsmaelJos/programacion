public class Break3 {
    /**
     * Escribe un programa que busque el número 7
     * en un array, utilizando break.
     */
    public void buscarNum7(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==7){
                System.out.println(array[i]);
                break;
            }
        }
    }
}
