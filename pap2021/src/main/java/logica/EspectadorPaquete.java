package logica;

public class EspectadorPaquete {
	private Fecha fechaCompra;

	public EspectadorPaquete() {
		super();
	}

	public EspectadorPaquete(Fecha fechaCompra) {
		super();
		this.fechaCompra = fechaCompra;
	}

	public Fecha getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Fecha fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	
}
