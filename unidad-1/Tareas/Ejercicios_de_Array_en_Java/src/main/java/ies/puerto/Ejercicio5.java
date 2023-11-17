package ies.puerto;


public class Ejercicio5 {
        public int[][] crearDiagonal() {
            int[][] diagonal = new int[5][5];
            for (int i = 0; i < diagonal.length; i++) {
                diagonal[i][i] = 1;
            }
            return diagonal;
        }
        public void mostrarDiagonal(int[][] diagonal){
            for (int i = 0; i < diagonal.length; i++) {
                for (int j = 0; j < diagonal[i].length; j++) {
                    System.out.print(diagonal[i][j]);
                }
            }
        }
}
