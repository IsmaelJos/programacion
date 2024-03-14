package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        char[] textoChar = texto.toCharArray();
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorO=0;
        int contadorU=0;
        int masGrande=0;
        for (char caracter:textoChar) {
            switch (caracter){
                case 'a'|'A':
                    contadorA+=1;
                    if(contadorA>=masGrande){vocal='a';masGrande=contadorA;}
                    break;
                case 'e'|'E':
                    contadorE+=1;
                    if(contadorE>=masGrande){vocal='e';masGrande=contadorE;}
                    break;
                case 'i'|'I':
                    contadorI+=1;
                    if(contadorI>=masGrande){vocal='i';masGrande=contadorI;}
                    break;
                case 'o'|'O':
                    contadorO+=1;
                    if(contadorO>=masGrande){vocal='o';masGrande=contadorO;}
                    break;
                case 'u'|'U':
                    contadorU+=1;
                    if(contadorU>=masGrande){vocal='u';masGrande=contadorU;}
                    break;
            }
        }

        return vocal;
    }
}
