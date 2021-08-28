package logica;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;

public class ControladorConsultaDeEspetaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public ArrayList<DtEspectaculo> listarEspectáculos(DtPlataforma dtPlataforma);
	public void seleccionaEspectaculo(String nombre);
	public ArrayList<DtFuncion> listarFunciones(DtEspectaculo dtEspectaculo);
	public DtFuncion seleccionaFuncion(String nombre);
	public ArrayList<DtPaquete> listarPaquetes(DtEspectaculo dtEspectaculo);
	public DtPaquete seleccionaPaquere(String nombre);
}
