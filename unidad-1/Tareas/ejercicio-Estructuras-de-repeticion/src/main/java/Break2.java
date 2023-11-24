public class Break2 {
    /**
     * Escribe un programa que encuentre el primer
     * número primo mayor que 100 , utilizando break.
     */
    public void primoMayor100(){
        for (int i = 100; i > 0; i++) {
            if (primo(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public boolean primo(int num){
        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
