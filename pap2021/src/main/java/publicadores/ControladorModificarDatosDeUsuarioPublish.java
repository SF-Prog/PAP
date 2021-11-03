package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorModificarDatosDeUsuario;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorModificarDatosDeUsuarioPublish {
	private Fabrica fabrica;
	private IControladorModificarDatosDeUsuario iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorModificarDatosDeUsuarioPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorModificarDatosDeUsuario();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorModificarDatosDeUsuario", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorModificarDatosDeUsuario");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<DtUsuario> listarUsuarios() {
		return iCon.listarUsuarios();
	}

	@WebMethod
	public DtUsuario seleccionarUsuario(String nickname) {
		return iCon.seleccionarUsuario(nickname);
	}

	@WebMethod
	public void ingresarDatosModificacion(DtUsuario nuevosDatosUsuario) {
		iCon.ingresarDatosModificacion(nuevosDatosUsuario);
	}

	@WebMethod
	public void finalizarModificacionUsuario() {
		iCon.finalizarModificacionUsuario();
	}
}
