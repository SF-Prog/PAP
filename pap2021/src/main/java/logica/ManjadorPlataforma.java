package logica;

import java.util.ArrayList;
import java.util.List;

public class ManjadorPlataforma {
	private static ManjadorPlataforma instancia = null; 
	private List<Plataforma> plataformas = new ArrayList<>();
	private ManjadorPlataforma(){}
	
	public static ManjadorPlataforma getInstancia() {
		if(instancia == null){
			instancia = new ManjadorPlataforma();
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
