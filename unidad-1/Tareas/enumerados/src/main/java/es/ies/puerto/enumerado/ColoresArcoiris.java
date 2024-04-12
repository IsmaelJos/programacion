package es.ies.puerto.enumerado;

enum ColoresArcoiris {
    ROJO("rojo"),
    NARANJA("naranja"),
    AMARILLO("amarillo"),
    VERDE("verde"),
    AZUL,
    AÑIL,
    VIOLETA;

    private String valor;

    private ColoresArcoiris(String valor) {
        this.valor = valor;
    }
     private ColoresArcoiris(){};


}

