package interfaces;

import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import logica.Espectaculo;
import excepciones.AltaFuncionDeEspectaculoExcepcion;

public interface IControladorAltaDeFuncionDeEspectaculo {
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma);
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo);
	public boolean existeFuncion(String nombreFuncion);
	public void ingresaFuncion(DtFuncion dtFuncion, List<String>  artistaInvitado) throws AltaFuncionDeEspectaculoExcepcion;
	public List<DtArtista> listarArtistas();
	public void agregarArtistaAFuncion(String nombreArtista);
	
	public String[] listarPlataformasComboBox();
	public String[] listarEspectaculosComboBox();
	public String[] listarArtistasComboBox();
}
