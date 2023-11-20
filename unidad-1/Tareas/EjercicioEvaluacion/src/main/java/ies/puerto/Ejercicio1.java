package ies.puerto;

public class Ejercicio1 {
    public int busquedaBinaria(int[] array, int numBuscado){
        int inicioArray = 0;
        int finArray = array.length - 1;
        int numMedio = 0;
        while(inicioArray <= finArray){
            numMedio = (inicioArray + finArray)/2;
            if (array[numMedio] == numBuscado){
                return numMedio + 1;
            } else if (array[numMedio] < numBuscado) {
                inicioArray = numMedio + 1;
            }else {
                finArray = numMedio - 1;
            }
        };

        return 0;
    }
}
