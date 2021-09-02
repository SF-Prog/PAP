package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Conexion {
	private static Conexion instancia = null;
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	private Conexion(){}
	
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
			emf = Persistence.createEntityManagerFactory("pap2021");
			em=emf.createEntityManager();
		}
		return instancia;
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}
	
	public void close() {
		this.em.close();
		this.emf.close();
	}


}
