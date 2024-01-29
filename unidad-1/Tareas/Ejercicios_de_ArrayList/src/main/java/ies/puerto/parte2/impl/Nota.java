package ies.puerto.parte2.impl;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota1 = (Nota) o;
        return Objects.equals(nota, nota1.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota);
    }
}
