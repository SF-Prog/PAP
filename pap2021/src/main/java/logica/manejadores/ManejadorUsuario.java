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
	
	@SuppressWarnings("unchecked")
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
	
	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("unchecked")
	public List<String> getArtistasInvitadosEnFuncion(String funcion) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		Query query = em.createNativeQuery("SELECT a.artista_nickname FROM usuario_funcion a WHERE a.funciones_nombre=:funcion");
	    query.setParameter("funcion", funcion);
	    try {
			return (List<String>)query.getResultList();	
        }
	    catch (Exception e) { 
			return null;
	    }
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

	public void seguirUsuario(Usuario seguidor, Usuario seguido) throws Exception {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		seguido.seguir(seguidor);
        try {
        	em.getTransaction().begin();
        	em.persist(seguido);
        	em.getTransaction().commit();
        } catch (Exception exc) {
        	if ((exc instanceof RollbackException) && (em.getTransaction().isActive())) {
	            em.getTransaction().rollback();
	            em.close();
	        }
        	throw new Exception("ERROR!");
        }
	}
	
	public void dejarSeguirUsuario(Usuario seguidor, Usuario seguido) throws Exception {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		seguido.dejarDeSeguir(seguidor);
        try {
        	em.getTransaction().begin();
        	em.persist(seguido);
        	em.getTransaction().commit();
        } catch (Exception exc) {
        	if ((exc instanceof RollbackException) && (em.getTransaction().isActive())) {
	            em.getTransaction().rollback();
	            em.close();
	        }
        	throw new Exception("ERROR!");
        }
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getUsuariosSeguidos(String seguidor) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		Query query = em.createNativeQuery("SELECT u.seguidos_nickname FROM usuario_usuario u WHERE u.seguidores_nickname=:seguidor");
	    query.setParameter("seguidor", seguidor);
	    try {
			return (List<String>)query.getResultList();	
        }
	    catch (Exception e) { 
			return null;
	    }
	}
}
