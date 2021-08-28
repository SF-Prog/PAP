package logica;

import java.util.ArrayList;
import java.util.List;

public class ManjadorUsuario {
	private static ManjadorUsuario instancia = null; 
	private List<Usuario> usuarios = new ArrayList<>();
	private ManjadorUsuario(){}
	
	public static ManjadorUsuario getInstancia() {
		if(instancia == null){
			instancia = new ManjadorUsuario();
		}
		return instancia;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void agegarUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
}
