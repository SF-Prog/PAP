package logica;

import datatypes.DtUsuario;
import interfaces.IControladorAltaDeUsuario;

public class ControladorAltaDeUsuario implements IControladorAltaDeUsuario {
	
	public ControladorAltaDeUsuario() {
		super();
	}
	
	@Override
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		Espectador nuevoEspectador = new Espectador(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac());
		mU.agegarUsuarios(nuevoEspectador);		
	}

	@Override
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		Artista nuevoArtista = new Artista(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac(),descripcion,biografia,link);
		mU.agegarUsuarios(nuevoArtista);
	}
	
	@Override
	public boolean buscarUsuarioPorNickname(String nickname) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarUsuarioPorNickname(nickname) != null;
	}
	
	@Override
	public boolean buscarUsuarioPorEmail(String email) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarUsuarioPorEmail(email) != null;
	}
}
