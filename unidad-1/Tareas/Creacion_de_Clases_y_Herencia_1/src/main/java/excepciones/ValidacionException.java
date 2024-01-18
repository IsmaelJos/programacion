package excepciones;

public class ValidacionException extends Exception{
    int codigoError;
    public ValidacionException(){}
    public ValidacionException(int codigo){
        this.codigoError = codigo;
    }
    public ValidacionException(String mensaje){
        super(mensaje);
    }
    public ValidacionException(int codigo, String mensaje){
        super(mensaje);
        this.codigoError = codigo;
    }
}
