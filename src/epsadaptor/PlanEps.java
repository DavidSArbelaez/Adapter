package epsadaptor;

public class PlanEps {

	private String nombre;
	private String descripcion;
	private float cobertura;

	public PlanEps(String nombre, String descripcion, float cobertura) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cobertura = cobertura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getCobertura() {
		return cobertura;
	}

	public void setCobertura(float cobertura) {
		this.cobertura = cobertura;
	}

}
