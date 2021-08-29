package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import logica.Registro;

public class ManejadorRegistro {
	private static ManejadorRegistro instancia = null; 
	private List<Registro> registros = new ArrayList<>();
	
	private ManejadorRegistro(){}
	
	public static ManejadorRegistro getInstancia() {
		if(instancia == null){
			instancia = new ManejadorRegistro();
		}
		return instancia;
	}

	public List<Registro> getRegistros() {
		return registros;
	}
	
	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}	
}
