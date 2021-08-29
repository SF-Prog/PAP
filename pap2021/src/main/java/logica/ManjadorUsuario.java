package logica;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public boolean buscarNickname(String nickname) {
		Iterator<Usuario> usuariosIterator = this.usuarios.iterator();  
		boolean existe = false;
		while(usuariosIterator.hasNext() && !existe){
			if(usuariosIterator.next().getNickName().equals(nickname)){
				existe = true;
			}
		}
		
		return existe;
	}
	
	public boolean buscarEmail(String email) {
		
		Iterator<Usuario> usuariosIterator = this.usuarios.iterator();  
		boolean existe = false;
		while(usuariosIterator.hasNext() && !existe){
			if(usuariosIterator.next().getEmail().equals(email)){
				existe = true;
			}
		}
		
		return existe;
	}
	
}
