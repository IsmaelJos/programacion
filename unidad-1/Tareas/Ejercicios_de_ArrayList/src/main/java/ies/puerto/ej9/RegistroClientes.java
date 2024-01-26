package ies.puerto.ej9;

import java.util.ArrayList;
import java.util.List;

public class RegistroClientes {

    private List<Cliente> clientes;

    public RegistroClientes(){
        clientes = new ArrayList<>();
    }
    public RegistroClientes(List<Cliente> clientes){
        clientes = new ArrayList<>();
    }

    public Cliente buscarClientes(Cliente cliente){

        for (Cliente clienteLista: clientes){
            if (cliente.equals(clienteLista)){
                return clienteLista;
            }
        }

        return null;
    }
    public void transaccion(int numCliente, int cantidad){
        Cliente clienteActualizar = new Cliente(numCliente);
        if (!clientes.contains(clienteActualizar)){
            return;
        }
        int pocicionCliente = clientes.indexOf(clienteActualizar);
        clienteActualizar = buscarClientes(clienteActualizar);
        clienteActualizar.setSaldo(cantidad);
        clientes.set(pocicionCliente,clienteActualizar);
    }
    public void addCliente(Cliente cliente){
        if (clientes.contains(cliente)){
            addCliente(cliente);
        }
    }
}
