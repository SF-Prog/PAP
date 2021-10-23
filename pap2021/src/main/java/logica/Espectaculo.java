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
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "Artista")
	private Artista artista;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Funcion> funciones = new ArrayList<>();
	
/*	@OneToMany(cascade = CascadeType.ALL)
	private List<Artista> artistas = new ArrayList<>();*/
	
	public Espectaculo() {
		super();
	}

	public Espectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	
}
