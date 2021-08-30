package interfaces;

import datatypes.DtEspectaculo;
import excepciones.AltaEspectaculoExcepcion;

public interface IControladorAltaDeEspectaculo {
	public String[] listarPlataformas();
	public String[] listarArtistas();
	public boolean existeEspectaculo(String plataforma, String espectaculo);
	public void ingresaEspectaculo(String plataforma, String artista, DtEspectaculo dtEspectaculo) throws AltaEspectaculoExcepcion;
}
