package datatypes;

public class DtPlataforma {
	private String nombre;
	private String descripcion;
	private int duracion;
	private String espectadoresMin;
	private String espectadoresMax;
	private String URLAsociada;
	private float costo;
	private String FechaAlta;
	
	
	public DtPlataforma() {
		super();
	}


	public DtPlataforma(String nombre, String descripcion, int duracion, String espectadoresMin, String espectadoresMax,
			String uRLAsociada, float costo, String fechaAlta) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.espectadoresMin = espectadoresMin;
		this.espectadoresMax = espectadoresMax;
		URLAsociada = uRLAsociada;
		this.costo = costo;
		FechaAlta = fechaAlta;
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


	public void setURLAsociada(String uRLAsociada) {
		URLAsociada = uRLAsociada;
	}


	public float getCosto() {
		return costo;
	}


	public void setCosto(float costo) {
		this.costo = costo;
	}


	public String getFechaAlta() {
		return FechaAlta;
	}


	public void setFechaAlta(String fechaAlta) {
		FechaAlta = fechaAlta;
	}
	
	
	
}
