package ies.puerto.ej9;

import java.util.ArrayList;
import java.util.List;

public class RegistroClientes {

    private String fecha;
    private List<Cliente> clientes;

    public RegistroClientes(String fecha) {
        this.fecha = fecha;
        this.clientes = new ArrayList<>();
    }

    public RegistroClientes(String fecha, List<Cliente> clientes) {
        this.fecha = fecha;
        this.clientes = clientes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
