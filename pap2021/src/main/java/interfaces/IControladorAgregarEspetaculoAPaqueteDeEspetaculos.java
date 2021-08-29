package interfaces;

import java.util.ArrayList;

public interface IControladorAgregarEspetaculoAPaqueteDeEspetaculos {
	public ArrayList<DtPaquete> listarPaquetes();
	public void seleccionarPaquete(String paquete);
	public void seleccionarPlataforma(String plataforma);
	public ArrayList<DtEspectaculo> listarEspectaculosEnPlataformaNoEnElPaquete();
	public void seleccionarEspectaculo(String espectaculo);
	public void ingresarEspectaculoAPaquete();
}
