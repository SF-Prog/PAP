package logica.controladores;

import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtUsuario;
import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;
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
	public String[] listarPlataformas() {
		List<Plataforma> plataformas;
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		plataformas = mP.getPlataformas();
		String[] res = new String[plataformas.size()];
        int i=0;
        for(Plataforma p:plataformas) {
        	res[i]=p.getNombre();
        	i++;
        }
        return res;
	}

	@Override
	public String[] listarArtistas() {
		List<String> artistas;
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		artistas = mU.getArtistas();
		String[] res = new String[artistas.size()];
        int i=0;
        for(String a:artistas) {
        	res[i]=a;
        	i++;
        }
        return res;
	}
	
	@Override
	public boolean existeEspectaculo(String plataforma, String espectaculo) {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma p = mP.getPlataforma(plataforma);
		List<Espectaculo> coleccionEspectaculos = p.getEspectaculos();
		for(Espectaculo e : coleccionEspectaculos) {
			if(espectaculo.equals(e.getNombre())) {
				return true;
			};
		};
		return false;		
	}

	@Override
	public void ingresaEspectaculo(String plataforma, String artista, DtEspectaculo dtE) throws AltaEspectaculoExcepcion {
		String espectaculo = dtE.getNombre();
		if (existeEspectaculo(plataforma, espectaculo))
			throw new AltaEspectaculoExcepcion("El espectaculo " + espectaculo + " ya se encuentra en la plataforma " + plataforma);
		
		Espectaculo nuevoEspectaculo = new Espectaculo(espectaculo, dtE.getDescripcion(), dtE.getDuracion(), dtE.getEspectadoresMin(), 
				dtE.getEspectadoresMax(), dtE.getUrlAsociada(), dtE.getCosto(), dtE.getFechaRegistro());

		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma p = mP.getPlataforma(plataforma);
		List<Espectaculo> coleccionEspectaculos = p.getEspectaculos();
		coleccionEspectaculos.add(nuevoEspectaculo);
		
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		Usuario u = mU.buscarUsuarioPorNickname(artista);
		coleccionEspectaculos = ((Artista)u).getEspectaculos();
		coleccionEspectaculos.add(nuevoEspectaculo);
	}
}
