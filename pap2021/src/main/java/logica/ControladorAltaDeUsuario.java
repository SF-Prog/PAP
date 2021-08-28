package logica;

import datatypes.DtUsuario;
import interfaces.IControladorAltaDeUsuario;

public class ControladorAltaDeUsuario implements IControladorAltaDeUsuario {
	
	public ControladorAltaDeUsuario() {
		super();
	}
	@Override
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
		// TODO Auto-generated method stub
	
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		Espectador nuevoEspectador = new Espectador(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac());
		mU.agegarUsuarios(nuevoEspectador);

		
	}

	@Override
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografía, String link) {
		// TODO Auto-generated method stub

		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		Artista nuevoArtista = new Artista(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac(),descripcion,biografía,link);
		mU.agegarUsuarios(nuevoArtista);

	}
	
	@Override
	public boolean buscarNickname(String nickname) {
		// TODO Auto-generated method stub

		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarNickname(nickname);

	}
	
	@Override
	public boolean buscarEmail(String email) {
		// TODO Auto-generated method stub
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarEmail(email);

	}

	
}
