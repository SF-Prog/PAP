package logica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Paquete {
	@Id
	private String nombre;
	private String descripcion;
	private float descuento;	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Espectaculo> espectaculos = new ArrayList<>();
	
	public Paquete() {
		super();
	}

	public Paquete(String nombre, String descripcion, float descuento) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setDescuento(descuento);
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

	public float getDescuento() {
		return this.descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public List<Espectaculo> getEspectaculos() {
		return espectaculos;
	}

	public void setEspectaculos(List<Espectaculo> espectaculos) {
		this.espectaculos = espectaculos;
	}
}
