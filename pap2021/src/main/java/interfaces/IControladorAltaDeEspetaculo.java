package interfaces;

import datatypes.DtEspectaculo;

public interface IControladorAltaDeEspetaculo {
	public void existeEspectáculo(String plataforma, String artista, DtEspectaculo dtEspectaculo);
	public void ingresaEspectáculo(String plataforma, String artista, DtEspectaculo dtEspectaculo);

}
