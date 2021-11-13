package logica.manejadores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import logica.Plataforma;
import persistencia.Conexion;

public class ManejadorPlataforma {
	private static ManejadorPlataforma instancia = null; 
	
	private ManejadorPlataforma(){}
	
	public static ManejadorPlataforma getInstancia() {
		if(instancia == null){
			instancia = new ManejadorPlataforma();
		}
		return instancia;
	}

	@SuppressWarnings("unchecked")
	public List<Plataforma> getPlataformas() {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();	
		Query query = em.createQuery("select p from Plataforma p");		
		return (List<Plataforma>)query.getResultList();
	}
	
	public Plataforma getPlataforma(String plataforma) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();		
		return em.find(Plataforma.class, plataforma);
	}
	
	public void addPlataforma(Plataforma plataforma) {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();		
		em.getTransaction().begin();
		em.persist(plataforma);
		em.getTransaction().commit();
	}
}
