package logica;

import java.util.ArrayList;
import java.util.List;

public class ManjadorRegistro {
	private static ManjadorRegistro instancia = null; 
	private List<Registro> registros = new ArrayList<>();
	private ManjadorRegistro(){}
	
	public static ManjadorRegistro getInstancia() {
		if(instancia == null){
			instancia = new ManjadorRegistro();
		}
		return instancia;
	}

	public List<Registro> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
}
