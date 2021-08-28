package logica;

import java.util.ArrayList;
import java.util.Date;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import interfaces.IControladorAltaDeFuncionDeEspetaculo;

public class ControladorAltaDeFuncionDeEspetaculo implements IControladorAltaDeFuncionDeEspetaculo{

	public ControladorAltaDeFuncionDeEspetaculo() {
		super();
	}
	@Override
	public ArrayList<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		
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
