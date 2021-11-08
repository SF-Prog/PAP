package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

/*import interfaces.Fabrica;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import interfaces.IControladorConsultaDeEspectaculo;*/

import publicadores.ControladorConsultaDeEspectaculoPublish;
import publicadores.ControladorConsultaDeEspectaculoPublishService;
import publicadores.ControladorConsultaDeEspectaculoPublishServiceLocator;

import com.google.gson.Gson;
/**
 * Servlet implementation class Espectaculo
 */
@MultipartConfig
@WebServlet("/Espectaculo")
public class Espectaculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Fabrica fabrica;
	//IControladorConsultaDeEspectaculo iccde;
	//IControladorAltaDeFuncionDeEspectaculo icadfde;
	ControladorConsultaDeEspectaculoPublishService iccdes;
	ControladorConsultaDeEspectaculoPublish iccde;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Espectaculo() {
        super();
        // TODO Auto-generated constructor stub
        //fabrica = Fabrica.getInstancia();
        //iccde = fabrica.getIControladorConsultaDeEspectaculo();
        iccdes = new ControladorConsultaDeEspectaculoPublishServiceLocator();
        try {
        	iccde = iccdes.getControladorConsultaDeEspectaculoPublishPort();
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
		//out.println(); 
		     
		if(this.getPlataformas(request)){
			
			// TRAIGO LA LISTA DE PLATAFORMAS
		
			
			String[] listaPlataforma= iccde.listarPlataformasComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaPlataforma);
	        // Convert numbers array into JSON string.
	        String plataformasJson = gson.toJson(listaPlataforma);
	        out.println(plataformasJson); 

			// request.setAttribute("plataformas", numbersJson);
			 //request.
			 //rd.forward(request, response);		
			
		}else if(this.getEspectaculos(request)){
			// TRAIGO LA LISTA DE ESPECTACULOS
			
			iccde.seleccionaPlataforma(request.getParameter("plataforma"));
			String[] listaEspectaculos= iccde.listarEspectaculosComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaEspectaculos);
	        // Convert numbers array into JSON string.
	        String espectaculosJson = gson.toJson(listaEspectaculos);
	        out.println(espectaculosJson); 

		}else if(this.getFunciones(request)){
			
			// TRAIGO LA LISTA DE FUNCIONES
			
			iccde.seleccionaEspectaculo(request.getParameter("espectaculo"));
			String[] listaFunciones= iccde.listarFuncionesComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaFunciones);
	        // Convert numbers array into JSON string.
	        String funcionesJson = gson.toJson(listaFunciones);
	        out.println(funcionesJson); 
	        
		}else if(this.getPaquetes(request)){
			// TRAIGO LA LISTA DE PAQUETES
			
			iccde.seleccionaEspectaculo(request.getParameter("espectaculo"));
			String[] listaPaquetes= iccde.listarPaquetesComboBox();
		    Gson gson = new Gson();
		    System.out.println(listaPaquetes);
	        // Convert numbers array into JSON string.
	        String paquetesJson = gson.toJson(listaPaquetes);
	        out.println(paquetesJson); 

		}else if(this.getDetallePlataforma(request)) {
			Gson gson = new Gson();
		    System.out.println(iccde.seleccionaPlataforma(request.getParameter("plataforma")));
	        // Convert numbers array into JSON string.
	        String plataformaDetalleJson = gson.toJson(iccde.seleccionaPlataforma(request.getParameter("plataforma")));
	        out.println(plataformaDetalleJson); 
			
		}else if(this.getDetalleEspectaculo(request)) {
			Gson gson = new Gson();
		    System.out.println(iccde.seleccionaEspectaculo(request.getParameter("espectaculo")));
	        // Convert numbers array into JSON string.
	        String espectaculoDetalleJson = gson.toJson(iccde.seleccionaEspectaculo(request.getParameter("espectaculo")));
	        out.println(espectaculoDetalleJson); 
			
		}else if(this.getDetalleFuncion(request)) {
			
			//DtFuncion funcion = iccde.seleccionaFuncion(request.getParameter("funcion"));
		    Gson gson = new Gson();
		    System.out.println(iccde.seleccionaFuncion(request.getParameter("funcion")));
	        // Convert numbers array into JSON string.
	        String funcionDetalleJson = gson.toJson(iccde.seleccionaFuncion(request.getParameter("funcion")));
	        out.println(funcionDetalleJson); 
			
		}else if(this.getDetallePaquete(request)) {

		    Gson gson = new Gson();
		    System.out.println(iccde.seleccionaPaquete(request.getParameter("paquete")));
	        // Convert numbers array into JSON string.
	        String paquetesDetalleJson = gson.toJson(iccde.seleccionaEspectaculo(request.getParameter("paquete")));
	        out.println(paquetesDetalleJson); 
			
		} 

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
			return true;
		}
		return false;
	}
	private boolean getFunciones(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("getFunciones") && !request.getParameter("espectaculo").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	private boolean getPaquetes(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("getPaquetes") && !request.getParameter("espectaculo").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	private boolean getDetallePlataforma(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("detallePlataforma") && !request.getParameter("plataforma").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean getDetalleEspectaculo(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("detalleEspectaculo") && !request.getParameter("espectaculo").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	private boolean getDetalleFuncion(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("detalleFuncion") && !request.getParameter("funcion").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	private boolean getDetallePaquete(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("detallePaquete") && !request.getParameter("paquete").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
}
