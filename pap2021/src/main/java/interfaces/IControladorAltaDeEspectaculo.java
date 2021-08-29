package interfaces;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtUsuario;

public interface IControladorAltaDeEspectaculo {
	public boolean existeEspectaculo(String plataforma, String espectaculo);
	public void ingresaEspectaculo(String plataforma, DtArtista artista, DtEspectaculo dtEspectaculo);
	public DtUsuario buscarUsuarioPorNickname(String nickname);
	public DtUsuario buscarUsuarioPorEmail(String email);
}
