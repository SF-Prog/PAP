package logica.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import logica.Artista;
import logica.Espectaculo;
import logica.Funcion;
import logica.Plataforma;
import logica.Usuario;
import logica.manejadores.ManejadorPlataforma;
import logica.manejadores.ManejadorUsuario;
import persistencia.Conexion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;


public class ControladorAltaDeFuncionDeEspectaculo implements IControladorAltaDeFuncionDeEspectaculo{
	private Plataforma plataformaSeleccionada;
	private Espectaculo espectaculoSeleccionado;
	private List<String> artistasIngresadosEnFuncion = new ArrayList<String>();
	private List<String> artistasIngresadosEnSistema = new ArrayList<String>();
	
	public ControladorAltaDeFuncionDeEspectaculo() {
		super();
	}
	
	@Override
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma) {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		List<Espectaculo> coleccionEspectaculos = null;
		List<DtEspectaculo> coleccionDtEspectaculos = new ArrayList<DtEspectaculo>();
		List<Plataforma> coleccionPlataformas = mP.getPlataformas();
		for(Plataforma plataforma : coleccionPlataformas) {
			if(nombrePlataforma.equals(plataforma.getNombre())) {
				coleccionEspectaculos = plataforma.getEspectaculos();
				this.plataformaSeleccionada = plataforma;
			};
		};
		if (coleccionEspectaculos != null) {
			for(Espectaculo espectaculo : coleccionEspectaculos) {
				DtEspectaculo dte = new DtEspectaculo(espectaculo.getNombre(), espectaculo.getDescripcion(), espectaculo.getDuracion(), espectaculo.getEspectadoresMin(), espectaculo.getEspectadoresMax(), espectaculo.getUrlAsociada(), espectaculo.getCosto(), espectaculo.getFechaRegistro(), espectaculo.getImage());
				coleccionDtEspectaculos.add(dte);
			};
		}
		return coleccionDtEspectaculos;
	};

	@Override
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo) {
		List<Espectaculo> coleccionEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		Espectaculo espectaculoSeleccionado = null;
		for(Espectaculo espectaculo : coleccionEspectaculos) {
			if(espectaculo.getNombre().equals(nombreEspectaculo)){
				espectaculoSeleccionado = espectaculo;
				this.espectaculoSeleccionado = espectaculo;
			}
		};
		return espectaculoSeleccionado;
	};

	@Override
	public boolean existeFuncion(String nombreFuncion) {
		boolean existeFuncionEnElEspectaculo = false;
		List<Funcion> funcionesDelEspectaculo = this.espectaculoSeleccionado.getFunciones();
		for(Funcion funcion : funcionesDelEspectaculo){
			if(funcion.getNombre().equals(nombreFuncion)){
				existeFuncionEnElEspectaculo = true;
			}
		};
		return existeFuncionEnElEspectaculo;
	};

	@Override
	public void ingresaFuncion(DtFuncion dtFuncion, List<String> artistasInvitados) throws AltaFuncionDeEspectaculoExcepcion {
		Funcion nuevaFuncion = new Funcion(dtFuncion.getNombre(), dtFuncion.getFecha(), dtFuncion.getHoraInicio(), dtFuncion.getFechaRegistro(), dtFuncion.getImage());
		Espectaculo espectaculo = this.espectaculoSeleccionado;
		String nombreFuncion = dtFuncion.getNombre();
		if(existeFuncion(dtFuncion.getNombre())) {
			throw new AltaFuncionDeEspectaculoExcepcion("La funcion " + nombreFuncion + " ya se encuentra en el sistema");
		} else {
			Conexion conexion = Conexion.getInstancia();
			EntityManager em = conexion.getEntityManager();					
			espectaculo.addFuncion(nuevaFuncion);	
			em.getTransaction().begin();
			em.persist(espectaculo);
			em.getTransaction().commit();
			
			for(String dtaNickName: artistasInvitados){
				ManejadorUsuario mU = ManejadorUsuario.getInstancia();
				Usuario usuarioArtista = mU.buscarUsuarioPorNickname(dtaNickName);
				((Artista)usuarioArtista).agregarFuncion(nuevaFuncion);
				
				em.getTransaction().begin();
				em.persist(usuarioArtista);
				em.getTransaction().commit();				
			};
		};
	};
		
	@Override
	public List<DtArtista> listarArtistas() {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		List<DtArtista> artistasEnElSistema = new ArrayList<DtArtista>();
		List<Usuario> coleccionUsuarios = mU.getUsuarios();
		for(Usuario usuario : coleccionUsuarios) {
			if(usuario instanceof Artista) {
				DtArtista dta = new DtArtista(((Artista) usuario).getNickName(), ((Artista) usuario).getNombre(), ((Artista) usuario).getApellido(), ((Artista) usuario).getEmail(), ((Artista) usuario).getFechaNac(), ((Artista) usuario).getPassword(), ((Artista) usuario).getImage(), ((Artista) usuario).getDescGeneral(), ((Artista) usuario).getBiografia(), ((Artista) usuario).getLink());
				artistasEnElSistema.add(dta);
			};
		};
		return artistasEnElSistema;
	};

	@Override
	public void agregarArtistaAFuncion(String nombreArtista) {		
		artistasIngresadosEnFuncion.add(nombreArtista);
	};
	
	@Override
	public String[] listarPlataformasComboBox() {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		
		List<Plataforma> listPlataformas = mP.getPlataformas();
		String[] Plataformas = new String[listPlataformas.size() + 1];
		Plataformas[0] = "";
		int i=1;
		for(Plataforma p : listPlataformas){
			Plataformas[i] =p.getNombre();
			i++;
		}
		return Plataformas;
	};

	@Override
	public String[] listarEspectaculosComboBox() {
		System.out.println("PLATAFORMA EN CONTROLADOR " + this.plataformaSeleccionada.getNombre());
		List<Espectaculo> listEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		String[] Espectaculos = new String[listEspectaculos.size() + 1];
		Espectaculos[0] = "";
		int i=1;
		for(Espectaculo e : listEspectaculos){
			Espectaculos[i] = e.getNombre();
			i++;
		}
		return Espectaculos;
	};

	@Override
	public String[] listarArtistasComboBox() {
		if (espectaculoSeleccionado != null) {
			ManejadorUsuario mU = ManejadorUsuario.getInstancia();
			List<String> listArtistas = mU.getArtistas();
			String[] Artistas = new String[listArtistas.size() + 1];
			Artistas[0] = "";
			int i=1;
			String artistaDelEspectaculo = espectaculoSeleccionado.getArtista().getNickName();			
			for(String nicknameArtista: listArtistas) {
				if(!artistaDelEspectaculo.equals(nicknameArtista)) {
					Artistas[i] = nicknameArtista;
					i++;
				}
			};
			artistasIngresadosEnSistema = listArtistas;
			return Artistas;
		}
		else {
			return new String[0];
		}
	};
}
