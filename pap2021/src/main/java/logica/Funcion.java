package logica;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcion {
	@Id
	private String nombre;
	private Date fecha;
	private String horaInicio;
	private Date fechaRegistro;
	
	public Funcion() {
		super();
	}

	public Funcion(String nombre, Date fecha, String horaInicio, Date fechaRegistro) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}	
}
