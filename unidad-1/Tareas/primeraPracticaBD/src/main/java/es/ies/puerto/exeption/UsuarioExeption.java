package es.ies.puerto.exeption;

public class UsuarioExeption extends Exception{
    public UsuarioExeption(String message){
        super(message);
    }
    public UsuarioExeption(String message, Throwable tipo){
        super(message,tipo);
    }
}
