package publicadores;

import configuraciones.WebServiceConfiguracion;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeEspectaculo;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorConsultaDeEspectaculoPublish {
	private Fabrica fabrica;
	private IControladorConsultaDeEspectaculo iCon;
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorConsultaDeEspectaculoPublish() {
		fabrica = Fabrica.getInstancia();
		iCon = fabrica.getIControladorConsultaDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeEspectaculo", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/ControladorConsultaDeEspectaculo");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}

	@WebMethod
	public  DtPlataforma[] listarPlataformas() {
		ArrayList<DtPlataforma> arraylist = iCon.listarPlataformas();
		int i = 0;
		DtPlataforma[]  ret = new DtPlataforma[arraylist.size()];
		for(DtPlataforma s : arraylist) {
            ret[i]=s;
            i++;
        }
		return ret;
	}
	/*public  ArrayList<DtPlataforma> listarPlataformas() {
		return iCon.listarPlataformas();
	}*/
	
	@WebMethod
	public String[] listarPlataformasComboBox() {
		return iCon.listarPlataformasComboBox();
	}
	
	@WebMethod
	public DtPlataforma seleccionaPlataforma(String nombre) {
		return iCon.seleccionaPlataforma(nombre);
	}

	@WebMethod
	public DtEspectaculo[] listarEspectaculos() {

		ArrayList<DtEspectaculo> arraylist = iCon.listarEspectaculos();
		int i = 0;
		DtEspectaculo[]  ret = new DtEspectaculo[arraylist.size()];
		for(DtEspectaculo s : arraylist) {
            ret[i]=s;
            i++;
        }
		return ret;
	}
	/*public ArrayList<DtEspectaculo> listarEspectaculos() {
		return iCon.listarEspectaculos();
	}*/
	
	@WebMethod
	public String[] listarEspectaculosComboBox() {
		return iCon.listarEspectaculosComboBox();
	}

	@WebMethod
	public DtEspectaculo seleccionaEspectaculo(String nombre) {
		return iCon.seleccionaEspectaculo(nombre);
	}

	@WebMethod
	public DtFuncion[] listarFunciones() {
		ArrayList<DtFuncion> arraylist = iCon.listarFunciones();
		int i = 0;
		DtFuncion[]  ret = new DtFuncion[arraylist.size()];
		for(DtFuncion s : arraylist) {
            ret[i]=s;
            i++;
        }
		return ret;
	}
	/*public ArrayList<DtFuncion> listarFunciones() {
		return iCon.listarFunciones();
	}*/

	@WebMethod
	public String[] listarFuncionesComboBox() {
		return iCon.listarFuncionesComboBox();
	}
	
	@WebMethod
	public DtFuncion seleccionaFuncion(String nombre) {
		return iCon.seleccionaFuncion(nombre);
	}

	@WebMethod
	public DtPaquete[] listarPaquetes() {
		ArrayList<DtPaquete> arraylist = iCon.listarPaquetes();
		int i = 0;
		DtPaquete[]  ret = new DtPaquete[arraylist.size()];
		for(DtPaquete s : arraylist) {
            ret[i]=s;
            i++;
        }
		return ret;
	}
	/*public ArrayList<DtPaquete> listarPaquetes() {
		return iCon.listarPaquetes();
	}*/
	
	@WebMethod
	public String[] listarPaquetesComboBox() {
		return iCon.listarPaquetesComboBox();
	}
	
	@WebMethod
	public DtPaquete seleccionaPaquete(String nombre) {
		return iCon.seleccionaPaquete(nombre);
	}

	@WebMethod
	public String[] listarArtistasInvitados() {
		return iCon.listarArtistasInvitados();
	}	
}
