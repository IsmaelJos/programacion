public class Continue4 {
    /**
     * Escribe un programa que busque y cuente los números mayores
     * que 50 en un array, usando continue para omitir los
     * números menores o iguales a 50.
     * @param array
     */
    public void contarMayor50(int[] array) {
        int contador = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=50){
                continue;
            }
            contador++;
        }
    }
}
