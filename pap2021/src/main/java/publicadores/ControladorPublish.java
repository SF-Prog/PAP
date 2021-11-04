package publicadores;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import configuraciones.WebServiceConfiguracion;
import interfaces.Fabrica;
import interfaces.IControladorAgregarEspectaculoAPaqueteDeEspectaculos;
import interfaces.IControladorAltaDeEspectaculo;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import interfaces.IControladorAltaDePlataforma;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeEspectaculo;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;
import interfaces.IControladorConsultaDePaqueteDeEspectaculos;
import interfaces.IControladorConsultaDeUsuario;
import interfaces.IControladorCrearPaqueteDeEspectaculos;
import interfaces.IControladorModificarDatosDeUsuario;
import interfaces.IControladorRegistroAFuncionDeEspectaculo;

import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;

import logica.Artista;
import logica.Espectador;
import logica.Espectaculo;
import logica.EspectadorPaquete;
import logica.Funcion;
import logica.IdEspectadorPaquete;
import logica.Paquete;
import logica.Plataforma;
import logica.Registro;
import logica.Usuario;

import datatypes.DtFuncion;
import datatypes.DtUsuario;
import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtPaquete;
import datatypes.DtEspectador;
import datatypes.DtPlataforma;
import datatypes.DtRegistro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@WebService
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class ControladorPublish {
	private Fabrica fabrica;
	private IControladorAgregarEspectaculoAPaqueteDeEspectaculos iConAEAPDE;
	//private IControladorAltaDeEspectaculo iConAE;
	private IControladorAltaDeFuncionDeEspectaculo iConAFE;
	
	private IControladorAltaDePlataforma iConAP;
	private IControladorAltaDeUsuario iConAU;
	private IControladorConsultaDeEspectaculo iConCDE;
	private IControladorConsultaDeFuncionDeEspectaculo iConCFE;
	private IControladorConsultaDePaqueteDeEspectaculos iConCPE;
	private IControladorConsultaDeUsuario iConCU;
	private IControladorCrearPaqueteDeEspectaculos iConCPDE;
	private IControladorModificarDatosDeUsuario iConMDU;
	private IControladorRegistroAFuncionDeEspectaculo iConRFE;
	
	private WebServiceConfiguracion configuracion;
	private Endpoint endpoint; 

	public ControladorPublish() {
		fabrica = Fabrica.getInstancia();
		iConAEAPDE = fabrica.getIControladorAgregarEspectaculoAPaqueteDeEspectaculos();
		//iConAE = fabrica.getIControladorAltaDeEspectaculo();
		iConAFE = fabrica.getIControladorAltaDeFuncionDeEspectaculo();
		iConAP = fabrica.getIControladorAltaDePlataforma();
		iConAU = fabrica.getIControladorAltaDeUsuario();
		iConCDE = fabrica.getIControladorConsultaDeEspectaculo();
		iConCFE  = fabrica.getIControladorConsultaDeFuncionDeEspectaculo();
		iConCPE  = fabrica.getIControladorConsultaDePaqueteDeEspectaculos();
		iConCU = fabrica.getIControladorConsultaDeUsuario();
		iConCPDE = fabrica.getIControladorCrearPaqueteDeEspectaculos();
		iConMDU = fabrica.getIControladorModificarDatosDeUsuario();
		iConRFE = fabrica.getIControladorRegistroAFuncionDeEspectaculo();
		try {
			configuracion = new WebServiceConfiguracion();
		} catch (Exception ex) {
			System.out.println("Excepcion Webservice");
		}
	}
	
	@WebMethod(exclude = true)
	public void publicar() {
		endpoint = Endpoint.publish("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/controlador", this);
		System.out.println("http://" + configuracion.getConfigOf("#WS_IP") + ":" + configuracion.getConfigOf("#WS_PORT") + "/controlador");
	}
	
	@WebMethod(exclude = true)
	public Endpoint getEndpoint() {
        return endpoint;
	}
	
	//-------- INICIO ControladorAgregarEspectaculoAPaqueteDeEspectaculosPublish -----//

			@WebMethod
			public ArrayList<DtPaquete> listarPaquetes() {
				return iConAEAPDE.listarPaquetes();
			}
			
			@WebMethod
			public void seleccionarPaquete(String paquete) {
				iConAEAPDE.seleccionarPaquete(paquete);		
			}
			
			@WebMethod
			public void seleccionarPlataforma(String plataforma) {
				iConAEAPDE.seleccionarPlataforma(plataforma);	
			}
			
			@WebMethod
			public ArrayList<DtEspectaculo> listarEspectaculosEnPlataformaNoEnElPaquete() {
				return iConAEAPDE.listarEspectaculosEnPlataformaNoEnElPaquete();
			}
			
			@WebMethod
			public void seleccionarEspectaculo(String espectaculo) {
				iConAEAPDE.seleccionarEspectaculo(espectaculo);
			}
			
			@WebMethod
			public void ingresarEspectaculoAPaquete() {
				iConAEAPDE.ingresarEspectaculoAPaquete();	
			}
		//-------- FIN ControladorAgregarEspectaculoAPaqueteDeEspectaculosPublish -----//
		/*
			//--- INICIO ControladorAltaDeEspectaculoPublish ---//
			@WebMethod
			public String[] listarPlataformas() {
				return iConAE.listarPlataformas();
			}

			@WebMethod
			public String[] listarArtistas() {
				return iConAE.listarArtistas();
			}
			
			@WebMethod
			public boolean existeEspectaculo(String plataforma, String espectaculo) {	
				return iConAE.existeEspectaculo(plataforma, espectaculo);
			}

			@WebMethod
			public void ingresaEspectaculo(String plataforma, String artista, DtEspectaculo dtE) throws AltaEspectaculoExcepcion {
				iConAE.ingresaEspectaculo(plataforma, artista, dtE);
			}
			
		//--- FIN  ControladorAltaDeEspectaculoPublish---//
		*/
			
		//--- INICIO ControladorAltaDeFuncionDeEspectaculoPublish---//
				@WebMethod
				public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
					return iConAFE.seleccionaPlataforma(nombrePlataforma);
				};

				@WebMethod
				public Espectaculo seleccionaEspectaculo(String nombreEspectaculo) {
					return iConAFE.seleccionaEspectaculo(nombreEspectaculo);
				};

				@WebMethod
				public boolean existeFuncion(String nombreFuncion) {
					return iConAFE.existeFuncion(nombreFuncion);
				};

				@WebMethod
				public void ingresaFuncion(DtFuncion dtFuncion, List<String> artistasInvitados) throws AltaFuncionDeEspectaculoExcepcion {
					iConAFE.ingresaFuncion(dtFuncion, artistasInvitados);
				};
					
				@WebMethod
				public List<DtArtista> listarArtistasAFE() {
					return iConAFE.listarArtistas();
				};

				@WebMethod
				public void agregarArtistaAFuncion(String nombreArtista) {
					iConAFE.agregarArtistaAFuncion(nombreArtista);
				};
				
				@WebMethod
				public String[] listarPlataformasComboBox() {
					return iConAFE.listarPlataformasComboBox();
				};

				@WebMethod
				public String[] listarEspectaculosComboBox() {
					return iConAFE.listarEspectaculosComboBox();
				};

				@WebMethod
				public String[] listarArtistasComboBox() {
					return iConAFE.listarArtistasComboBox();
				};
			
			//--- FIN ControladorAltaDeFuncionDeEspectaculoPublish---//
				//--- INICIO ControladorAltaDePlataformaPublish ---//
				@WebMethod
				public boolean existePlataforma(String nombre) {
					return iConAP.existePlataforma(nombre);
				};

				@WebMethod
				public void ingresaPlataforma(DtPlataforma dtp) throws AltaPlataformaExcepcion {
					iConAP.ingresaPlataforma(dtp);
				}
			//--- FIN ControladorAltaDePlataformaPublish ---//
			//--- INICIO ControladorAltaDeUsuarioPublish ---//

				@WebMethod
				public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
					iConAU.ingresaUsuarioEspectador(dtUsuario);
				}

				@WebMethod
				public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link) {
					iConAU.ingresaUsuarioArtista(dtUsuario, descripcion, biografia, link);
				}

				@WebMethod
				public boolean existeUsuarioPorNickname(String nickname) {
					return iConAU.existeUsuarioPorNickname(nickname);
				}

				@WebMethod
				public boolean existeUsuarioPorEmail(String email) {
					return iConAU.existeUsuarioPorEmail(email);
				}
				
				@WebMethod
				public void seguirUsuario(String seguidor, String seguido) throws Exception {
					iConAU.seguirUsuario(seguidor, seguido);
				}

				@WebMethod
				public void dejarSeguirUsuario(String seguidor, String seguido) throws Exception {
					iConAU.dejarSeguirUsuario(seguidor, seguido);
				}

				@WebMethod
				public String[] usuariosSeguidos(String seguidor)  {
					return iConAU.usuariosSeguidos(seguidor);
				}

				@WebMethod
				public boolean checkSeguidor(String nicknameSeguidor, String nicknameSeguido) {
					return iConAU.checkSeguidor(nicknameSeguidor, nicknameSeguido);
				}
			//--- FIN ControladorAltaDeUsuarioPublish ---//
			//--- INICIO ControladorConsultaDeEspectaculoPublish---//
				@WebMethod
				public ArrayList<DtPlataforma> listarPlataformasCDE() {
					return iConCDE.listarPlataformas();
				}
				
				@WebMethod
				public String[] listarPlataformasComboBoxCDE() {
					return iConCDE.listarPlataformasComboBox();
				}
				
				
				@WebMethod
				public DtPlataforma seleccionaPlataformaCDE(String nombre) {
					return iConCDE.seleccionaPlataforma(nombre);
				}

				@WebMethod
				public ArrayList<DtEspectaculo> listarEspectaculos() {
					return iConCDE.listarEspectaculos();
				}
				
				@WebMethod
				public String[] listarEspectaculosComboBoxCDE() {
					return iConCDE.listarEspectaculosComboBox();
				}

				@WebMethod
				public DtEspectaculo seleccionaEspectaculoCDE(String nombre) {
					return iConCDE.seleccionaEspectaculo(nombre);
				}

				@WebMethod
				public ArrayList<DtFuncion> listarFunciones() {
					return iConCDE.listarFunciones();
				}

				@WebMethod
				public String[] listarFuncionesComboBox() {
					return iConCDE.listarFuncionesComboBox();
				}
				
				@WebMethod
				public DtFuncion seleccionaFuncion(String nombre) {
					return iConCDE.seleccionaFuncion(nombre);
				}

				@WebMethod
				public ArrayList<DtPaquete> listarPaquetesCDE() {
					return iConCDE.listarPaquetes();
				}
				
				@WebMethod
				public String[] listarPaquetesComboBox() {
					return iConCDE.listarPaquetesComboBox();
				}
				
				@WebMethod
				public DtPaquete seleccionaPaquete(String nombre) {
					return iConCDE.seleccionaPaquete(nombre);
				}

				@WebMethod
				public String[] listarArtistasInvitados() {
					return iConCDE.listarArtistasInvitados();
				}	
			//--- FIN ControladorConsultaDeEspectaculoPublish---//
			//--- INICIO  ControladorConsultaDeFuncionDeEspectaculoPublish---//

				@WebMethod
				public ArrayList<DtPlataforma> listarPlataformasCFE() {
					return iConCFE.listarPlataformas();
				}
				
				@WebMethod
				public String[] listarPlataformasComboBoxCFE() {
					return iConCFE.listarPlataformasComboBox();
				}
				
				@WebMethod
				public DtPlataforma seleccionaPlataformaCFE(String nombre) {
					return iConCFE.seleccionaPlataforma(nombre);
				}

				@WebMethod
				public ArrayList<DtEspectaculo> listarEspectaculosCFE(){
					return iConCFE.listarEspectaculos();
				}
				
				@WebMethod
				public String[] listarEspectaculosComboBoxCFE(){
					return iConCFE.listarEspectaculosComboBox();
				}

				@WebMethod
				public DtEspectaculo seleccionaEspectaculoCFE(String nombre) {
					return iConCFE.seleccionaEspectaculo(nombre);
				}

				@WebMethod
				public ArrayList<DtFuncion> listarFuncionesCFE() {
					return iConCFE.listarFunciones();
				}

				@WebMethod
				public String[] listarFuncionesComboBoxCFE() {
					return iConCFE.listarFuncionesComboBox();
				}
				
				@WebMethod
				public DtFuncion seleccionaFuncionCFE(String nombre) {
					return iConCFE.seleccionaFuncion(nombre);
				}

				@WebMethod
				public String[] listarArtistasInvitadosCFE() {
					return iConCFE.listarArtistasInvitados();
				}	
			
			//--- FIN  ControladorConsultaDeFuncionDeEspectaculoPublish---//
			//--- INICIO ControladorConsultaDePaqueteDeEspectaculosPublish ---//
				@WebMethod
				public ArrayList<DtPaquete> listarPaquetesCPE() {
					return iConCPE.listarPaquetes();
				}

				@WebMethod
				public DtPaquete seleccionaPaqueteCPE(String nombre) {
					return iConCPE.selecionaPaquete(nombre);
				}	
			//--- FIN ControladorConsultaDePaqueteDeEspectaculosPublish ---//
			//--- INICIO ControladorConsultaDeUsuarioPublish ---//
				@WebMethod
				public ArrayList<Usuario> listarUsuarios() {
					return iConCU.listarUsuarios();		
				}

				@WebMethod
				public ArrayList<DtUsuario> seleccionaUsuario(String nickname) {
					return iConCU.seleccionaUsuario(nickname);
				}

				@WebMethod
				public ArrayList<DtEspectaculo> listaInfoEspectaculos(String nickname) {
					return iConCU.listaInfoEspectaculos(nickname);
				}

				@WebMethod
				public ArrayList<DtFuncion> listaInfoFunciones(String nickname) {
					return iConCU.listaInfoFunciones(nickname);
				}
			
			//--- FIN  ControladorConsultaDeUsuarioPublish---//
			//--- INICIO  ControladorCrearPaqueteDeEspectaculosPublish---//
				
				@WebMethod
				public void solicitarDatos(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento) {
					iConCPDE.solicitarDatos(nombre, descripcion, fechainicio, fechaFin, descuento);
				}

				@WebMethod
				public boolean existeEspectaculo(String nombre) {
					return iConCPDE.exiteEspectaculo(nombre);
				}

				@WebMethod
				public void ingresaEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento, Date fechaAlta) {	
					iConCPDE.ingresaEspectaculo(nombre, descripcion, fechainicio, fechaFin, descuento, fechaAlta);
				}

				@WebMethod
				public void ModificarEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento, Date fechaAlta) {
					iConCPDE.ModificarEspectaculo(nombre, descripcion, fechainicio, fechaFin, descuento, fechaAlta);
				}
			//--- FIN ControladorCrearPaqueteDeEspectaculosPublish---//
			//--- INICIO ControladorModificarDatosDeUsuarioPublish ---//
				@WebMethod
				public ArrayList<DtUsuario> listarUsuariosMDU() {
					return iConMDU.listarUsuarios();
				}

				@WebMethod
				public DtUsuario seleccionarUsuario(String nickname) {
					return iConMDU.seleccionarUsuario(nickname);
				}

				@WebMethod
				public void ingresarDatosModificacion(DtUsuario nuevosDatosUsuario) {
					iConMDU.ingresarDatosModificacion(nuevosDatosUsuario);
				}

				@WebMethod
				public void finalizarModificacionUsuario() {
					iConMDU.finalizarModificacionUsuario();
				}
			
			//--- FIN ControladorModificarDatosDeUsuarioPublish---//
			//--- INICIO ControladorRegistroAFuncionDeEspectaculoPublish---//
				@WebMethod
				public ArrayList<DtEspectaculo> seleccionaPlataformaRFE(String nombrePlataforma) {
					return iConRFE.seleccionaPlataforma(nombrePlataforma);
				}

				@WebMethod
				public ArrayList<DtFuncion> seleccionaEspectaculoRFE(String nombreEspectaculo) {
					return iConRFE.seleccionaEspectaculo(nombreEspectaculo);
				}

				@WebMethod
				public ArrayList<DtUsuario> listarEspectadores() {
					return iConRFE.listarEspectadores();
				}

				@WebMethod
				public ArrayList<DtRegistro> seleccionEspectadorAFuncion(String nickname, String nombreFuncion, Date fechaRegistro) {
					return iConRFE.seleccionEspectadorAFuncion(nickname, nombreFuncion, fechaRegistro);
				}

				@WebMethod
				public boolean seleccionarRegistrosParaCanje(ArrayList<DtRegistro> dtRegistroCanje) {
					return iConRFE.seleccionarRegistrosParaCanje(dtRegistroCanje);
				}

				@WebMethod
				public void cambiarFuncion(String nombreFuncion) {	
					iConRFE.cambiarFuncion(nombreFuncion);
				}

				@WebMethod
				public void cambiarUsuario(String nickname) {	
					iConRFE.cambiarUsuario(nickname);
				}	
			
			//--- FIN ControladorRegistroAFuncionDeEspectaculoPublish---//
			
}
