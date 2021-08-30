package interfaces;

import logica.controladores.ControladorAgregarEspectaculoAPaqueteDeEspectaculos;
import logica.controladores.ControladorAltaDeEspectaculo;
import logica.controladores.ControladorAltaDeFuncionDeEspectaculo;
import logica.controladores.ControladorAltaDePlataforma;
import logica.controladores.ControladorAltaDeUsuario;
import logica.controladores.ControladorConsultaDeEspectaculo;
import logica.controladores.ControladorConsultaDeFuncionDeEspectaculo;
import logica.controladores.ControladorConsultaDePaqueteDeEspectaculos;
import logica.controladores.ControladorConsultaDeUsuario;
import logica.controladores.ControladorCrearPaqueteDeEspectaculos;
import logica.controladores.ControladorModificarDatosDeUsuario;
import logica.controladores.ControladorRegistroAFuncionDeEspectaculo;

public class Fabrica {
	private static Fabrica instancia = null;
	
	private Fabrica(){}
	
	public static Fabrica getInstancia() {
		if (instancia == null)
			instancia = new Fabrica();
		return instancia;
	}
	
	public IControladorAltaDeUsuario getIControladorAltaDeUsuario() {
		return new ControladorAltaDeUsuario();
	}
	
	public IControladorAltaDeEspectaculo getIControladorAltaDeEspectaculo() {
		return new ControladorAltaDeEspectaculo();
	}
  
	public IControladorAltaDeFuncionDeEspectaculo getIControladorAltaDeFuncionDeEspectaculo() {
		return new ControladorAltaDeFuncionDeEspectaculo();
	}
	
	public IControladorAltaDePlataforma getIControladorAltaDePlataforma() {
		return new ControladorAltaDePlataforma();
	}

	public IControladorModificarDatosDeUsuario getIControladorModificarDatosDeUsuario() {
		return new ControladorModificarDatosDeUsuario();
	}
	
	public IControladorConsultaDeUsuario getIControladorConsultaDeUsuario() {
		return new ControladorConsultaDeUsuario();
	}
	
	public IControladorConsultaDeEspectaculo getIControladorConsultaDeEspectaculo() {
		return new ControladorConsultaDeEspectaculo();
	}

	public IControladorConsultaDeFuncionDeEspectaculo getIControladorConsultaDeFuncionDeEspectaculo() {
		return new ControladorConsultaDeFuncionDeEspectaculo();
	}	

	public IControladorConsultaDePaqueteDeEspectaculos getIControladorConsultaDePaqueteDeEspectaculos() {
		return new ControladorConsultaDePaqueteDeEspectaculos();
	}
  
	public IControladorCrearPaqueteDeEspectaculos getIControladorCrearPaqueteDeEspectaculos() {
		return new ControladorCrearPaqueteDeEspectaculos();
	}

	public IControladorAgregarEspectaculoAPaqueteDeEspectaculos getIControladorAgregarEspectaculoAPaqueteDeEspectaculos() {
		return new ControladorAgregarEspectaculoAPaqueteDeEspectaculos();
	}
	
	public IControladorRegistroAFuncionDeEspectaculo getIControladorRegistroAFuncionDeEspectaculo() {
		return new ControladorRegistroAFuncionDeEspectaculo();
	}
}
