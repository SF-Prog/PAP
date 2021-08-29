package logica.controladores;

import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtUsuario;
import interfaces.IControladorAltaDeEspectaculo;
import logica.Artista;
import logica.Espectaculo;
import logica.Plataforma;
import logica.Usuario;
import logica.manejadores.ManejadorPlataforma;
import logica.manejadores.ManejadorUsuario;

public class ControladorAltaDeEspectaculo implements IControladorAltaDeEspectaculo {	
	public ControladorAltaDeEspectaculo() {
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
		
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Usuario u = mU.buscarUsuarioPorNickname(artista.getNombre());
		coleccionEspectaculos = ((Artista)u).getEspectaculos();
		coleccionEspectaculos.add(nuevoEspectaculo);
	}
	
	@Override
	public DtUsuario buscarUsuarioPorNickname(String nickname) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorNickname(nickname).getDtUsuario();
	}
	
	@Override
	public DtUsuario buscarUsuarioPorEmail(String email) {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		return mU.buscarUsuarioPorEmail(email).getDtUsuario();
	}
}
