package Banco_EPS;

import java.util.ArrayList;

public abstract class Servicios  {
	
	public String NombreServicio;
	public String Descripcion;
	public ArrayList<String> ListaClientes = new ArrayList<String>();
	
	public Servicios(String nombreServicio, String descripcion, ArrayList<String> listaClientes) {
		super();
		NombreServicio = nombreServicio;
		Descripcion = descripcion;
		ListaClientes = listaClientes;
	}

	public String getNombreServicio() {
		return NombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		NombreServicio = nombreServicio;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public ArrayList<String> getListaClientes() {
		return ListaClientes;
	}

	public void setListaClientes(ArrayList<String> listaClientes) {
		ListaClientes = listaClientes;
	}
	
	public void AgregarCliente() {
		
	}
	
	public void EliminarCliente() {
		
	}
	
	public abstract void Clone();
	
	
}
