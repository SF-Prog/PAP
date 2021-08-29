package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;

public interface IControladorConsultaDeUsuario {
	public ArrayList<DtUsuario> listarUsuarios();
	public ArrayList<DtUsuario> seleccionaUsuario(String nickname);
	public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname);
	public ArrayList<DtFuncion> listaInfoFunciones(String nickname);
}
