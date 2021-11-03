package publicadores;

import configuraciones.WebServiceConfiguracion;
import interfaces.Fabrica;
import interfaces.IControladorCrearPaqueteDeEspectaculos;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorCrearPaqueteDeEspectaculosPublish {
	private Fabrica fabrica;
	private IControladorCrearPaqueteDeEspectaculos iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorCrearPaqueteDeEspectaculosPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorCrearPaqueteDeEspectaculos();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorCrearPaqueteDeEspectaculos", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorCrearPaqueteDeEspectaculos");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public void solicitarDatos(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento) {
		iCon.solicitarDatos(nombre, descripcion, fechainicio, fechaFin, descuento);
	}

	@WebMethod
	public boolean existeEspectaculo(String nombre) {
		return iCon.exiteEspectaculo(nombre);
	}

	@WebMethod
	public void ingresaEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento, Date fechaAlta) {	
		iCon.ingresaEspectaculo(nombre, descripcion, fechainicio, fechaFin, descuento, fechaAlta);
	}

	@WebMethod
	public void ModificarEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento, Date fechaAlta) {
		iCon.ModificarEspectaculo(nombre, descripcion, fechainicio, fechaFin, descuento, fechaAlta);
	}
}
