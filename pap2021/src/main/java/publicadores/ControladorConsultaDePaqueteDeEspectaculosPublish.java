package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtPaquete;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDePaqueteDeEspectaculos;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorConsultaDePaqueteDeEspectaculosPublish {
	private Fabrica fabrica;
	private IControladorConsultaDePaqueteDeEspectaculos iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorConsultaDePaqueteDeEspectaculosPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorConsultaDePaqueteDeEspectaculos();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDePaqueteDeEspectaculos", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDePaqueteDeEspectaculos");
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
	public DtPaquete seleccionaPaquete(String nombre) {
		return iCon.selecionaPaquete(nombre);
	}	
}
