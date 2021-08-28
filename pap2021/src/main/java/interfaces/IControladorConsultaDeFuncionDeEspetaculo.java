package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;

public interface IControladorConsultaDeFuncionDeEspetaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public void seleccionaPlataforma(String nombre);
	public ArrayList<DtEspectaculo> listarEspectaculos(DtPlataforma dtPlataforma);
	public void seleccionaEspectaculo(String nombre); 
	public ArrayList<DtFuncion>  listarFunciones(DtEspectaculo dtEspectaculo);
	public void seleccionaFuncion(String nombre);
	
	

}
