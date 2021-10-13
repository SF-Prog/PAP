package datatypes;

public class DtPaquete {
	private String nombre;
	private String descripcion;
	private float descuento;

	public DtPaquete() {
		super();
	}
	
	public DtPaquete(String nombre, String descripcion, float descuento) {
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

	@Override
	public String toString() {
		String retorno = "\nNombre: " + this.getNombre() + "\nDescripcion: " +  this.getDescripcion() + "\nDuracion: " + this.getDescuento();
		return retorno;
	}
	
}
