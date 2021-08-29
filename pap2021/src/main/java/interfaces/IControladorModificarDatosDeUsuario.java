package interfaces;

import java.util.ArrayList;


import datatypes.DtUsuario;

public interface IControladorModificarDatosDeUsuario {
	public ArrayList<DtUsuario>  listarUsuarios();
	public DtUsuario seleccionarUsuario(String nickname);
	public void ingresarDatosModificacion(DtUsuario nuevosDatosUsuario);
	public void finalizarModificacionUsuario();
}
