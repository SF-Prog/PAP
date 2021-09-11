package datatypes;

import java.util.Date;

public class DtFuncion {
	private String nombre;
	private Date fecha;
	private String horaInicio;
	private Date FechaRegistro;
	
	public DtFuncion() {
		
		super();
	}

	public DtFuncion(String nombre, Date fecha, String horaInicio, Date fechaRegistro) {
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

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	
	@Override
	public String toString() {
		String fecha = "";
		if (this.fecha != null) {
			fecha = this.fecha.toString();
		}
		String horaInicio = "";
		if (this.horaInicio != null) {
			horaInicio = this.horaInicio.toString();
		}
		String fechaRegistro = "";
		if (this.FechaRegistro != null) {
			fechaRegistro = this.FechaRegistro.toString();
		}
		String retorno = "\nNombre: " + this.nombre + "\nFecha: " +  fecha+ "\nHora Inicio: " + horaInicio+ "\nFecha Registro: " + fechaRegistro;
		return retorno ;
	}
	
}
