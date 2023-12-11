package es.iespuerto;

public class CorreoInvalidoException extends Exception {
    public CorreoInvalidoException(){
        super("El correo no es valido");
    }
}
