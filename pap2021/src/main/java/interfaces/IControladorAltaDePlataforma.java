package interfaces;

import datatypes.DtPlataforma;
import excepciones.AltaPlataformaExcepcion;

public interface IControladorAltaDePlataforma {
	public void ingresaPlataforma(DtPlataforma dtPlataforma) throws AltaPlataformaExcepcion;
	public boolean existePlataforma(String nombre);
}
