package logica.manejadores;

import persistencia.Conexion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import logica.Registro;

public class ManejadorRegistro {
	private static ManejadorRegistro instancia = null;
	
	private ManejadorRegistro(){}
	
	public static ManejadorRegistro getInstancia() {
		if(instancia == null){
			instancia = new ManejadorRegistro();
		}
		return instancia;
	}

	public List<Registro> getRegistros() {
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();	
		Query query = em.createQuery("select r from Registro r");
		return (List<Registro>)query.getResultList();
	}
}