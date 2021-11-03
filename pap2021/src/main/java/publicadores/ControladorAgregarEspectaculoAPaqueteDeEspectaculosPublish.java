package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtPaquete;
import interfaces.Fabrica;
import interfaces.IControladorAgregarEspectaculoAPaqueteDeEspectaculos;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorAgregarEspectaculoAPaqueteDeEspectaculosPublish {
	private Fabrica fabrica;
	private IControladorAgregarEspectaculoAPaqueteDeEspectaculos iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorAgregarEspectaculoAPaqueteDeEspectaculosPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorAgregarEspectaculoAPaqueteDeEspectaculos();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAgregarEspectaculoAPaqueteDeEspectaculos", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAgregarEspectaculoAPaqueteDeEspectaculos");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<DtPaquete> listarPaquetes() {
		return iCon.listarPaquetes();
	}
	
	@WebMethod
	public void seleccionarPaquete(String paquete) {
		iCon.seleccionarPaquete(paquete);		
	}
	
	@WebMethod
	public void seleccionarPlataforma(String plataforma) {
		iCon.seleccionarPlataforma(plataforma);	
	}
	
	@WebMethod
	public ArrayList<DtEspectaculo> listarEspectaculosEnPlataformaNoEnElPaquete() {
		return iCon.listarEspectaculosEnPlataformaNoEnElPaquete();
	}
	
	@WebMethod
	public void seleccionarEspectaculo(String espectaculo) {
		iCon.seleccionarEspectaculo(espectaculo);
	}
	
	@WebMethod
	public void ingresarEspectaculoAPaquete() {
		iCon.ingresarEspectaculoAPaquete();	
	}
}

