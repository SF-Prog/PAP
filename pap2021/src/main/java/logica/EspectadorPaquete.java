package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
//@IdClass(IdEspectadorPaquete.class)
public class EspectadorPaquete {
	
	//@Temporal(TemporalType.DATE)
	private Date fechaCompra;
	private List<Paquete> paquetes = new ArrayList<>();
	
	//@Id
	//@ManyToOne
	private Espectador espectador;
	
	//@Id
	//@ManyToOne
	private Paquete paquetes;

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
