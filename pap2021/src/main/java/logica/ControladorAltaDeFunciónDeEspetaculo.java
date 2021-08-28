package logica;

import java.util.ArrayList;
import java.util.Date;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import interfaces.IControladorAltaDeFunciónDeEspetaculo;

public class ControladorAltaDeFunciónDeEspetaculo implements IControladorAltaDeFunciónDeEspetaculo{

	public ControladorAltaDeFunciónDeEspetaculo() {
		super();
	}
	@Override
	public ArrayList<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seleccionaEspectaculo(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ingresaFuncion(String nombreFucion, Date fecha, Date horaInicio,
			ArrayList<DtArtista> artistaInvitado, Date fechaAlta) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
