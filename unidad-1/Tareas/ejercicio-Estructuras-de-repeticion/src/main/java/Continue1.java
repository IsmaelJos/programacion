public class Continue1 {
    /**
     * Escribe un programa que imprima los números del 1 al 20, pero omita la impresión de los números
     * que son múltiplos de 3 utilizando continue.
     */
    public void num1A20SinMultDe3(){
        for (int i = 1; i <= 20; i++) {
            if ((i%3)==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
