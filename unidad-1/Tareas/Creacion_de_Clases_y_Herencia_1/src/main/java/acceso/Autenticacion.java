package acceso;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion {
    public Boolean validar(String cadena) {

        String regex = "([A-Z]{1}[a-z]+[\\s]*)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();
    }
}
