package interfaces;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;

public interface IControladorConsultaDeFuncionDeEspectaculo {
	public ArrayList<DtPlataforma> listarPlataformas();
	public String[] listarPlataformasComboBox();
	public DtPlataforma seleccionaPlataforma(String nombre);
	
	public ArrayList<DtEspectaculo> listarEspectaculos();
	public String[] listarEspectaculosComboBox();
	public DtEspectaculo seleccionaEspectaculo(String nombre); 
	
	public ArrayList<DtFuncion> listarFunciones();
	public String[] listarFuncionesComboBox();
	public DtFuncion seleccionaFuncion(String nombre);
	
	public String[] listarArtistasInvitados();
}
