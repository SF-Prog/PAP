package interfaces;

import datatypes.DtUsuario;

public interface IControladorAltaDeUsuario {
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario);
	public void  ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biograf�a, String link );
}	
