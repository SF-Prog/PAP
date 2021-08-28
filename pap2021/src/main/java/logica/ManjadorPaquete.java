package logica;

import java.util.ArrayList;
import java.util.List;

public class ManjadorPaquete {
	private static ManjadorPaquete instancia = null; 
	private List<Paquete> paquetes = new ArrayList<>();
	private ManjadorPaquete(){}
	
	public static ManjadorPaquete getInstancia() {
		if(instancia == null){
			instancia = new ManjadorPaquete();
		}
		return instancia;
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	
	
	
}
