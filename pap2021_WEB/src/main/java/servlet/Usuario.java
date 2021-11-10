package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.lang.Exception;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;

import publicadores.DtArtista;
import publicadores.DtEspectador;
import publicadores.DtUsuario;
/*import interfaces.Fabrica;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeUsuario;
*/
import publicadores.ControladorConsultaDeUsuarioPublish;
import publicadores.ControladorConsultaDeUsuarioPublishService;
import publicadores.ControladorConsultaDeUsuarioPublishServiceLocator;

/**
 * Servlet implementation class Usuario
 */
@MultipartConfig
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Fabrica fabrica;
	//IControladorConsultaDeUsuario iccdu;
	//IControladorAltaDeUsuario icadu;
	ControladorConsultaDeUsuarioPublishService ccups;
	ControladorConsultaDeUsuarioPublish iccdu;
	//ControladorPublish port

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
        //fabrica =  Fabrica.getInstancia();
		//iccdu = fabrica.getIControladorConsultaDeUsuario();
		//icadu = fabrica.getIControladorAltaDeUsuario();	
        ccups = new ControladorConsultaDeUsuarioPublishServiceLocator();
        try {
			iccdu = ccups.getControladorConsultaDeUsuarioPublishPort();
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
		/*doGet(request, response);*/		

		RequestDispatcher rd;
		if(this.esInicioSesion(request)){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			String user = request.getParameter("user");
			String password = request.getParameter("password");
			boolean conectado = false;
			if(user != ""  && password != "") {
				//ArrayList<logica.Usuario> usuarios = iccdu.listarUsuarios();
				//ArrayList<DtUsuario> usuarios = iccdu.listarUsuarios();
				
				for(DtUsuario s : iccdu.listarUsuariosDt()) {
					System.out.println(s.getEmail());			       
			    }
				DtUsuario[] usuarios = iccdu.listarUsuariosDt();
				DtUsuario usuario = this.iniciarSesionUsuario(usuarios,user,password);
				if(usuario != null) {
					 HttpSession session = request.getSession(conectado);					 
					 
					 session.setAttribute("conectado", true);
					 session.setAttribute("uNickName", usuario.getNickName());
					 session.setAttribute("uEmail", usuario.getEmail());
					 session.setAttribute("uApellido", usuario.getApellido());
					 session.setAttribute("uNombre", usuario.getNombre());

					 if(usuario instanceof DtArtista){
						 session.setAttribute("tipo", "artista");
					 }else if(usuario instanceof DtEspectador) {
						 session.setAttribute("tipo", "espectador");
					 }else {
						 session.setAttribute("tipo", "admin");
					 }					 
					 request.setAttribute("mensaje", "Bienvenido "+usuario.getNickName());					 
					 rd=request.getRequestDispatcher("index.jsp");
				}else{
					request.setAttribute("mensaje", "Usuario y/o contraseña incorrecta");
					rd=request.getRequestDispatcher("inicioSesion.jsp");
				}
			}else{
				request.setAttribute("mensaje", "Debe ingresar usuario y contraseña");
				rd=request.getRequestDispatcher("inicioSesion.jsp");
			}
			rd.forward(request, response);
		}else if(this.esAltaUsuarioArtista(request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA	
			
			//String nickName =request.getParameter("nicknameU");
			//String email =request.getParameter("emailU");
			//String nombre =  request.getParameter("nombreU");
			//String apellido = request.getParameter("apellidoU");
			//String password =request.getParameter("password");
			//String imagen ="";
			//SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
			//String parameter = request.getParameter("fecchaU");
			//Date fecha = null ;
			//try {
			//	fecha = in.parse(parameter);
			//} catch (ParseException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			
			//String descripcionGeneral =request.getParameter("descripcionGeneralU");
			//String link = request.getParameter("linkU");
			//String biografia = request.getParameter("biografiaU");
			//PrintWriter out = response.getWriter();
			//if(!icadu.existeUsuarioPorEmail(email) && !icadu.existeUsuarioPorNickname(nickName)){
			//if(true){
			//	icadu.ingresaUsuarioArtista(new DtUsuario(nickName, nombre,  apellido,  email,  fecha,password,imagen), descripcionGeneral, biografia, link);
			//	System.out.println("entro Artista");
			//	out.print("Usuario creado correctamente"); 
				/*request.setAttribute("mensaje", "Usuario creado correctamente");
				rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);*/
			//}else{
			//	out.print("Nickname y/o email ya estan en uso"); 
				/*request.setAttribute("mensaje", "Nickname y/o email ya estan en uso");
				rd=request.getRequestDispatcher("altaUsuario.jsp");
				rd.forward(request, response);*/
			//}
			
			 PrintWriter out=response.getWriter(); 
		        out.println("comentado");	
		}else if(this.esAltaUsuarioEspectador(request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ESPECTADOR
			//String nickName =request.getParameter("nicknameU");
			//String email =request.getParameter("emailU");
			//String nombre =  request.getParameter("nombreU");
			//String apellido = request.getParameter("apellidoU");
			//String password =request.getParameter("password");
			//String imagen ="";
			//SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
			//String parameter = request.getParameter("fecchaU");
			//Date fecha = null ;
			//try {
			//	fecha = in.parse(parameter);
			//} catch (ParseException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			
			//PrintWriter out = response.getWriter();
			//if(!icadu.existeUsuarioPorEmail(email) && !icadu.existeUsuarioPorNickname(nickName)){
			//	DtUsuario dt=new DtUsuario(nickName, nombre,  apellido,  email,  fecha,password,imagen);
			///	icadu.ingresaUsuarioEspectador( dt);

			//	out.print("Usuario creado correctamente"); 
				/*request.setAttribute("mensaje", "Usuario creado correctamente");
				rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);*/
			//}else{
			//	out.print("Nickname y/o email ya estan en uso"); 
				/*request.setAttribute("mensaje", "Nickname y/o email ya estan en uso");
				rd=request.getRequestDispatcher("altaUsuario.jsp");
				rd.forward(request, response);*/
			//}
			 PrintWriter out=response.getWriter(); 
		        out.println("comentado");	
		}else if(this.esCerrarSesion(request)){
			HttpSession sesion = request.getSession(false);
		    sesion.invalidate();
		    
			request.setAttribute("mensaje", "Sesión cerrada");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);			 
	        
	        //PrintWriter out=response.getWriter();  
	       /* request.getRequestDispatcher("index.jsp").include(request, response);  //aca le pongo la redireccion del logout
	        
	        HttpSession sesion = request.getSession(false);
	        sesion.invalidate();
	        response.sendRedirect("index.jsp");*/
		}else if(this.esTraerUsuarios(request)){
			//ArrayList<DtUsuario> listUsuarios=  iccdu.listarUsuarios();
		    //Gson gson = new Gson();		   
	        // Convert numbers array into JSON string.
	        //String plataformasJson = gson.toJson(listUsuarios);
	        //PrintWriter out=response.getWriter(); 
	        //out.println(plataformasJson);	      
	        PrintWriter out=response.getWriter(); 
	        out.println("comentado");	 
		}else if(this.esSeguirUsuario(request)){			
			//String nickNameSeguidor =request.getParameter("nickNameSeguidor");
			//String nickNameSeguido =request.getParameter("nickNameSeguido");	
			//String message = "Usuario seguido correctamente";		
			//try {
				//icadu.seguirUsuario(nickNameSeguidor, nickNameSeguido);
			//} catch (Exception e) { 
			//	message = e.getMessage();
			//}       
			//PrintWriter out=response.getWriter(); 
	       // out.print(message);
			/*request.setAttribute("mensaje", message);
			rd=request.getRequestDispatcher("seguirUsuario.jsp");
			rd.forward(request, response);*/
	        PrintWriter out=response.getWriter(); 
	        out.println("comentado");	
		}else if(this.esDejarSeguirUsuario(request)){			
			//String nickNameSeguidor =request.getParameter("nickNameSeguidor");
			//String nickNameSeguido =request.getParameter("nickNameSeguido");
			//String message = "Usuario dejado de seguir correctamente";
			//try {
			//	icadu.dejarSeguirUsuario(nickNameSeguidor, nickNameSeguido);
			//} catch (Exception e) {
			//	message = e.getMessage();
			//}
			//PrintWriter out=response.getWriter(); 
	        //out.print(message);
			/*request.setAttribute("mensaje", message);
			rd=request.getRequestDispatcher("seguirUsuario.jsp");
			rd.forward(request, response);*/
	        PrintWriter out=response.getWriter(); 
	        out.println("comentado");	
		}else if(this.esListarSeguidores(request)) {
			//String nickNameSeguidor =request.getParameter("nickNameSeguidor");
			//String[] listaSeguidores= icadu.usuariosSeguidos(nickNameSeguidor);
			
		    //Gson gson = new Gson();
	        //String plataformasJson = gson.toJson(listaSeguidores);
			//PrintWriter out = response.getWriter();
	        //out.println(plataformasJson); 
	        PrintWriter out=response.getWriter(); 
	        out.println("comentado");	
		}
	}

	private boolean esInicioSesion (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("user") && request.getParameterMap().containsKey("password") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean esCerrarSesion (HttpServletRequest request) {
		System.out.println(request.getParameterMap().containsKey("close"));
		if(request.getParameterMap().containsKey("close") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			System.out.println("cerro sesion");
			return true;
		}
		return false;
	}
	
	private boolean esAltaUsuarioArtista (HttpServletRequest request) {
		if( request.getParameterMap().containsKey("TipoUsuario") && request.getParameter("TipoUsuario").equals("Artista") ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA		
			return true;
		}
		return false;
	}
	
	private boolean esAltaUsuarioEspectador (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("TipoUsuario") && request.getParameter("TipoUsuario").equals("Espectador") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			return true;
		}
		return false;
	}
	
	private boolean esTraerUsuarios (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("traerUsuarios") && !request.getParameter("traerUsuarios").isEmpty()  ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			return true;
		}
		return false;
	}	
	
	private boolean esSeguirUsuario (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("seguirUsuario")&& !request.getParameter("seguirUsuario").isEmpty()  ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			return true;
		}
		return false;
	}	
	
	private boolean esDejarSeguirUsuario(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("dejarSeguir") && !request.getParameter("dejarSeguir").isEmpty()){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ESPECTADOR		
			return true;
		}
		return false;
	}		
	
	private boolean esListarSeguidores(HttpServletRequest request) {
		if(request.getParameterMap().containsKey("listarSeguidores")){	
			return true;
		}
		return false;
	}	

	private DtUsuario iniciarSesionUsuario(DtUsuario[] usuarios,String usuario,String password){
		//logica.Usuario dtu = null;
		
		//Iterator<logica.Usuario> eIterator = usuarios.iterator();		
		//boolean existe = false;
		//while(eIterator.hasNext() && !existe){
		//	logica.Usuario temp = eIterator.next();
		//	if(temp.getEmail().equals(usuario) || temp.getNickName().equals(usuario)){
		//		if(password.equals(temp.getPassword())) {
		//			existe = true;
		//			dtu= new(temp) ;
		//			System.out.println("ingreso usuario");
		//		}				
		//	}
		//}
		//return dtu;
		
		DtUsuario dtu = null;
		/*Iterator<DtUsuario> eIterator = usuarios.iterator();		
		boolean existe = false;
		while(eIterator.hasNext() && !existe){
			DtUsuario temp = eIterator.next();
			if(temp.getEmail().equals(usuario) || temp.getNickName().equals(usuario)){
				if(password.equals(temp.getPassword())) {
					existe = true;
					dtu= temp ;
					System.out.println("ingreso usuario");
				}				
			}
		}*/
		boolean existe = false;
		for(DtUsuario temp : usuarios) {
			System.out.println(temp.getEmail());
			if(temp.getEmail().equals(usuario) || temp.getNickName().equals(usuario)){
				;
				if(password.equals(temp.getPassword())) {
					existe = true;
					dtu= temp ;
					System.out.println("ingreso usuario");
				}				
			}
	    }
		return dtu;
	}
}
