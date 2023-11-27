public class MiExepcion extends Exception {
    int codigoError;
    public MiExepcion(){

    }
    public MiExepcion(int codigo){
        this.codigoError = codigo;
    }
    public MiExepcion(String mensaje){
        super(mensaje);
    }
    public MiExepcion(int codigo, String mensaje){
        super(mensaje);
        this.codigoError = codigo;
    }
}
