package logica.controladores;

import java.util.ArrayList;
import java.util.List;

import datatypes.DtUsuario;
import interfaces.IControladorAltaDeUsuario;
import logica.Artista;
import logica.Espectador;
import logica.Usuario;
import logica.manejadores.ManejadorUsuario;

public class ControladorAltaDeUsuario implements IControladorAltaDeUsuario {	
	public ControladorAltaDeUsuario() {
		super();
	}
	
	@Override
	public void ingresaUsuarioEspectador(DtUsuario dtUsuario) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Espectador nuevoEspectador = new Espectador(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac(),dtUsuario.getPassword(),dtUsuario.getImage());
		mU.agegarUsuarios(nuevoEspectador);
	}

	@Override
	public void ingresaUsuarioArtista(DtUsuario dtUsuario, String descripcion, String biografia, String link) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Artista nuevoArtista = new Artista(dtUsuario.getNickName(),dtUsuario.getNombre(),dtUsuario.getApellido(),dtUsuario.getEmail(),dtUsuario.getFechaNac(),dtUsuario.getPassword(),dtUsuario.getImage(),descripcion,biografia,link);
		mU.agegarUsuarios(nuevoArtista);
	}
	
	@Override
	public boolean existeUsuarioPorNickname(String nickname) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorNickname(nickname) != null;
	}
	
	@Override
	public boolean existeUsuarioPorEmail(String email) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorEmail(email) != null;
	}
	
	@Override
	public void seguirUsuario(String seguidor, String seguido) throws Exception {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();		
	    Usuario uSeguidor = mU.buscarUsuarioPorNickname(seguidor);
	    if (uSeguidor == null) {
	      	throw new Exception("No existe el usuario " + seguidor);
	    } else {
	    	Usuario uSeguido = mU.buscarUsuarioPorNickname(seguido);
	    	if (uSeguido == null) {
	    		throw new Exception("No existe el usuario " + seguido);
	    	} else if (checkSeguidor(uSeguidor.getNickName(), seguido)) {
	    		throw new Exception("El usuario " + seguidor + " ya sigue a " + seguido);
	    	} else {	    		
	    		mU.seguirUsuario(uSeguidor, uSeguido);
	    	}
	    }
	}

	@Override
	public void dejarSeguirUsuario(String seguidor, String seguido) throws Exception {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();		
	    Usuario uSeguidor = mU.buscarUsuarioPorNickname(seguidor);
	    if (uSeguidor == null) {
	      	throw new Exception("No existe el usuario " + seguidor);
	    } else {
	    	Usuario uSeguido = mU.buscarUsuarioPorNickname(seguido);
	    	if (uSeguido == null) {
	    		throw new Exception("No existe el usuario " + seguido);
	    	} else if (!checkSeguidor(uSeguidor.getNickName(), seguido)) {
	    		throw new Exception("El usuario " + seguidor + " no sigue a " + seguido);
	    	} else {	    		
	    		mU.dejarSeguirUsuario(uSeguidor, uSeguido);
	    	}
	    }
	}

	@Override
	public String[] usuariosSeguidos(String seguidor)  {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		ArrayList<String> resultado = new ArrayList<String>();
		ArrayList<Usuario> usuarios = mU.getUsuarios();
		for(Usuario u: usuarios) {
			String nickname = u.getNickName();
			if(!nickname.equals(seguidor)) {
				if(checkSeguidor(seguidor, nickname)) {
					resultado.add(nickname);
				}
			}
		}
		String[] usuarios_ret = new String[resultado.size()];
		int i = 0;
		for(String u: resultado) {
			usuarios_ret[i] = u;
			i++;
		}
		return usuarios_ret;
	}

	@Override
	public boolean checkSeguidor(String nicknameSeguidor, String nicknameSeguido) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		List<String> seguidos = mU.getUsuariosSeguidos(nicknameSeguidor);
		if(seguidos != null) {
			for(String usu: seguidos) {
				if(nicknameSeguido.equals(usu)){
					return true;
				}
			}
		}
		return false;
	}
}
