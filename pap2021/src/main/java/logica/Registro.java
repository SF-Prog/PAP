package logica;

import java.util.Date;

public class Registro {
	private Date fechaRegistro;
	private float costo;
	
	public Registro() {
		super();
	}

	public Registro(Date fechaRegistro, float costo) {
		super();
		this.setFechaRegistro(fechaRegistro);
		this.setCosto(costo);
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}	
}
