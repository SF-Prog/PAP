package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import datatypes.DtFuncion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import interfaces.IControladorConsultaDeEspectaculo;

/**
 * Servlet implementation class Funciones
 */
@MultipartConfig
@WebServlet("/Funciones")
public class Funciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fabrica fabrica;
	IControladorAltaDeFuncionDeEspectaculo icadfde;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Funciones() {
        super();
        fabrica = Fabrica.getInstancia();
        icadfde = fabrica.getIControladorAltaDeFuncionDeEspectaculo();
        // TODO Auto-generated constructor stub
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

			String nombre = request.getParameter("Nombre");
		    Date fechaAlta=null;
			try {
				fechaAlta = new SimpleDateFormat("yyy-MM-dd").parse(request.getParameter("fechaAlta"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
        	String horaInicio = request.getParameter("horaInicio");
        	Date fechaInicio=null;
			try {
				fechaInicio = new SimpleDateFormat("yyy-MM-dd").parse(request.getParameter("fechaInicio"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
        	
			String imagen = "";
			
			//Gson gson = new Gson();
        	
        	String json= request.getParameter("listaArtistas"); 
        	ObjectMapper mapper = new ObjectMapper();
   
        	List<String> listaArtistas = mapper.readValue(json, new TypeReference<List<String>>(){});
        	//List<String> listaArtistas= null;
        	//String[] listaArtistas = request.getParameter("listaArtistas"); 
        	System.out.println(listaArtistas);
    	
    		DtFuncion dtFuncion = new DtFuncion(nombre, fechaInicio, horaInicio, fechaAlta, imagen);
    		
    		try {
				icadfde.ingresaFuncion(dtFuncion, listaArtistas);
			} catch (AltaFuncionDeEspectaculoExcepcion e) {
				// TODO Auto-generated catch block
				throw new ServletException(e.getMessage());
				
			}
    		
    		
    		System.out.println("si"); 
    	
    		//JOptionPane.showMessageDialog(this, e.getMessage(), nombreFormulario, JOptionPane.ERROR_MESSAGE);
    		System.out.println("no"); 
        	

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
			

			String[] listaEspectaculos= icadfde.listarArtistasComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaEspectaculos);
	        // Convert numbers array into JSON string.
	        String espectaculosJson = gson.toJson(listaEspectaculos);
	        out.println(espectaculosJson); 

		}else if(this.selectPlataforma(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
			icadfde.seleccionaPlataforma(request.getParameter("plataforma"));
			

	     }else if(this.selectEspectaculos(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
	    	 logica.Espectaculo esp = icadfde.seleccionaEspectaculo(request.getParameter("espectaculos"));
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
