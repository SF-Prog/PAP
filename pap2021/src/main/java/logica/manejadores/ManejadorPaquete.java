package logica.manejadores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import logica.Paquete;
import persistencia.Conexion;

public class ManejadorPaquete {
	private static ManejadorPaquete instancia = null;
	
	private ManejadorPaquete(){}
	
	public static ManejadorPaquete getInstancia() {
		if(instancia == null){
			instancia = new ManejadorPaquete();
			
		}
		return instancia;
	}

	@SuppressWarnings("unchecked")
	public List<Paquete> getPaquetes() {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();	
		Query query = em.createQuery("select p from Paquete p");		
		return (List<Paquete>)query.getResultList();
	}
}
