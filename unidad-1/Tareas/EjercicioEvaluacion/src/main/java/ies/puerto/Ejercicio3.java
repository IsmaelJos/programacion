package ies.puerto;

public class Ejercicio3 {
    public String calificacionesIfElse(double nota){
        String calificacion = "";
        if (nota<5){
            calificacion = "Suspenso";
        } else if (nota<6){
            calificacion = "Aprobado";
        } else if (nota<7) {
            calificacion = "Bien";
        }else if (nota<8) {
            calificacion = "Notable";
        }else if (nota<10 && nota>=9) {
            calificacion = "Sobresaliente";
        }else{
            calificacion = "Matricula";
        }
        return calificacion;
    };
    public String calificacionesSwitch(double nota){
        String calificacion = "";
        int notaInt = (int) nota;
        switch (notaInt){
            case 10: calificacion = "Matricula";
                break;
            case 9: calificacion = "Sobresaliente";
                break;
            case 8:
            case 7: calificacion = "Notable";
                break;
            case 6: calificacion = "Bien";
                break;
            case 5: calificacion = "Aprobado";
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0: calificacion = "Suspenso";
                break;
        }
        return calificacion;
    };
}
