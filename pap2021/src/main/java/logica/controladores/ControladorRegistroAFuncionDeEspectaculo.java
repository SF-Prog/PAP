package logica.controladores;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtRegistro;
import datatypes.DtUsuario;
import interfaces.IControladorRegistroAFuncionDeEspectaculo;

public class ControladorRegistroAFuncionDeEspectaculo implements IControladorRegistroAFuncionDeEspectaculo  {
	public ControladorRegistroAFuncionDeEspectaculo() {
		super();
	}
	
	@Override
	public ArrayList<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtFuncion> seleccionaEspectaculo(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtUsuario> listarEspectadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtRegistro> seleccionEspectadorAFuncion(String nickname, String nombreFuncion,
			java.util.Date fechaRegistro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean seleccionarRegistrosParaCanje(ArrayList<DtRegistro> dtRegistroCanje) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cambiarFuncion(String nombreFuncion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarUsuario(String nickname) {
		// TODO Auto-generated method stub
		
	}	
}
