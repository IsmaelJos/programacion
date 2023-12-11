package es.iespuerto;

public class CorreoElectronico {
    private String direccionCorreoElectronico;
    private boolean valido;

    public CorreoElectronico(){}
    public CorreoElectronico(String direccionCorreoElectronico) {
        this.direccionCorreoElectronico = direccionCorreoElectronico;
    }
    public void validar() throws CorreoInvalidoException {
        if(direccionCorreoElectronico.matches("^[A-Za-z0-9\\-_]+@[A-Za-z0-9\\-_]+.[a-z]{2}[a-z]*")){
            this.valido = true;
            System.out.println("Correo validado correctamente");
        }else{
            this.valido = false;
            throw new CorreoInvalidoException();
        }
    }
}