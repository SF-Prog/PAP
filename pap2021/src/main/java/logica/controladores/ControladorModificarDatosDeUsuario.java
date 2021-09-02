package logica.controladores;

import java.util.ArrayList;

import datatypes.DtUsuario;
import interfaces.IControladorModificarDatosDeUsuario;

public class ControladorModificarDatosDeUsuario implements IControladorModificarDatosDeUsuario {	
	public ControladorModificarDatosDeUsuario() {
		super();
	}
	
	@Override
	public ArrayList<DtUsuario> listarUsuarios() {
		return null;
	}

	@Override
	public DtUsuario seleccionarUsuario(String nickname) {
		return null;
	}

	@Override
	public void ingresarDatosModificacion(DtUsuario nuevosDatosUsuario) {
		
	}

	@Override
	public void finalizarModificacionUsuario() {
		
	}
}
