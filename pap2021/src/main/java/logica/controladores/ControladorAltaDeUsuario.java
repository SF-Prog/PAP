package logica.controladores;

import datatypes.DtUsuario;
import interfaces.IControladorAltaDeUsuario;
import logica.Artista;
import logica.Espectador;
import logica.manejadores.ManejadorUsuario;

public class ControladorAltaDeUsuario implements IControladorAltaDeUsuario {	
	public ControladorAltaDeUsuario() {
		super();
	}
	
	@Override
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Espectador nuevoEspectador = new Espectador(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac());
		mU.agegarUsuarios(nuevoEspectador);		
	}

	@Override
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Artista nuevoArtista = new Artista(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac(),descripcion,biografia,link);
		mU.agegarUsuarios(nuevoArtista);
	}
	
	@Override
	public boolean existeUsuarioPorNickname(String nickname) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorNickname(nickname) != null;
	}
	
	@Override
	public boolean existeUsuarioPorEmail(String email) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorEmail(email) != null;
	}
}
