package logica.manejadores;
import persistencia.Conexion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import logica.Registro;
import logica.Usuario;
import persistencia.Conexion;

public class ManejadorRegistro {
	private static ManejadorRegistro instancia = null; 
	//private List<Registro> registros = new ArrayList<>();
	
	private ManejadorRegistro(){}
	
	public static ManejadorRegistro getInstancia() {
		if(instancia == null){
			instancia = new ManejadorRegistro();
		}
		return instancia;
	}

	public List<Registro> getRegistros() {
		//return registros;
		Conexion conexion = Conexion.getInstancia();
		EntityManager em = conexion.getEntityManager();
	
		Query query = em.createQuery("select r from Registro r");
		
		List<Registro> registros = (List<Registro>) query.getResultList();
		
		return registros;

	}
	
	/*public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}*/
}