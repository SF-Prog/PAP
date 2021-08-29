package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;

public interface IControladorConsultaDeFuncionDeEspectaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public DtPlataforma seleccionaPlataforma(String nombre);
	public ArrayList<DtEspectaculo> listarEspectaculos();
	public DtEspectaculo seleccionaEspectaculo(String nombre); 
	public ArrayList<DtFuncion>  listarFunciones();
	public DtFuncion seleccionaFuncion(String nombre);
}
