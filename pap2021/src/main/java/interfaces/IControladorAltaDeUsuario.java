package interfaces;

import datatypes.DtUsuario;

public interface IControladorAltaDeUsuario {
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario);
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link);
	public boolean existeUsuarioPorNickname(String nickname);
	public boolean existeUsuarioPorEmail(String email);
}	
