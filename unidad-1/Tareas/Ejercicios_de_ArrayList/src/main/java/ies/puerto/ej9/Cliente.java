package ies.puerto.ej9;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private int numero;
    private int saldo;

    public void transaccionAnadir(int cantidad){
        setSaldo(getSaldo()+cantidad);
        System.out.println("saldo actual "+getSaldo());
    }
    public void transaccionRetirar(int cantidad){
        setSaldo(getSaldo()-cantidad);
        System.out.println("saldo actual "+getSaldo());
    }

    public Cliente() {
    }

    public Cliente(int numero) {
        this.numero = numero;
    }

    public Cliente(String nombre, int numero, int saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void actualizarSaldo(int cantidad){
        this.saldo += cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return numero == cliente.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo ;
    }
}
