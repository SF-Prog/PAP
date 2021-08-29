package datatypes;

public class DtPaquete {
	private String nombre;
	private String descripcion;
	private float Descuento;
	

	public DtPaquete() {
		super();
	}
	
	public DtPaquete(String nombre, String descripcion, float descuento) {
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

	@Override
	public String toString() {
		
		String retorno =  "\nNombre: " + this.nombre + "\nDescripcion: " +  this.descripcion+ "\nDuracion: " + this.Descuento;
		return retorno ;
	}
	
}
