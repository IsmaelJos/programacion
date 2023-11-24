public class Ejemplo2 {
    public static void main(String[] args) {
        int numero = 10;
        int divior = 0;
        try {
            int division = numero/divior;
            System.out.println(""+division);
        }catch (ArithmeticException e){
            System.out.println("Se ha producido una ArithmeticException, mensaje: "+e.getMessage());
        }



    }
}
