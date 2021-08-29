package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import logica.Paquete;

public class ManejadorPaquete {
	private static ManejadorPaquete instancia = null; 
	private List<Paquete> paquetes = new ArrayList<>();
	
	private ManejadorPaquete(){}
	
	public static ManejadorPaquete getInstancia() {
		if(instancia == null){
			instancia = new ManejadorPaquete();
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
