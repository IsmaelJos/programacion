package ies.puerto;

public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private int saldo;

    public CuentaBancaria(){}
    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaBancaria(int numeroCuenta,String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }
    public CuentaBancaria(int numeroCuenta,int saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public CuentaBancaria(int numeroCuenta,String nombreTitular, int saldo){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    public String imprimir(){
        return "Numero de cuenta: "+numeroCuenta+" Nombre: "+nombreTitular+" Saldo: "+saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
