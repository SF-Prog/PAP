package logica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EspectadorPaquete {
	private Date fechaCompra;
	private List<Paquete> paquetes = new ArrayList<>();


	public EspectadorPaquete() {
		super();
	}

	public EspectadorPaquete(Date fechaCompra) {
		super();
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	
}
