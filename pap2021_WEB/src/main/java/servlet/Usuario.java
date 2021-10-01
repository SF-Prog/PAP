package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datatypes.DtEspectaculo;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorConsultaDeUsuario;
import logica.Espectaculo;

/**
 * Servlet implementation class Usuario
 */
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuario() {
        super();
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
		/*doGet(request, response);*/
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorConsultaDeUsuario iccdu = fabrica.getIControladorConsultaDeUsuario();
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

		}else if(this.esAltaUsuarioArtista (request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA			

		}else if(this.esAltaUsuarioEspectador(request) ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA			

		}
		

		
	}

	private boolean esInicioSesion (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("email") && request.getParameterMap().containsKey("password") ){
			// SE ESTA CONSULTANDO DESDE EL INICIO DE SESION			
			return true;
		}
		return false;
	}
	
	private boolean esAltaUsuarioArtista (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("nicknameU") &&
		   request.getParameterMap().containsKey("emailU") &&
		   request.getParameterMap().containsKey("nombreU") &&
		   request.getParameterMap().containsKey("apellidoU") &&
		   request.getParameterMap().containsKey("TipoUsuario") &&
		   request.getParameterMap().containsKey("descripcionGeneralU") &&
		   request.getParameterMap().containsKey("linkU") &&
		   request.getParameterMap().containsKey("biografiaU") ){
			// SE ESTA CONSULTANDO DESDE EL ALTA USUARIO ARTISTA		
			return true;
		}
		return false;
	}
	
	private boolean esAltaUsuarioEspectador (HttpServletRequest request) {
		if(request.getParameterMap().containsKey("nicknameU") &&
		   request.getParameterMap().containsKey("emailU") &&
		   request.getParameterMap().containsKey("nombreU") &&
		   request.getParameterMap().containsKey("apellidoU") &&
		   request.getParameterMap().containsKey("TipoUsuario") ){
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
