package interfaces;

import logica.ControladorAgregarEspetaculoAPaqueteDeEspetaculos;
import logica.ControladorAltaDeEspetaculo;
import logica.ControladorAltaDeFuncionDeEspetaculo;
import logica.ControladorAltaDePlataforma;
import logica.ControladorAltaDeUsuario;
import logica.ControladorConsultaDeEspetaculo;
import logica.ControladorConsultaDeFuncionDeEspetaculo;
import logica.ControladorConsultaDePaqueteDeEspetaculos;
import logica.ControladorConsultaDeUsuario;
import logica.ControladorCrearPaqueteDeEspetaculos;
import logica.ControladorModificarDatosDeUsuario;
import logica.ControladorRegistroAFuncionDeEspetaculo;

public class Fabrica {
	private static Fabrica instancia = null;
	
	private Fabrica(){}
	
	public static Fabrica getInstancia() {
		if (instancia == null)
			instancia = new Fabrica();
		return instancia;
	}
	

	public IControladorAgregarEspetaculoAPaqueteDeEspetaculos getIControladorAgregarEspetaculoAPaqueteDeEspetaculos() {
		return new ControladorAgregarEspetaculoAPaqueteDeEspetaculos();
	}
	public IControladorAltaDeEspetaculo getIControladorAltaDeEspetaculo() {
		return new ControladorAltaDeEspetaculo();
	}
	
	public IControladorAltaDeFuncionDeEspetaculo getIControladorAltaDeFuncionDeEspetaculo() {
		return new ControladorAltaDeFuncionDeEspetaculo();
	}
	
	public IControladorAltaDePlataforma getIControladorAltaDePlataforma() {
		return new ControladorAltaDePlataforma();
	}
	
	public IControladorAltaDeUsuario getIControladorAltaDeUsuario() {
		return new ControladorAltaDeUsuario();
	}
	
	public IControladorConsultaDeEspetaculo getIControladorConsultaDeEspetaculo() {
		return new ControladorConsultaDeEspetaculo();
	}
	
	public IControladorConsultaDeFuncionDeEspetaculo getIControladorConsultaDeFuncionDeEspetaculo() {
		return new ControladorConsultaDeFuncionDeEspetaculo();
	}
	
	public IControladorConsultaDePaqueteDeEspetaculos getIControladorConsultaDePaqueteDeEspetaculos() {
		return new ControladorConsultaDePaqueteDeEspetaculos();
	}
	
	public IControladorConsultaDeUsuario getIControladorConsultaDeUsuario() {
		return new ControladorConsultaDeUsuario();
	}
	public IControladorCrearPaqueteDeEspetaculos getIControladorCrearPaqueteDeEspetaculos() {
		return new ControladorCrearPaqueteDeEspetaculos();
	}

	public IControladorModificarDatosDeUsuario getIControladorModificarDatosDeUsuario() {
		return new ControladorModificarDatosDeUsuario();
	}
	public IControladorRegistroAFuncionDeEspetaculo get() {
		return new ControladorRegistroAFuncionDeEspetaculo();
	}
}
