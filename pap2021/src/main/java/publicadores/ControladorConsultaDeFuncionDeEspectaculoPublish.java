package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorConsultaDeFuncionDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorConsultaDeFuncionDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorConsultaDeFuncionDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorConsultaDeFuncionDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeFuncionDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeFuncionDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<DtPlataforma> listarPlataformas() {
		return iCon.listarPlataformas();
	}
	
	@WebMethod
	public String[] listarPlataformasComboBox() {
		return iCon.listarPlataformasComboBox();
	}
	
	@WebMethod
	public DtPlataforma seleccionaPlataforma(String nombre) {
		return iCon.seleccionaPlataforma(nombre);
	}

	@WebMethod
	public ArrayList<DtEspectaculo> listarEspectaculos(){
		return iCon.listarEspectaculos();
	}
	
	@WebMethod
	public String[] listarEspectaculosComboBox(){
		return iCon.listarEspectaculosComboBox();
	}

	@WebMethod
	public DtEspectaculo seleccionaEspectaculo(String nombre) {
		return iCon.seleccionaEspectaculo(nombre);
	}

	@WebMethod
	public ArrayList<DtFuncion> listarFunciones() {
		return iCon.listarFunciones();
	}

	@WebMethod
	public String[] listarFuncionesComboBox() {
		return iCon.listarFuncionesComboBox();
	}
	
	@WebMethod
	public DtFuncion seleccionaFuncion(String nombre) {
		return iCon.seleccionaFuncion(nombre);
	}

	@WebMethod
	public String[] listarArtistasInvitados() {
		return iCon.listarArtistasInvitados();
	}	
}
