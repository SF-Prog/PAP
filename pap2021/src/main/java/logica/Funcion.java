package logica;

public class Funcion {
	private String nombre;
	private fecha fecha;
	private fecha horaInicio;
	private fecha FechaRegistro;
	
	public Funcion() {
		super();
	}

	public Funcion(String nombre, logica.fecha fecha, logica.fecha horaInicio, logica.fecha fechaRegistro) {
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

	public fecha getFecha() {
		return fecha;
	}

	public void setFecha(fecha fecha) {
		this.fecha = fecha;
	}

	public fecha getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(fecha horaInicio) {
		this.horaInicio = horaInicio;
	}

	public fecha getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(fecha fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	
	
	
	
}
