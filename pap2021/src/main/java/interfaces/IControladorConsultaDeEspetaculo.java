package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;

public interface IControladorConsultaDeEspetaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public DtPlataforma seleccionaPlataforma(String nombre);
	public ArrayList<DtEspectaculo> listarEspectaculos();
	public DtEspectaculo seleccionaEspectaculo(String nombre);
	public ArrayList<DtFuncion> listarFunciones();
	public DtFuncion seleccionaFuncion(String nombre);
	public ArrayList<DtPaquete> listarPaquetes();
	public DtPaquete seleccionaPaquere(String nombre);
}
