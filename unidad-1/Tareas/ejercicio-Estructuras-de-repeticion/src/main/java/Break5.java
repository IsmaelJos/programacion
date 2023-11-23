public class Break5 {
    /**
     * Escribe un programa que encuentre el primer número
     * divisible por 5 y mayor que 30, utilizando break.
     */
    public void div5Mayor30(){
        for (int i = 31; i < 30; i++) {
            if ((i%5)==0){
                System.out.println(i);
                break;
            }
        }
    }
}
