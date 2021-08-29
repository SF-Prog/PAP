package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtPaquete;

public interface IControladorAgregarEspectaculoAPaqueteDeEspectaculos {
	public ArrayList<DtPaquete> listarPaquetes();
	public void seleccionarPaquete(String paquete);
	public void seleccionarPlataforma(String plataforma);
	public ArrayList<DtEspectaculo> listarEspectaculosEnPlataformaNoEnElPaquete();
	public void seleccionarEspectaculo(String espectaculo);
	public void ingresarEspectaculoAPaquete();
}
