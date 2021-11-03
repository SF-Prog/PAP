package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtRegistro;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorRegistroAFuncionDeEspectaculo;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorRegistroAFuncionDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorRegistroAFuncionDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorRegistroAFuncionDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorRegistroAFuncionDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorRegistroAFuncionDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorRegistroAFuncionDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public ArrayList<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		return iCon.seleccionaPlataforma(nombrePlataforma);
	}

	@WebMethod
	public ArrayList<DtFuncion> seleccionaEspectaculo(String nombreEspectaculo) {
		return iCon.seleccionaEspectaculo(nombreEspectaculo);
	}

	@WebMethod
	public ArrayList<DtUsuario> listarEspectadores() {
		return iCon.listarEspectadores();
	}

	@WebMethod
	public ArrayList<DtRegistro> seleccionEspectadorAFuncion(String nickname, String nombreFuncion, Date fechaRegistro) {
		return iCon.seleccionEspectadorAFuncion(nickname, nombreFuncion, fechaRegistro);
	}

	@WebMethod
	public boolean seleccionarRegistrosParaCanje(ArrayList<DtRegistro> dtRegistroCanje) {
		return iCon.seleccionarRegistrosParaCanje(dtRegistroCanje);
	}

	@WebMethod
	public void cambiarFuncion(String nombreFuncion) {	
		iCon.cambiarFuncion(nombreFuncion);
	}

	@WebMethod
	public void cambiarUsuario(String nickname) {	
		iCon.cambiarUsuario(nickname);
	}	
}
