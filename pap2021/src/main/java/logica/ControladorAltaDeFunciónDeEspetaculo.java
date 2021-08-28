package logica;

import java.util.ArrayList;
import java.util.Date;

import datatypes.DtArtista;
import datatypes.DtEspectaculo;

public class ControladorAltaDeFunciónDeEspetaculo {
	public ArrayList<DtEspectaculo>  seleccionaPlataforma(String nombrePlataforma);
	public void seleccionaEspectaculo(String nombreEspectaculo);
	public boolean  ingresaFuncion(String nombreFucion, Date fecha, Date horaInicio, ArrayList<DtArtista>  artistaInvitado, Date fechaAlta);

}
