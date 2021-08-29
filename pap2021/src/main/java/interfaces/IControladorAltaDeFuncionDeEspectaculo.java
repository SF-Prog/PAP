package interfaces;

import java.util.List;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import logica.Espectaculo;

public interface IControladorAltaDeFuncionDeEspectaculo {
	public List<DtEspectaculo> seleccionaPlataforma(String nombrePlataforma);
	public Espectaculo seleccionaEspectaculo(String nombreEspectaculo);
	public boolean existeFuncion(String nombreFuncion);
	public void ingresaFuncion(DtFuncion dtFuncion, List<DtArtista>  artistaInvitado);
	public List<DtArtista> listarArtistas();
}
