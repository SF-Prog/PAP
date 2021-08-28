package interfaces;

import datatypes.DtEspectaculo;

public interface IControladorAltaDeEspetaculo {
	public void existeEspectaculo(String plataforma, String artista, DtEspectaculo dtEspectaculo);
	public void ingresaEspectaculo(String plataforma, String artista, DtEspectaculo dtEspectaculo);
}
