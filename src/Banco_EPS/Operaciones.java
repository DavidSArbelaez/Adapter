package Banco_EPS;

public class Operaciones extends Empleados{

	public String Horario;

	public Operaciones(String nombre_completo, int id, String fecha_ingreso, double salario, String cargo,
			String horario) {
		super(nombre_completo, id, fecha_ingreso, salario, cargo);
		Horario = horario;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}
	
	public void Operacio() {
		
	}
	
	
	
	

}
