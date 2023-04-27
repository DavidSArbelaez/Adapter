package Banco_EPS;

import java.util.ArrayList;

public class Debito extends Servicios{
	
	public String Tarifa;
	

	public Debito(String nombreServicio, String descripcion, ArrayList<String> listaClientes, String tarifa) {
		super(nombreServicio, descripcion, listaClientes);
		Tarifa = tarifa;
	}


	public String getTarifa() {
		return Tarifa;
	}


	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}


	@Override
	public void Clone() {
		// TODO Auto-generated method stub
		
	}
	
	

}
