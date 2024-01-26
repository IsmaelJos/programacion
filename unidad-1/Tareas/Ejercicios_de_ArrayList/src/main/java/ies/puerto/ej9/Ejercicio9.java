package ies.puerto.ej9;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    static RegistroClientes registroClientes;

    public static void main(String[] args) {
        registroClientes = new RegistroClientes("12/3/22");
        Cliente cliente1 = new Cliente("Paco",1,300);
        Cliente cliente2 = new Cliente("Juan",2,440);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        System.out.println("Saldo cliente2 "+cliente2.getSaldo());
        cliente2.transaccionAnadir(50);
        registroClientes.setClientes(clientes);


    }
}
