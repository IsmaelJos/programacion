import java.util.Calendar;

/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int mes = calendar.get(Calendar.MONTH)+1;
        int diaSemanaRestantes = calendar.getMinimalDaysInFirstWeek();
        String dia = "";
        switch (diaSemanaRestantes){
            case 1: dia = "domingo";
                break;
            case 2: dia = "sabado";
                break;
            case 3: dia = "viernes";
                break;
            case 4: dia = "jueves";
                break;
            case 5: dia = "miercoles";
                break;
            case 6: dia = "martes";
                break;
            case 7: dia = "lunes";
                break;
        }
        System.out.println("Fecha: " + mes + "-" + dia);
    }
}
