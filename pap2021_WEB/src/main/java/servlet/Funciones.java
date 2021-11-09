package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/*import datatypes.DtFuncion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
*/

import publicadores.DtFuncion;
import publicadores.ControladorConsultaDeEspectaculoPublish;
import publicadores.ControladorConsultaDeEspectaculoPublishService;
import publicadores.ControladorConsultaDeEspectaculoPublishServiceLocator;

import publicadores.DtEspectaculo;

/**
 * Servlet implementation class Funciones
 */
@MultipartConfig
@WebServlet("/Funciones")
public class Funciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Fabrica fabrica;
	//IControladorAltaDeFuncionDeEspectaculo icadfde;
	ControladorConsultaDeEspectaculoPublishService icadfdes;
	ControladorConsultaDeEspectaculoPublish icadfde;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Funciones() {
        super();

        // TODO Auto-generated constructor stub
        icadfdes = new ControladorConsultaDeEspectaculoPublishServiceLocator();
        try {
        	icadfde = icadfdes.getControladorConsultaDeEspectaculoPublishPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		if(this.esAltaFuncionDeEspectaculo(request)) {

			//String nombre = request.getParameter("Nombre");
        	//String horaInicio = request.getParameter("horaInicio");
        	//Date fechaInicio=new Date();
			//try {
			//	fechaInicio = new SimpleDateFormat("yyy-MM-dd").parse(request.getParameter("fechaInicio"));
			//} catch (ParseException e1) {
				// TODO Auto-generated catch block
			//	e1.printStackTrace();
			//}
        	//Date fechaAlta=new Date();
			//String imagen = "";
			
			
        	
        	//String json= request.getParameter("listaArtistas"); 
        	//ObjectMapper mapper = new ObjectMapper();
   
        	//List<String> listaArtistas = mapper.readValue(json, new TypeReference<List<String>>(){});
        	
        	//System.out.println(listaArtistas);
    	
    		//DtFuncion dtFuncion = new DtFuncion(nombre, fechaInicio, horaInicio, fechaAlta, imagen);
    		//PrintWriter out2 = response.getWriter();
    		//try {
			//	icadfde.ingresaFuncion(dtFuncion, listaArtistas);

			//	out2.print("Funcion dada de alta"); 
			//} catch (AltaFuncionDeEspectaculoExcepcion e) {
			//	// TODO Auto-generated catch block
			//	out2.println(e.getMessage()); 
				//throw new ServletException();				
			//}
    	
    		//JOptionPane.showMessageDialog(this, e.getMessage(), nombreFormulario, JOptionPane.ERROR_MESSAGE);

        	

			//icadfde.
		   //Gson gson = new Gson();
		    //System.out.println(iccde.seleccionaPaquete(request.getParameter("paquete")));
	        // Convert numbers array into JSON string.
	        //String paquetesDetalleJson = gson.toJson(iccde.seleccionaEspectaculo(request.getParameter("paquete")));
	        //out.println(paquetesDetalleJson); 
			
		}else if(this.getPlataformas(request)){
			
			// TRAIGO LA LISTA DE PLATAFORMAS
		
			
			String[] listaPlataforma= icadfde.listarPlataformasComboBox();
		    Gson gson = new Gson();
		   
	        // Convert numbers array into JSON string.
	        String plataformasJson = gson.toJson(listaPlataforma);
	        //System.out.println("agus");
	        out.println(plataformasJson); 

			// request.setAttribute("plataformas", numbersJson);
			 //request.
			 //rd.forward(request, response);		
			
		}else if(this.getEspectaculos(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
			String[] listaEspectaculos= icadfde.listarEspectaculosComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaEspectaculos);
	        // Convert numbers array into JSON string.
	        String espectaculosJson = gson.toJson(listaEspectaculos);
	        out.println(espectaculosJson); 

		}else if(this.getArtistas(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
		/*	
	
			String[] listaEspectaculos= icadfde.listarArtistasComboBox();			
		    Gson gson = new Gson();
		    System.out.println(listaEspectaculos);
	        // Convert numbers array into JSON string.
	        String espectaculosJson = gson.toJson(listaEspectaculos);
	        out.println(espectaculosJson); 
		 	*/
		}else if(this.selectPlataforma(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
			System.out.println("PLATAFORMA EN SERVER " + request.getParameter("plataforma"));
			icadfde.seleccionaPlataforma(request.getParameter("plataforma"));
			

	     }else if(this.selectEspectaculos(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
	    	 DtEspectaculo esp = icadfde.seleccionaEspectaculo(request.getParameter("espectaculos"));
	    	 System.out.println(esp.getNombre());
	     }
	}

	private boolean esAltaFuncionDeEspectaculo(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("altaFuncion") && !request.getParameter("altaFuncion").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean getPlataformas(HttpServletRequest request) {
		
		if(request.getParameterMap().containsKey("getParametro") && !request.getParameter("getParametro").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			return true;
		}
		return false;
	}
	
	private boolean getEspectaculos(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("getEspectaculo") && !request.getParameter("plataforma").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION		
			//System.out.println("agus2");
			return true;
		}
		//System.out.println("agus3");
		return false;
	}
	
	private boolean getArtistas(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("getArtistas") && !request.getParameter("espectaculo").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean selectPlataforma(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("selectPlataforma") && !request.getParameter("plataforma").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean selectEspectaculos(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("selectEspectaculos") && !request.getParameter("espectaculos").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
}
