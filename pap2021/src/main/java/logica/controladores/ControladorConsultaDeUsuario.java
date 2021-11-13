package logica.controladores;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import interfaces.IControladorConsultaDeUsuario;
import logica.Usuario;
import logica.manejadores.ManejadorUsuario;

public class ControladorConsultaDeUsuario implements IControladorConsultaDeUsuario {	
	public ControladorConsultaDeUsuario() {
		super();
	}
	
	@Override
	public ArrayList<Usuario> listarUsuarios() {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.getUsuarios();		
	}	

	@Override
	public ArrayList<DtUsuario> seleccionaUsuario(String nickname) {
		return null;
	}

	@Override
	public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname) {
		return null;
	}

	@Override
	public ArrayList<DtFuncion> listaInfoFunciones(String nickname) {
		return null;
	}
}
