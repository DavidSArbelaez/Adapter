package epsadaptor;

public class HistorialMedico {

	private String fecha;
	private String diagnostico;
	private String tratamiento;

	/* private int cedula; */
	public HistorialMedico(String fecha, String diagnostico, String tratamiento) {
		this.fecha = fecha;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

}
