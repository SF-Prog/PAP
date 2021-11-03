package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import logica.Espectaculo;
import logica.manejadores.ManejadorUsuario;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorAltaDeFuncionDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorAltaDeFuncionDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorAltaDeFuncionDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorAltaDeFuncionDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeFuncionDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorAltaDeFuncionDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		return iCon.seleccionaPlataforma(nombrePlataforma);
	};

	@WebMethod
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo) {
		return iCon.seleccionaEspectaculo(nombreEspectaculo);
	};

	@WebMethod
	public boolean existeFuncion(String nombreFuncion) {
		return iCon.existeFuncion(nombreFuncion);
	};

	@WebMethod
	public void ingresaFuncion(DtFuncion dtFuncion, List<String> artistasInvitados) throws AltaFuncionDeEspectaculoExcepcion {
		iCon.ingresaFuncion(dtFuncion, artistasInvitados);
	};
		
	@WebMethod
	public List<DtArtista> listarArtistas() {
		return iCon.listarArtistas();
	};

	@WebMethod
	public void agregarArtistaAFuncion(String nombreArtista) {
		iCon.agregarArtistaAFuncion(nombreArtista);
	};
	
	@WebMethod
	public String[] listarPlataformasComboBox() {
		return iCon.listarPlataformasComboBox();
	};

	@WebMethod
	public String[] listarEspectaculosComboBox() {
		return iCon.listarEspectaculosComboBox();
	};

	@WebMethod
	public String[] listarArtistasComboBox() {
		return iCon.listarArtistasComboBox();
	};
}
