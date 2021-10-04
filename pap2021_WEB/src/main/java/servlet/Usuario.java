package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import datatypes.DtEspectaculo;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeUsuario;
import logica.Espectaculo;

/**
 * Servlet implementation class Usuario
 */
@MultipartConfig
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fabrica fabrica;
	IControladorConsultaDeUsuario iccdu;
	IControladorAltaDeUsuario icadu;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
        fabrica =  Fabrica.getInstancia();
		iccdu = fabrica.getIControladorConsultaDeUsuario();
		icadu = fabrica.getIControladorAltaDeUsuario();
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
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			if(email !=""  && password != "") {
				ArrayList<logica.Usuario> usuarios = iccdu.listarUsuarios();
				logica.Usuario usuario = this.iniciarSesionUsuario(usuarios,email,password);
				if(usuario != null) {
					 HttpSession session = request.getSession();
					 session.setAttribute("uNickName", usuario.getNickName());
					 session.setAttribute("uEmail", usuario.getEmail());
					 session.setAttribute("uApellido", usuario.getApellido());
					 session.setAttribute("uNombre", usuario.getNombre());
					 request.setAttribute("mensaje", "Bienvenido "+usuario.getNickName());
					 rd=request.getRequestDispatcher("index.jsp");
					 rd.forward(request, response);
				}else{
					request.setAttribute("mensaje", "Email y/o contraseña incorrecta");
					rd=request.getRequestDispatcher("inicioSesion.jsp");
					rd.forward(request, response);
				}
				
				
			}else{
				request.setAttribute("mensaje", "Debe ingresar email y contraseña");
				rd=request.getRequestDispatcher("inicioSesion.jsp");
				rd.forward(request, response);
			}

		}else if(this.esAltaUsuarioArtista(request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA	
			System.out.println("entro Artista");
			String nickName =request.getParameter("nicknameU");
			String email =request.getParameter("emailU");
			String nombre =  request.getParameter("nombreU");
			String apellido = request.getParameter("apellidoU");
			
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
			String parameter = request.getParameter("fecchaU");
			Date fecha = null ;
			try {
				fecha = in.parse(parameter);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String descripcionGeneral =request.getParameter("descripcionGeneralU");
			String link = request.getParameter("linkU");
			String biografia = request.getParameter("biografiaU");
			
			icadu.ingresaUsuarioArtista(new DtUsuario(nickName, nombre,  apellido,  email,  fecha), descripcionGeneral, biografia, link);
			System.out.println("entro Artista");
		}else if(this.esAltaUsuarioEspectador(request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ESPECTADOR
			String nickName =request.getParameter("nicknameU");
			String email =request.getParameter("emailU");
			String nombre =  request.getParameter("nombreU");
			String apellido = request.getParameter("apellidoU");
			
			SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
			String parameter = request.getParameter("fecchaU");
			Date fecha = null ;
			try {
				fecha = in.parse(parameter);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DtUsuario dt=new DtUsuario(nickName, nombre,  apellido,  email,  fecha);
			icadu.ingresaUsuarioEspectador( dt);
			System.out.println( dt);
			System.out.println("entro espectador");
			//PrintWriter out = response.getWriter( dt);
		}else if(this.esCerrarSesion(request)){
			HttpSession session = request.getSession();
		    session.invalidate();
			rd=request.getRequestDispatcher("inicioSesion.jsp");
			rd.forward(request, response);
		}
		

		
	}

	private boolean esInicioSesion (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("email") && request.getParameterMap().containsKey("password") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean esCerrarSesion (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("close") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION	
			System.out.println("cerro sesion");
			return true;
		}
		return false;
	}
	
	
	private boolean esAltaUsuarioArtista (HttpServletRequest request) {

		/*if(request.getParameterMap().containsKey("nicknameU") &&
				   request.getParameterMap().containsKey("emailU") &&
				   request.getParameterMap().containsKey("nombreU") &&
				   request.getParameterMap().containsKey("apellidoU") &&
				   request.getParameterMap().containsKey("TipoUsuario") &&
				   request.getParameterMap().containsKey("descripcionGeneralU") &&
				   request.getParameterMap().containsKey("linkU") &&
				   request.getParameterMap().containsKey("biografiaU") ){*/
		System.out.println(request.getParameter("TipoUsuario").equals("Artista"));
		
		if( request.getParameterMap().containsKey("TipoUsuario") && request.getParameter("TipoUsuario").equals("Artista") ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA		
			return true;
		}
		return false;
	}
	
	private boolean esAltaUsuarioEspectador (HttpServletRequest request) {
		/*if(request.getParameterMap().containsKey("nicknameU") &&
				   request.getParameterMap().containsKey("emailU") &&
				   request.getParameterMap().containsKey("nombreU") &&
				   request.getParameterMap().containsKey("apellidoU") &&
				   request.getParameterMap().containsKey("TipoUsuario") ){*/
		System.out.println(request.getParameter("TipoUsuario").equals("Espectador"));
		if(request.getParameterMap().containsKey("TipoUsuario") && request.getParameter("TipoUsuario").equals("Espectador")){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ESPECTADOR		
			return true;
		}
		return false;
	}
	

	private logica.Usuario iniciarSesionUsuario (ArrayList<logica.Usuario> usuarios,String email ,String password){
		logica.Usuario dtu = null;
		if(email.equals("admin@admin.com") && password.equals("1234")) {
			Date fecha = new Date();
			dtu = new logica.Usuario ("admin","admin","admin","admin@admin.com",fecha);
			System.out.println("ingreso admin");
		}else{
			
		
			Iterator<logica.Usuario> eIterator = usuarios.iterator(); 
			
			boolean existe = false;
			while(eIterator.hasNext() && !existe){
				logica.Usuario temp = eIterator.next();
				if(temp.getEmail().equals(email)){
					if(password.equals(temp.getNombre()+"."+temp.getApellido())) {
						existe = true;
						dtu=temp;
						System.out.println("ingreso usuario");
					}
					
				}
			}
		}
		return dtu ;
	}
}
