package datatypes;

import java.util.Date;

public class DtEspectaculo {
	private String nombre;
	private String descripcion;
	private int duracion;
	private int espectadoresMin;
	private int espectadoresMax;
	private String urlAsociada;
	private float costo;
	private Date fechaRegistro;	
	private String image;
	
	public DtEspectaculo() {
		super();
	}

	public DtEspectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,
			String urlAsociada, float costo, Date fechaRegistro, String image) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setDuracion(duracion);
		this.setEspectadoresMin(espectadoresMin);
		this.setEspectadoresMax(espectadoresMax);
		this.setUrlAsociada(urlAsociada);
		this.setCosto(costo);
		this.setFechaRegistro(fechaRegistro);
		this.setImage(image);
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEspectadoresMin() {
		return espectadoresMin;
	}

	public void setEspectadoresMin(int espectadoresMin) {
		this.espectadoresMin = espectadoresMin;
	}

	public int getEspectadoresMax() {
		return espectadoresMax;
	}

	public void setEspectadoresMax(int espectadoresMax) {
		this.espectadoresMax = espectadoresMax;
	}

	public String getUrlAsociada() {
		return urlAsociada;
	}

	public void setUrlAsociada(String urlAsociada) {
		this.urlAsociada = urlAsociada;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
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
	
	@Override
	public String toString() {
		String fechaRegistro = "";
		if (this.getFechaRegistro() != null) {
			fechaRegistro = this.getFechaRegistro().toString();
		}	
		String retorno = "\nNombre: " + this.getNombre() + "\nDescripcion: " + this.getDescripcion() + "\nDuracion: " + this.getDuracion() + "\nEspectadores Minimo: " + this.getEspectadoresMin() + "\nEspectadores Maximo: " + this.getEspectadoresMax() + "\nUrl = " + this.getUrlAsociada() + "\nCosto = " + this.getCosto() + "\nFecha De Registro: " + fechaRegistro;
		return retorno ;
	}
}
