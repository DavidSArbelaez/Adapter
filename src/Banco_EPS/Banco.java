package Banco_EPS;

import java.util.ArrayList;

public class Banco{
	public String Nombre;
	public String Direccion;
	public String Telefono;
	public ArrayList<String> ListaEmpleados = new ArrayList<String>();
	public ArrayList<String> ListaServicios = new ArrayList<String>();
	public ArrayList<String> ListaClientes = new ArrayList<String>();
	
	public Banco(String nombre, String direccion, String telefono, ArrayList<String> listaEmpleados,
			ArrayList<String> listaServicios, ArrayList<String> listaClientes) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Telefono = telefono;
		ListaEmpleados = listaEmpleados;
		ListaServicios = listaServicios;
		ListaClientes = listaClientes;
	}
	
	public void AgregarEmpleado() {
		
	}

	public void EliminarEmpleado() {
		
	}
	
	public void AgregarServicio() {
		
	}
	
	public void EliminarServicio() {
		
	}
	
	public void AgregarCliente() {
		
	}
	
	public void EliminarCliente() {
		
	}
	
	
	
	
	
	

}
