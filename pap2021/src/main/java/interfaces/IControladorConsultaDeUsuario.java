package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import logica.Usuario;

public interface IControladorConsultaDeUsuario {
	public ArrayList<Usuario> listarUsuarios();
	public ArrayList<DtUsuario> listarUsuariosDt();
	public ArrayList<DtUsuario> seleccionaUsuario(String nickname);
	public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname);
	public ArrayList<DtFuncion> listaInfoFunciones(String nickname);
}
