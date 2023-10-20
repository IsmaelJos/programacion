package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void verificarDiasSemanaTestOk() {
        verificarDiaSemana("lunes", 1);
        verificarDiaSemana("Martes", 2);
        verificarDiaSemana("Miercoles", 3);
        verificarDiaSemana("Jueves", 4);
        verificarDiaSemana("Viernes", 5);
        verificarDiaSemana("Sabado", 6);
        verificarDiaSemana("Domingo", 7);
        verificarDiaSemana("Numero no valido", 8);
        verificarDiaSemana("Numero no valido", 18);
    }
    public void verificarDiaSemana(String strDia,int numeroDia) {
        String resultado = "";

        resultado =ejercicio7.calcularDiaSemana(numeroDia);
        Assertions.assertEquals(strDia,resultado,"No se ha obtenido el resultado esperado");
    }
}
