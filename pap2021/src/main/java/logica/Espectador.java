package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class Espectador extends Usuario {
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
