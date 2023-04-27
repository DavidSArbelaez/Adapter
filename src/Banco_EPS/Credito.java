package Banco_EPS;

import java.util.ArrayList;

public class Credito extends Servicios{
	

	public double TasaInteres;
	
	public Credito(String nombreServicio, String descripcion, ArrayList<String> listaClientes, double tasaInteres) {
		super(nombreServicio, descripcion, listaClientes);
		this.TasaInteres = tasaInteres;
	}
	
	

	
	public double getTasaInteres() {
		return TasaInteres;
	}




	public void setTasaInteres(double tasaInteres) {
		TasaInteres = tasaInteres;
	}




	@Override
	public void Clone() {
		// TODO Auto-generated method stub
		
	}
	
	

}
