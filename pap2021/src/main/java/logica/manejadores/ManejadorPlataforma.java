package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import logica.Plataforma;

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
		return this.plataformas;
	}
	
	public Plataforma getPlataforma(String nombrePlataforma) {
		Plataforma plataforma = null;
		for(Plataforma p : this.plataformas){
			if(p.getNombre().equals(nombrePlataforma)){
				plataforma = p;
			}
		}
		return plataforma;
	};

	public void setPlataformas(List<Plataforma> plataformas) {
		this.plataformas = plataformas;
	};
	
	public void addPlataforma(Plataforma plataforma) {
		this.plataformas.add(plataforma);
	}
}
