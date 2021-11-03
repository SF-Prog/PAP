package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeEspectaculo;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorConsultaDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorConsultaDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorConsultaDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorConsultaDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<DtPlataforma> listarPlataformas() {
		return iCon.listarPlataformas();
	}
	
	@WebService
	public String[] listarPlataformasComboBox() {
		return iCon.listarPlataformasComboBox();
	}
	
	@WebService
	public DtPlataforma seleccionaPlataforma(String nombre) {
		return iCon.seleccionaPlataforma(nombre);
	}

	@WebService
	public ArrayList<DtEspectaculo> listarEspectaculos() {
		return iCon.listarEspectaculos();
	}
	
	@WebService
	public String[] listarEspectaculosComboBox() {
		return iCon.listarEspectaculosComboBox();
	}

	@WebService
	public DtEspectaculo seleccionaEspectaculo(String nombre) {
		return iCon.seleccionaEspectaculo(nombre);
	}

	@WebService
	public ArrayList<DtFuncion> listarFunciones() {
		return iCon.listarFunciones();
	}

	@WebService
	public String[] listarFuncionesComboBox() {
		return iCon.listarFuncionesComboBox();
	}
	
	@WebService
	public DtFuncion seleccionaFuncion(String nombre) {
		return iCon.seleccionaFuncion(nombre);
	}

	@WebService
	public ArrayList<DtPaquete> listarPaquetes() {
		return iCon.listarPaquetes();
	}
	
	@WebService
	public String[] listarPaquetesComboBox() {
		return iCon.listarPaquetesComboBox();
	}
	
	@WebService
	public DtPaquete seleccionaPaquete(String nombre) {
		return iCon.seleccionaPaquete(nombre);
	}

	@WebService
	public String[] listarArtistasInvitados() {
		return iCon.listarArtistasInvitados();
	}	
}
