package interfaces;

import datatypes.DtPlataforma;

public interface IControladorAltaDePlataforma {
	public void ingresaPlataforma(DtPlataforma dtPlataforma);
	public boolean existePlataforma(String nombre);
}
