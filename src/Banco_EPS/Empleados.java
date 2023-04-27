package Banco_EPS;

public class Empleados {
	
	public String Nombre_completo;
	public int id;
	public String Fecha_ingreso;
	public double Salario;
	public String Cargo;
	
	public Empleados(String nombre_completo, int id, String fecha_ingreso, double salario, String cargo) {
		this.Nombre_completo = nombre_completo;
		this.id = id;
		this.Fecha_ingreso = fecha_ingreso;
		this.Salario = salario;
		this.Cargo = cargo;
	}

	public String getNombre_completo() {
		return Nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		Nombre_completo = nombre_completo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha_ingreso() {
		return Fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		Fecha_ingreso = fecha_ingreso;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	
	public void RealizarTareas() {
		
	}
	
	public void ObtenerSalario() {
		
	}
	

}
