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
		return null;
	}

	@Override
	public ArrayList<DtFuncion> seleccionaEspectaculo(String nombreEspectaculo) {
		return null;
	}

	@Override
	public ArrayList<DtUsuario> listarEspectadores() {
		return null;
	}

	@Override
	public ArrayList<DtRegistro> seleccionEspectadorAFuncion(String nickname, String nombreFuncion,
			java.util.Date fechaRegistro) {
		return null;
	}

	@Override
	public boolean seleccionarRegistrosParaCanje(ArrayList<DtRegistro> dtRegistroCanje) {
		return false;
	}

	@Override
	public void cambiarFuncion(String nombreFuncion) {		
	}

	@Override
	public void cambiarUsuario(String nickname) {		
	}	
}
