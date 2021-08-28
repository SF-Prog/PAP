package logica;

import java.util.ArrayList;
import java.util.List;

public class ManejadorPlataforma {
	private static ManejadorPlataforma instancia = null; 
	private List<Plataforma> plataformas = new ArrayList<>();
	private ManejadorPlataforma(){}
	
	public static ManejadorPlataforma getInstancia() {
		if(instancia == null){
			instancia = new ManejadorPlataforma();
		}
		return instancia;
	}

	public List<Plataforma> getPlataformas() {
		return plataformas;
	}
	public void setPlataformas(List<Plataforma> plataformas) {
		this.plataformas = plataformas;
	};
	
}
