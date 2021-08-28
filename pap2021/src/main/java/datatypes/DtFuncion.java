package datatypes;

import java.util.Date;

public class DtFuncion {
	private String nombre;
	private Date fecha;
	private Date horaInicio;
	private Date FechaRegistro;
	
	public DtFuncion() {
		
		super();
	}

	public DtFuncion(String nombre, Date fecha, Date horaInicio, Date fechaRegistro) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		FechaRegistro = fechaRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	
	
	
}
