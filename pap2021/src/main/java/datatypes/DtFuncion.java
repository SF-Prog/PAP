package datatypes;

import java.util.Date;

public class DtFuncion {
	private String nombre;
	private Date fecha;
	private String horaInicio;
	private Date fechaRegistro;
	private String image;
	private String[] artistasInvitados;
	
	public DtFuncion() {
		super();
	}

	public DtFuncion(String nombre, Date fecha, String horaInicio, Date fechaRegistro, String image) {
		super();
		this.setNombre(nombre);
		this.setFecha(fecha);
		this.setHoraInicio(horaInicio);
		this.setFechaRegistro(fechaRegistro);
		this.setImage(image);
	}

	public DtFuncion(String nombre, Date fecha, String horaInicio, Date fechaRegistro, String image, String[] artistasInvitados) {
		super();
		this.setNombre(nombre);
		this.setFecha(fecha);
		this.setHoraInicio(horaInicio);
		this.setFechaRegistro(fechaRegistro);
		this.setImage(image);
		this.setArtistasInvitados(artistasInvitados);
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
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	

	public String[] getArtistasInvitados() {
		return artistasInvitados;
	}

	public void setArtistasInvitados(String[] artistasInvitados) {
		this.artistasInvitados = artistasInvitados;
	}	
	
	@Override
	public String toString() {
		String fecha = "";
		if (this.getFecha() != null) {
			fecha = this.getFecha().toString();
		}
		String horaInicio = "";
		if (this.getHoraInicio() != null) {
			horaInicio = this.getHoraInicio().toString();
		}
		String fechaRegistro = "";
		if (this.getFechaRegistro() != null) {
			fechaRegistro = this.getFechaRegistro().toString();
		}
		String retorno = "\nNombre: " + this.getNombre() + "\nFecha: " + fecha + "\nHora Inicio: " + horaInicio + "\nFecha Registro: " + fechaRegistro;
		return retorno ;
	}
	
}
