package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("Espectador")
public  class Espectador extends Usuario {
	
	//@OneToMany(mappedBy = "espectador",cascade = CascadeType.ALL)
	private List<EspectadorPaquete> espectadorPaquetes = new ArrayList<>();
	
	public Espectador() {
		super();
	}

	public Espectador(String nickName, String nombre, String apellido, String email, Date fechaNac) {
		super(nickName, nombre, apellido, email, fechaNac);
		// TODO Auto-generated constructor stub
	}

	public List<EspectadorPaquete> getEspectadorPaquetes() {
		return espectadorPaquetes;
	}

	public void setEspectadorPaquetes(List<EspectadorPaquete> espectadorPaquetes) {
		this.espectadorPaquetes = espectadorPaquetes;
	}
}
