package logica.controladores;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtPaquete;
import interfaces.IControladorAgregarEspectaculoAPaqueteDeEspectaculos;

public class ControladorAgregarEspectaculoAPaqueteDeEspectaculos implements IControladorAgregarEspectaculoAPaqueteDeEspectaculos {
	public ControladorAgregarEspectaculoAPaqueteDeEspectaculos() {
		super();
	}
	
	@Override
	public ArrayList<DtPaquete> listarPaquetes() {
		return null;
	}
	
	@Override
	public void seleccionarPaquete(String paquete) {
		
	}
	
	@Override
	public void seleccionarPlataforma(String plataforma) {
	}
	
	@Override
	public ArrayList<DtEspectaculo> listarEspectaculosEnPlataformaNoEnElPaquete() {
		return null;
	}
	
	@Override
	public void seleccionarEspectaculo(String espectaculo) {
	}
	
	@Override
	public void ingresarEspectaculoAPaquete() {
	}
}

