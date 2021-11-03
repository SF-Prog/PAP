package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtPlataforma;
import excepciones.AltaPlataformaExcepcion;
import interfaces.Fabrica;
import interfaces.IControladorAltaDePlataforma;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorAltaDePlataformaPublish {
	private Fabrica fabrica;
	private IControladorAltaDePlataforma iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorAltaDePlataformaPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorAltaDePlataforma();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDePlataforma", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDePlataforma");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public boolean existePlataforma(String nombre) {
		return iCon.existePlataforma(nombre);
	};

	@WebMethod
	public void ingresaPlataforma(DtPlataforma dtp) throws AltaPlataformaExcepcion {
		iCon.ingresaPlataforma(dtp);
	}
};
