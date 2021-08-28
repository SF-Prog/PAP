package logica;

import java.util.ArrayList;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import interfaces.IControladorConsultaDeEspetaculo;

public class ControladorConsultaDeEspetaculo implements IControladorConsultaDeEspetaculo {
	
	public ControladorConsultaDeEspetaculo() {
		super();
	}
	@Override
	public ArrayList<DtPlataforma> listarPlataformas() {
		// TODO Auto-generated method stub
		return null;
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
	public DtFuncion seleccionaFuncion(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DtPaquete> listarPaquetes(DtEspectaculo dtEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DtPaquete seleccionaPaquere(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
