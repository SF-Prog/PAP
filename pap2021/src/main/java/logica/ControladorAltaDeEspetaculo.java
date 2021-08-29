package logica;

import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtUsuario;
import interfaces.IControladorAltaDeEspetaculo;

public class ControladorAltaDeEspetaculo implements IControladorAltaDeEspetaculo {
	
	public ControladorAltaDeEspetaculo() {
		super();
	}
	
	@Override
	public boolean existeEspectaculo(String plataforma, String espectaculo) {
		boolean existeEspectaculo = false;
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma p = mP.getPlataforma(plataforma);
		List<Espectaculo> coleccionEspectaculos = p.getEspectaculos();
		for(Espectaculo e : coleccionEspectaculos) {
			if(espectaculo.equals(e.getNombre())) {
				existeEspectaculo = true;
			};
		};
		return existeEspectaculo;		
	}

	@Override
	public void ingresaEspectaculo(String plataforma, DtArtista artista, DtEspectaculo dtE) {
		Espectaculo nuevoEspectaculo = new Espectaculo(dtE.getNombre(), dtE.getDescripcion(), dtE.getDuracion(), dtE.getEspectadoresMin(), 
				dtE.getEspectadoresMax(), dtE.getUrlAsociada(), dtE.getCosto(), dtE.getFechaRegistro());
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma p = mP.getPlataforma(plataforma);
		List<Espectaculo> coleccionEspectaculos = p.getEspectaculos();
		coleccionEspectaculos.add(nuevoEspectaculo);
		
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		Usuario u = mU.buscarUsuarioPorNickname(artista.getNombre());
		coleccionEspectaculos = ((Artista)u).getEspectaculos();
		coleccionEspectaculos.add(nuevoEspectaculo);
	}
	
	@Override
	public DtUsuario buscarUsuarioPorNickname(String nickname) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarUsuarioPorNickname(nickname).getDtUsuario();
	}
	
	@Override
	public DtUsuario buscarUsuarioPorEmail(String email) {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		return mU.buscarUsuarioPorEmail(email).getDtUsuario();
	}
}
