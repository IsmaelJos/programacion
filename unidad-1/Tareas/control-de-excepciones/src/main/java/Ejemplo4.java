public class Ejemplo4 {
    public static void main(String[] args) throws MiExepcion {
        boolean verdadero = false;
        metodoConCondicion(verdadero);
    }
    public static void metodoConCondicion(boolean verdadero) throws MiExepcion {
        if (!verdadero){
            throw new MiExepcion(1,"MiExepcion lanza un mensaje");
        }
    }
}
