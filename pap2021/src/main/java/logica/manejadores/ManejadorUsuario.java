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
	//private List<Usuario> usuarios = new ArrayList<>();
	
	private ManejadorUsuario(){}
	
	public static ManejadorUsuario getInstancia() {
		if(instancia == null){
			instancia = new ManejadorUsuario();
		}
		return instancia;
	}	
	
	public List<Usuario> getUsuarios() {

		//return usuarios;
		
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
	
		Query query = em.createQuery("select u from Usuario u");
		
		List<Usuario> listUsuario = (List<Usuario>) query.getResultList();
		
		return listUsuario;
	}/*
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
		
	}
	*/
	public void agegarUsuarios(Usuario usuario) {
		///this.usuarios.add(usuario);+
		
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		//comint(s1)
	}

	public List<String> getArtistas() {
		/*List<String> res = new ArrayList<>();
		for(Usuario u: usuarios) {
			if (u instanceof Artista){
				res.add(u.getNickName());
			}
		}		
		return res;*/
		
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
	
		Query query = em.createQuery("select a from Artista a");
		
		List<Artista> listArtista = (List<Artista>) query.getResultList();
		
		List<String> res = new ArrayList<>();
		for(Artista u: listArtista) {
			if (u instanceof Artista){
				res.add(u.getNickName());
			}
		}		
		return res;
	}
	
	public Usuario buscarUsuarioPorNickname(String nickname) {
		/*Iterator<Usuario> usuariosIterator = this.usuarios.iterator(); 
		Usuario res = null;
		while(res == null && usuariosIterator.hasNext()){
			Usuario temp = usuariosIterator.next();
			if(temp.getNickName().equals(nickname)){
				res = temp;
			}
		}		
		return res;*/
		
		
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
		
		Usuario usuario = em.find(Usuario.class, nickname);
		return usuario;
		
	}
	
	public Usuario buscarUsuarioPorEmail(String email) {		
		/*Iterator<Usuario> usuariosIterator = this.usuarios.iterator();  
		Usuario res = null;
		while(res == null && usuariosIterator.hasNext()){
			Usuario temp = usuariosIterator.next();
			if(temp.getEmail().equals(email)){
				res = temp;
			}
		}		
		return res;*/
		
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
