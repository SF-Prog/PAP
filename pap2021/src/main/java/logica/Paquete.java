package logica;

public class Paquete {
	private String nombre;
	private String descripcion;
	private float Descuento;
	
	public Paquete() {
		super();
	}

	public Paquete(String nombre, String descripcion, float descuento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		Descuento = descuento;
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
		return Descuento;
	}

	public void setDescuento(float descuento) {
		Descuento = descuento;
	}

	
}
