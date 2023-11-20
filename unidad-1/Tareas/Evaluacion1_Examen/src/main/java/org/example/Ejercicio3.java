package org.example;

public class Ejercicio3 {
    public void fichasDomino(){
        String[][] fichas = new String[7][7];
        for (int i = 0; i < fichas.length; i++) {
            for (int j = 0; j < fichas[i].length; j++) {
                if (j >= i){
                    fichas[i][j] = i+":"+j;
                } else {
                    fichas[i][j] = "0:0";
                }
                System.out.print(fichas[i][j]);
            }
            System.out.println("");
        }
    }
    public void extraerFicha(){}
}
