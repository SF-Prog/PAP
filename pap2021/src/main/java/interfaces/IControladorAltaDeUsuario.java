package interfaces;


import datatypes.DtUsuario;

public interface IControladorAltaDeUsuario {
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario);

	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link );
	public boolean buscarNickname(String nickname );
	public boolean buscarEmail(String email);


}	
