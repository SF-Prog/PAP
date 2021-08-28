package datatypes;

import java.util.Date;

public class DtRegistro {
	private Date fechaRegistro;
	private float costo;
	
	public DtRegistro() {
		super();
	}

	public DtRegistro(Date fechaRegistro, float costo) {
		super();
		this.fechaRegistro = fechaRegistro;
		this.costo = costo;
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
