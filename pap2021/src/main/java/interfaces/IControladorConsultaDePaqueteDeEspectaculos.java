package interfaces;

import java.util.ArrayList;

import datatypes.DtPaquete;

public interface IControladorConsultaDePaqueteDeEspectaculos {
	public ArrayList<DtPaquete> listarPaquetes();
	public DtPaquete selecionaPaquete(String nombre);
}
