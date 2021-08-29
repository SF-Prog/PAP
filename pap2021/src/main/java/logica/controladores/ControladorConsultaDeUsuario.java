package logica.controladores;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import interfaces.IControladorConsultaDeUsuario;

public class ControladorConsultaDeUsuario implements IControladorConsultaDeUsuario {	
	public ControladorConsultaDeUsuario() {
		super();
	}
	
	@Override
	public ArrayList<DtUsuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtUsuario> seleccionaUsuario(String nickname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtFuncion> listaInfoFunciones(String nickname) {
		// TODO Auto-generated method stub
		return null;
	}
}
