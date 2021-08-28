package logica;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import interfaces.IControladorConsultaDeFuncionDeEspetaculo;

public class ControladorConsultaDeFuncionDeEspetaculo implements IControladorConsultaDeFuncionDeEspetaculo{

	public ControladorConsultaDeFuncionDeEspetaculo() {
		super();
	}

	@Override
	public ArrayList<DtPlataforma> listarPlataformas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seleccionaPlataforma(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<DtEspectaculo> listarEspectaculos(DtPlataforma dtPlataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seleccionaEspectaculo(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<DtFuncion> listarFunciones(DtEspectaculo dtEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seleccionaFuncion(String nombre) {
		// TODO Auto-generated method stub
		
	}
	
}
