package logica.manejadores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtArtista;
import logica.Artista;
import logica.Usuario;

public class ManejadorUsuario {
	private static ManejadorUsuario instancia = null; 
	private List<Usuario> usuarios = new ArrayList<>();
	
	private ManejadorUsuario(){}
	
	public static ManejadorUsuario getInstancia() {
		if(instancia == null){
			instancia = new ManejadorUsuario();
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

	public List<String> getArtistas() {
		List<String> res = new ArrayList<>();
		for(Usuario u: usuarios) {
			if (u instanceof Artista){
				res.add(u.getNickName());
			}
		}		
		return res;
	}
	
	public Usuario buscarUsuarioPorNickname(String nickname) {
		Iterator<Usuario> usuariosIterator = this.usuarios.iterator(); 
		Usuario res = null;
		while(usuariosIterator.hasNext() && res != null){
			if(usuariosIterator.next().getNickName().equals(nickname)){
				res = usuariosIterator.next();
			}
		}		
		return res;
	}
	
	public Usuario buscarUsuarioPorEmail(String email) {		
		Iterator<Usuario> usuariosIterator = this.usuarios.iterator();  
		Usuario res = null;
		while(usuariosIterator.hasNext() && res != null){
			if(usuariosIterator.next().getEmail().equals(email)){
				res = usuariosIterator.next();
			}
		}		
		return res;
	}
}
