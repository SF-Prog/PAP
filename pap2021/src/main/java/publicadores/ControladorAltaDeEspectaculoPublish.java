package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import excepciones.AltaEspectaculoExcepcion;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeEspectaculo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorAltaDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorAltaDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorAltaDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorAltaDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public String[] listarPlataformas() {
		return iCon.listarPlataformas();
	}

	@WebMethod
	public String[] listarArtistas() {
		return iCon.listarArtistas();
	}
	
	@WebMethod
	public boolean existeEspectaculo(String plataforma, String espectaculo) {	
		return iCon.existeEspectaculo(plataforma, espectaculo);
	}

	@WebMethod
	public void ingresaEspectaculo(String plataforma, String artista, DtEspectaculo dtE) throws AltaEspectaculoExcepcion {
		iCon.ingresaEspectaculo(plataforma, artista, dtE);
	}
}
