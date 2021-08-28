package interfaces;

import java.util.ArrayList;
import java.util.Date;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtRegistro;
import datatypes.DtUsuario;

public interface IControladorRegistroAFuncionDeEspetaculo {
	public ArrayList<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma);
	public ArrayList<DtFuncion> seleccionaEspectaculo(String nombreEspectaculo);
	public ArrayList<DtUsuario> listarEspectadores();
	public ArrayList<DtRegistro>  seleccionEspectadorAFuncion(String nickname, String nombreFuncion, Date fechaRegistro);
	public boolean seleccionarRegistrosParaCanje(ArrayList<DtRegistro> dtRegistroCanje);
	public void cambiarFuncion(String nombreFuncion);
	public void cambiarUsuario(String nickname);
	
	
}
