package ies.puerto;

public class NuevoEjercicio3 {
    public String ordenarNumero(int num1,int num2,int num3,int num4,int num5){
        String resultado = "";

        return resultado;
    }
    public int sumarNumeros(int num1,int num2,int num3,int num4, int num5){
        int resultado = sumarNumeros(num1, num2, num3, num4) + num5;
        return resultado;
    }
    public int sumarNumeros(int num1,int num2,int num3,int num4){
        int resultado = sumarNumeros(num1, num2, num3) + num4;
        return resultado;
    }
    public int sumarNumeros(int num1,int num2,int num3){
        int resultado = sumarNumeros(num1, num2) + num3;
        return resultado;
    }
    public int sumarNumeros(int num1,int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    public String numOrdenadosMayorMenor(int num1,int num2,int num3,int num4,int num5){
        String resultado = "";

        return resultado;
    }
    public String numOrdenadosMenorMayor(int num1,int num2,int num3,int num4){
        String resultado = "";
        int numMenor = numMenor(num1,num2,num3);
        int numMayor = numMayor(num1,num2,num3);
        int numMedio = numMedio(num1,num2,num3);

        if (num4 > numMenor){
            resultado = "";
        }else if (num4 > numMedio){
            resultado = "";
        }else if (num4 > numMayor){
            resultado = "";
        }else{
            resultado = "";
        }
        return resultado;
    }

    public int numMedio(int num1, int num2,int num3){
        int resultado = 0;
        int numMenor = numMenor(num1,num2,num3);
        int numMayor = numMayor(num1,num2,num3);
        resultado = (num1+num2+num3) + (numMayor + numMenor);
        return resultado;
    }
    public int numMenor(int num1,int num2, int num3, int num4, int num5){
        int resultado = numMenor(num1,num2,num3,num4);
        if (resultado > num5){
            resultado = num5;
        }
        return resultado;
    }
    public int numMenor(int num1,int num2, int num3, int num4){
        int resultado = numMenor(num1,num2,num3);
        if (resultado > num4){
            resultado = num4;
        }
        return resultado;
    }
    public int numMenor(int num1,int num2, int num3){
        int resultado = numMenor(num1,num2);
        if (resultado > num2){
            resultado = num3;
        }
        return resultado;
    }
    public int numMenor(int num1,int num2){
        int resultado = num1;
        if (num1 > num2){
            resultado = num2;
        }
        return resultado;
    }
    public int numMayor(int num1,int num2, int num3, int num4, int num5){
        int resultado = numMenor(num1,num2,num3,num4);
        if (resultado < num5){
            resultado = num5;
        }
        return resultado;
    }
    public int numMayor(int num1,int num2, int num3, int num4){
        int resultado = numMenor(num1,num2,num3);
        if (resultado < num4){
            resultado = num4;
        }
        return resultado;
    }

    public int numMayor(int num1,int num2, int num3){
        int resultado = numMayor(num1, num2);
        if (resultado < num3){
            resultado = num3;
        }
        return resultado;
    }
    public int numMayor(int num1,int num2){
        int resultado = num1;
        if (num1 < num2){
            resultado = num2;
        }
        return resultado;
    }
}
