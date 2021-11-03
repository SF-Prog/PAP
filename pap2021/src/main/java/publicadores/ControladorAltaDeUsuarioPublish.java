package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeUsuario;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorAltaDeUsuarioPublish {
	private Fabrica fabrica;
	private IControladorAltaDeUsuario iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorAltaDeUsuarioPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorAltaDeUsuario();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeUsuario", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeUsuario");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
		iCon.ingresaUsuarioEspectador(dtUsuario);
	}

	@WebMethod
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link) {
		iCon.ingresaUsuarioArtista(dtUsuario, descripcion, biografia, link);
	}

	@WebMethod
	public boolean existeUsuarioPorNickname(String nickname) {
		return iCon.existeUsuarioPorNickname(nickname);
	}

	@WebMethod
	public boolean existeUsuarioPorEmail(String email) {
		return iCon.existeUsuarioPorEmail(email);
	}
	
	@WebMethod
	public void seguirUsuario(String seguidor, String seguido) throws Exception {
		iCon.seguirUsuario(seguidor, seguido);
	}

	@WebMethod
	public void dejarSeguirUsuario(String seguidor, String seguido) throws Exception {
		iCon.dejarSeguirUsuario(seguidor, seguido);
	}

	@WebMethod
	public String[] usuariosSeguidos(String seguidor)  {
		return iCon.usuariosSeguidos(seguidor);
	}

	@WebMethod
	public boolean checkSeguidor(String nicknameSeguidor, String nicknameSeguido) {
		return iCon.checkSeguidor(nicknameSeguidor, nicknameSeguido);
	}
}
