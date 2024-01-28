package ies.puerto.parte2.impl;

public class Nota {
    private String nota;
    private float valor;

    public Nota() {
    }

    public Nota(String nota, float valor) {
        this.nota = nota;
        this.valor = valor;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
