package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;

public class ControladorAltaDeFuncionDeEspectaculo implements IControladorAltaDeFuncionDeEspectaculo{
	private Plataforma plataforma;
	private Espectaculo espectaculo;
	// private Espectaculo artistasIngresadosEnElSistema;
	public ControladorAltaDeFuncionDeEspectaculo() {
		super();
	}
	@Override
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		List<Espectaculo> coleccionEspectaculos = null;
		// Inicializa la lista en vacio para poder aplicarle el add
		List<DtEspectaculo> coleccionDtEspectaculos = new ArrayList<DtEspectaculo>();
		List<Plataforma> coleccionPlataformas = mP.getPlataformas();
		for(Plataforma plataforma : coleccionPlataformas) {
			if(nombrePlataforma.equals(plataforma.getNombre())) {
				coleccionEspectaculos = plataforma.getEspectaculos();
				this.plataforma = plataforma;
			};
		};
		for(Espectaculo espectaculo : coleccionEspectaculos) {
			DtEspectaculo dte = new DtEspectaculo(espectaculo.getNombre(), espectaculo.getDescripcion(), espectaculo.getDuracion(), espectaculo.getEspectadoresMin(), espectaculo.getEspectadoresMax(), espectaculo.getUrlAsociada(), espectaculo.getCosto(), espectaculo.getFechaRegistro());
			coleccionDtEspectaculos.add(dte);
		};
		return coleccionDtEspectaculos;
	};

	@Override
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo) {
		List<Espectaculo> coleccionEspectaculos = this.plataforma.getEspectaculos();
		Espectaculo espectaculoSeleccionado = null;
		for(Espectaculo espectaculo : coleccionEspectaculos) {
			if(espectaculo.getNombre().equals(nombreEspectaculo)){
				espectaculoSeleccionado = espectaculo;
				this.espectaculo = espectaculo;
			}
		};
		return espectaculoSeleccionado;
	};

	@Override
	public boolean existeFuncion(String nombreFuncion) {
		boolean existeFuncionEnElEspectaculo = false;
		List<Funcion> funcionesDelEspectaculo = this.espectaculo.getFunciones();
		for(Funcion funcion : funcionesDelEspectaculo){
			if(funcion.getNombre().equals(nombreFuncion)){
				existeFuncionEnElEspectaculo = true;
			}
		};
		return existeFuncionEnElEspectaculo;
	};

	@Override
	public void ingresaFuncion(DtFuncion dtFuncion, List<DtArtista> artistasInvitados) {
			Funcion nuevaFuncion = new Funcion(dtFuncion.getNombre(), dtFuncion.getFecha(), dtFuncion.getHoraInicio(), dtFuncion.getFechaRegistro());
			this.espectaculo.addFuncion(nuevaFuncion);
			// itera entre la lista de artistas y linkea a acada uno con la nueva
			for(DtArtista dta: artistasInvitados){
				ManjadorUsuario mU = ManjadorUsuario.getInstancia();
				Usuario usuarioArtista = mU.buscarUsuarioPorNickname(dta.getNickName());
				((Artista) usuarioArtista).agregarFuncion(nuevaFuncion);
			};
		};
	@Override
	public List<DtArtista> listarArtistas() {
		ManjadorUsuario mU = ManjadorUsuario.getInstancia();
		// Inicializa la lista en vacio para poder aplicarle el add
		List<DtArtista> artistasEnElSistema = new ArrayList<DtArtista>();
		List<Usuario> coleccionUsuarios = mU.getUsuarios();
		for(Usuario usuario : coleccionUsuarios) {
			if(usuario instanceof Artista) {
				DtArtista dta = new DtArtista(((Artista) usuario).getNickName(), ((Artista) usuario).getNombre(), ((Artista) usuario).getApellido(), ((Artista) usuario).getEmail(), ((Artista) usuario).getFechaNac(), ((Artista) usuario).getDescGeneral(), ((Artista) usuario).getBiografia(), ((Artista) usuario).getLink());
				artistasEnElSistema.add(dta);
			};
		};
		return artistasEnElSistema;
	};
}
