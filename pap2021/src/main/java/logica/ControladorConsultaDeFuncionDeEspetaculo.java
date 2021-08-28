package logica;

import java.util.ArrayList;
import java.util.Date;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;

public class ControladorConsultaDeFuncionDeEspetaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public void seleccionaPlataforma(String nombre);
	public ArrayList<DtEspectaculo> listarEspectáculos(DtPlataforma dtPlataforma);
	public void seleccionaEspectaculo(String nombre); 
	public ArrayList<DtFuncion>  listarFunciones(DtEspectaculo dtEspectaculo);
	public void seleccionaFuncion(String nombre);
	
}
