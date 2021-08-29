package interfaces;

import java.util.ArrayList;
import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtUsuario;
import logica.Espectaculo;
import logica.Artista;



public interface IControladorAltaDeFuncionDeEspectaculo {
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma);
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo);
	public boolean existeFuncion(String nombreFuncion);
	public void ingresaFuncion(DtFuncion dtFuncion, List<DtArtista>  artistaInvitado);
	public List<DtArtista> listarArtistas();
}
