package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Espectaculo {
	@Id
	private String nombre;
	private String descripcion;
	private int duracion;
	private int espectadoresMin;
	private int espectadoresMax;
	private String urlAsociada;
	private float costo;
	private Date fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "Coljoin")
	private Artista artista;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Funcion> funciones = new ArrayList<>();
	
/*	@OneToMany(cascade = CascadeType.ALL)
	private List<Artista> artistas = new ArrayList<>();*/
	
	public Espectaculo() {
		super();
	}

	public Espectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,
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

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
	
	public void addFuncion(Funcion funcion) {
		this.funciones.add(funcion);
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
}
