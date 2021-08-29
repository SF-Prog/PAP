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
	
	
	
	public DtEspectaculo() {
		super();
	}



	public DtEspectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,
			String urlAsociada, float costo, Date fechaRegistro) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.espectadoresMin = espectadoresMin;
		this.espectadoresMax = espectadoresMax;
		this.urlAsociada = urlAsociada;
		this.costo = costo;
		this.fechaRegistro = fechaRegistro;
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
	
	@Override
	public String toString() {
		
		String retorno =  "\nNombre: " + this.nombre + "\nDescripcion: " +  this.descripcion+ "\nDuracion: " + this.duracion+ "\nEspectadores Minimo: " + this.espectadoresMin+ "\nEspectadores Maximo: " + this.espectadoresMax+ "\nUrl = " + this.urlAsociada+ "\nCosto = " + this.costo+ "\nFecha De Registro: " + this.fechaRegistro.toString();
		

		return retorno ;
	}
	
	
	
}
