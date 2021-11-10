package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import datatypes.DtArtista;
import datatypes.DtEspectador;
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
	/*public ArrayList<Usuario> listarUsuarios() {
		ArrayList<DtEspectaculo> arraylist = iCon.listarUsuarios();
		int i = 0;
		DtEspectaculo[]  ret = new DtEspectaculo[arraylist.size()];
		for(DtEspectaculo s : arraylist) {
	        ret[i]=s;
	        i++;
	    }
		return ret;
		return iCon.listarUsuarios();		
	}*/
	

	@WebMethod
	public DtUsuario[] listarUsuariosDt() {
		ArrayList<DtUsuario> arraylist = iCon.listarUsuariosDt();
		int i = 0;
		System.out.println("aca");
		System.out.println(arraylist.size());
		
		DtUsuario[]  ret = new DtUsuario[arraylist.size()];
		for(DtUsuario s : arraylist) {
	        ret[i]=s;
	        i++;
	    }
		return ret;	
	}
	/*public ArrayList<DtUsuario> listarUsuariosDt() {
		
		return iCon.listarUsuariosDt();		
	}*/
	@WebMethod
	public DtUsuario[] seleccionaUsuario(String nickname) {
		ArrayList<DtUsuario> arraylist = iCon.seleccionaUsuario(nickname);
		int i = 0;
		DtUsuario[]  ret = new DtUsuario[arraylist.size()];
		for(DtUsuario s : arraylist) {
	        ret[i]=s;
	        i++;
	    }
		return ret;	
	}
	/*public ArrayList<DtUsuario> seleccionaUsuario(String nickname) {
		return iCon.seleccionaUsuario(nickname);
	}*/

	@WebMethod
	public DtEspectaculo[] listaInfoEspectaculos(String nickname) {
		ArrayList<DtEspectaculo> arraylist = iCon.listaInfoEspectaculos(nickname);
		int i = 0;
		DtEspectaculo[]  ret = new DtEspectaculo[arraylist.size()];
		for(DtEspectaculo s : arraylist) {
	        ret[i]=s;
	        i++;
	    }
		return ret;	
	}
	/*public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname) {
		return iCon.listaInfoEspectaculos(nickname);
	}*/

	@WebMethod
	public DtFuncion[] listaInfoFunciones(String nickname) {
		ArrayList<DtFuncion> arraylist = iCon.listaInfoFunciones(nickname);
		int i = 0;
		DtFuncion[]  ret = new DtFuncion[arraylist.size()];
		for(DtFuncion s : arraylist) {
	        ret[i]=s;
	        i++;
	    }
		return ret;	
	}
	/*public ArrayList<DtFuncion> listaInfoFunciones(String nickname) {
		return iCon.listaInfoFunciones(nickname);
	}*/
	
	@WebMethod
	public DtUsuario dtu() {
		return null;		
	}
	@WebMethod
	public DtArtista dta() {
		return null;		
	}
	@WebMethod
	public DtEspectador dte() {
		return null;		
	}
}
