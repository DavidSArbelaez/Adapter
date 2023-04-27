package epsadaptor;

import java.util.ArrayList;

public class Cliente {

	private int cedula;
	private String nombre;
	private String fecha_nacimiento;
	private String direccion;
	private int telefono;
	private float saldoDeuda;
	private ArrayList<HistorialMedico> historiaMedica = new ArrayList<HistorialMedico>();
	private PlanEps planEps;

	public Cliente(int cedula, String nombre, String fecha_nacimiento, String direccion, int telefono,
			PlanEps planEps) {
		this.saldoDeuda=0;
		this.cedula = cedula;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.planEps = planEps;
	}

	public PlanEps getPlanEps() {
		return planEps;
	}

	public void setPlanEps(PlanEps planEps) {
		this.planEps = planEps;
	}

	public void AgregarAHistoriaMedica(HistorialMedico hs) {
		historiaMedica.add(hs);
	}

	public void mostrarHisoriaMedica() {

	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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

	public float getSaldoDeuda() {
		return saldoDeuda;
	}

	public void setSaldoDeuda(float saldoDeuda) {
		this.saldoDeuda = saldoDeuda;
	}

}
