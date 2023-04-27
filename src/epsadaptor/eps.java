
package epsadaptor;

import java.util.ArrayList;

public class eps {
    private int codigo_eps;
    private String nombre;
    private String direccion;
    private int telefono;
    private ArrayList<Cliente> listaClientes;

    public eps(int codigo_eps, String nombre, String direccion, int telefono) {
        this.codigo_eps = codigo_eps;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigo_eps() {
        return codigo_eps;
    }

    public void setCodigo_eps(int codigo_eps) {
        this.codigo_eps = codigo_eps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void registrarCliente(Cliente cl) {
        listaClientes.add(cl);
    }

    public Cliente buscarCliente(int cedula) {
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getCedula() == cedula) {
                return listaCliente;
            }
        }

        System.out.println("El cliente no se encuentra registrado en la eps");
        return null;
    }

    public void asignarCita(Cliente cl) {
        System.out.println("El cliente " + cl.getNombre() + " se le asigno una cita para el 10 de abril");
        int i = 0;
        for (Cliente listaCliente : listaClientes) {

            if (listaCliente.getCedula() == cl.getCedula()) {
                cl.AgregarAHistoriaMedica(new HistorialMedico("10 de abril", "Tiene ansiedad", "Ir al psicologo"));
                listaClientes.set(i, cl);
                break;
            }
            i++;
        }
    }

    public void cobrarCita(Cliente cl) {
        int i = 0;
        for (Cliente listaCliente : listaClientes) {

            if (listaCliente.getCedula() == cl.getCedula()) {
                cl.setSaldoDeuda(cl.getSaldoDeuda() - 100);
                System.out.println("La persona debe pagar $" + cl.getSaldoDeuda());
                listaClientes.set(i, cl);
                break;
            }
            i++;
        }

    }

    public void desafiliar(int cedula) {
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getCedula() == cedula) {
                listaClientes.remove(listaCliente);
                break;
            }
        }

        // System.out.println("La persona no estaba afiliada a la eps");
    }

    public void ConsultarPago(Cliente cl){
        for (Cliente listaCliente : listaClientes) {

            if (listaCliente.getCedula() == cl.getCedula()) {
                System.out.println("La persona debe pagar $" + cl.getSaldoDeuda());
                break;
            }
        }
    }
}
