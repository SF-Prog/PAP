package interfaces;

import datatypes.DtUsuario;

public interface IControladorAltaDeUsuario {
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario);
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link);
	public boolean existeUsuarioPorNickname(String nickname);
	public boolean existeUsuarioPorEmail(String email);
	public void seguirUsuario(String seguidor, String seguido) throws Exception;
	public void dejarSeguirUsuario(String seguidor, String seguido) throws Exception;
	public String[] usuariosSeguidos(String seguidor);
	public boolean checkSeguidor(String nicknameSeguidor, String nicknameSeguido);
}	
