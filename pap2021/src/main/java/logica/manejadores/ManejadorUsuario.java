package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import logica.Artista;
import logica.Usuario;

import persistencia.Conexion;

public class ManejadorUsuario {
	private static ManejadorUsuario instancia = null; 
	
	private ManejadorUsuario(){}
	
	public static ManejadorUsuario getInstancia() {
		if(instancia == null){
			instancia = new ManejadorUsuario();
		}
		return instancia;
	}	
	
	public ArrayList<Usuario> getUsuarios() {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		Query query = em.createQuery("select u from Usuario u");
		return (ArrayList<Usuario>)query.getResultList();
	}
  
	public void agegarUsuarios(Usuario usuario) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}

	public List<String> getArtistas() {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		Query query = em.createQuery("select a from Artista a");		
		List<Artista> listArtista = (List<Artista>)query.getResultList();	
		
		List<String> res = new ArrayList<>();
		for(Artista u: listArtista) {
			if (u instanceof Artista){
				res.add(u.getNickName());
			}
		}		
		return res;
	}
	
	public Usuario buscarUsuarioPorNickname(String nickname) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();		
		Usuario usuario = em.find(Usuario.class, nickname);
		return usuario;		
	}
	
	public Usuario buscarUsuarioPorEmail(String email) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();		
		Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.email=:email");
	    query.setParameter("email", email);
	    try {
	        return (Usuario)query.getSingleResult();
        }
	    catch (Exception e) { 
			return null;
	    }
	}

	public void seguirUsuario(String seguidor, String seguido) throws Exception {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
	    Usuario uSeguidor = em.find(Usuario.class, seguidor);
	    if (uSeguidor == null) {
	      em.close();
	      throw new Exception("No existe el usuario " + seguidor);
	    } else {
	      Usuario uSeguido = em.find(Usuario.class, seguido);
	      if (uSeguido == null) {
	    	  em.close();
	    	  throw new Exception("No existe el usuario " + seguido);
	      } else {
	        uSeguido.seguir(uSeguidor);
	        try {
	          em.getTransaction().begin();
	          em.persist(uSeguido);
	          //em.persist(uSeguidor);
	          em.getTransaction().commit();
	        } catch (Exception exc) {
	          if ((exc instanceof RollbackException) && (em.getTransaction().isActive())) {
	            em.getTransaction().rollback();
	            em.close();
	          }
	          throw new Exception("ERROR!");
	        } //finally {
	          //em.close();
	        //}
	      }
	   }
	}
	
	public void dejarSeguirUsuario(String seguidor, String seguido) throws Exception {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
	    Usuario uSeguidor = em.find(Usuario.class, seguidor);
	    if (uSeguidor == null) {
	      em.close();
	      throw new Exception("No existe el usuario " + seguidor);
	    } else {
	      Usuario uSeguido = em.find(Usuario.class, seguido);
	      if (uSeguido == null) {
	        em.close();
	        throw new Exception("No existe el usuario " + seguido);
	      } else {
	        uSeguido.dejarDeSeguir(uSeguidor);
	        try {
	          em.getTransaction().begin();
	          em.persist(uSeguido);
	          //em.persist(uSeguidor);
	          em.getTransaction().commit();
	        } catch (Exception exc) {
	          if ((exc instanceof RollbackException) && (em.getTransaction().isActive())) {
	            em.getTransaction().rollback();
	            em.close();
	          }
	          throw new Exception("ERROR!");
	        } //finally {
	          //em.close();
	        //}
	      }
	   }
	}
	
	public String[] usuariosSeguidos(String seguidor)  {
		ArrayList<String> resultado = new ArrayList<String>();
		ArrayList<Usuario> usuarios = getUsuarios();
		for(Usuario u: usuarios) {
			String nickname = u.getNickName();
			if(!nickname.equals(seguidor)) {
				if(checkSeguidor(seguidor, nickname)) {
					resultado.add(nickname);
				}
			}
		}
		String[] usuarios_ret = new String[resultado.size()];
		int i = 0;
		for(String u: resultado) {
			usuarios_ret[i] = u;
			i++;
		}
		return usuarios_ret;
	}

	public boolean checkSeguidor(String nicknameSeguidor, String nicknameSeguido) {
		ManejadorUsuario mu = ManejadorUsuario.getInstancia();
		Usuario u = mu.buscarUsuarioPorNickname(nicknameSeguidor);
		List<Usuario> seguidos = u.getUsuariosSeguidos();
		System.out.println(seguidos);
		if(seguidos != null) {
			for(Usuario usu: seguidos) {
				if(nicknameSeguido.equals(usu.getNickName())){
					return true;
				}
			}
		}
		return false;
	}
}
