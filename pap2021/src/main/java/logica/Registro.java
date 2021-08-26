package logica;

public class Registro {
	private fecha fechaRegistro;
	private float costo;
	
	public Registro() {
		super();
	}

	public Registro(fecha fechaRegistro, float costo) {
		super();
		this.fechaRegistro = fechaRegistro;
		this.costo = costo;
	}

	public fecha getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(fecha fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	
}
