package interfaces;

import java.util.ArrayList;

import datatypes.DtPaquete;


public interface IControladorConsultaDePaqueteDeEspetaculos {
	public ArrayList<DtPaquete> listarPaquetes();
	public ArrayList<DtPaquete> selecionaPaquete(String nombre);
	
	
}
