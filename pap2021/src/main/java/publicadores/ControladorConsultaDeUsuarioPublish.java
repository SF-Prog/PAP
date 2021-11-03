package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeUsuario;
import logica.Usuario;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorConsultaDeUsuarioPublish {
	private Fabrica fabrica;
	private IControladorConsultaDeUsuario iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorConsultaDeUsuarioPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorConsultaDeUsuario();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeUsuario", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeUsuario");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<Usuario> listarUsuarios() {
		return iCon.listarUsuarios();		
	}

	@WebMethod
	public ArrayList<DtUsuario> seleccionaUsuario(String nickname) {
		return iCon.seleccionaUsuario(nickname);
	}

	@WebMethod
	public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname) {
		return iCon.listaInfoEspectaculos(nickname);
	}

	@WebMethod
	public ArrayList<DtFuncion> listaInfoFunciones(String nickname) {
		return iCon.listaInfoFunciones(nickname);
	}
}
