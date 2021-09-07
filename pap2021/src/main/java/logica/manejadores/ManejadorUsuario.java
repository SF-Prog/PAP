package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	

}
