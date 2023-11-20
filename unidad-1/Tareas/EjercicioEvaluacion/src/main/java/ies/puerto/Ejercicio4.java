package ies.puerto;

public class Ejercicio4 {

}

class CuentaBanco {
    private String titular;
    private double saldo;

    public CuentaBanco(){}

    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor principal para crear una cuenta de banco
     * @param titular de la cuenta
     * @param saldo disponible en la cuenta
     */
    public CuentaBanco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Añade una cuantia de saldo de la cuenta
     * @param dinero a añadir
     */
    public void depositar(int dinero){
        setSaldo(getSaldo() + dinero);
    }

    /**
     * Retira una cuantia de saldo de la cuenta
     * @param dinero a retirar
     */
    public void retirar(int dinero){
        setSaldo(getSaldo() - dinero);
    }

    /**
     * muestra los datos de la cuenta
     */
    public String informacion(){
        return "Titular: " + getTitular() + "Saldo: " +getSaldo();
    }

    /**
     * Getters/Setters de las propiedades
     */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
