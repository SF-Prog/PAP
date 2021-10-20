package logica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Plataforma {
	@Id
	private String nombre;
	private String descripcion;
	private int duracion;
	private String espectadoresMin;
	private String espectadoresMax;
	private String URLAsociada;
	private float costo;
	private String fechaAlta;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Espectaculo> espectaculos = new ArrayList<>();
	
	public Plataforma() {
		super();
	}

	public Plataforma(String nombre, String descripcion, String URLAsociada) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setURLAsociada(URLAsociada);
	}
	
	public Plataforma(String nombre, String descripcion, int duracion, String espectadoresMin, String espectadoresMax,
			String URLAsociada, float costo, String fechaAlta) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setDuracion(duracion);
		this.setEspectadoresMin(espectadoresMin);
		this.setEspectadoresMax(espectadoresMax);
		this.setURLAsociada(URLAsociada);
		this.setCosto(costo);
		this.setFechaAlta(fechaAlta);
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
	
	public String getEspectadoresMin() {
		return espectadoresMin;
	}
	
	public void setEspectadoresMin(String espectadoresMin) {
		this.espectadoresMin = espectadoresMin;
	}
	
	public String getEspectadoresMax() {
		return espectadoresMax;
	}
	
	public void setEspectadoresMax(String espectadoresMax) {
		this.espectadoresMax = espectadoresMax;
	}
	
	public String getURLAsociada() {
		return URLAsociada;
	}
	
	public void setURLAsociada(String URLAsociada) {
		this.URLAsociada = URLAsociada;
	}
	
	public float getCosto() {
		return costo;
	}
	
	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	public String getFechaAlta() {
		return this.fechaAlta;
	}
	
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public List<Espectaculo> getEspectaculos() {
		return espectaculos;
	}
	
	public void setEspectaculos(List<Espectaculo> espectaculos) {
		this.espectaculos = espectaculos;
	}
}
