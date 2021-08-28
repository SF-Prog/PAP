package logica;

import java.util.List;
import interfaces.IControladorAltaDePlataforma;

public class ControladorAltaDePlataforma implements IControladorAltaDePlataforma {

	public ControladorAltaDePlataforma() {
		super();
	}
	@Override
	public boolean ingresaPlataforma(String nombre, String descripcion, String URL) {
		boolean existePlataformaConNombre = false;
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		List<Plataforma> coleccionPlataformas = mP.getPlataformas();
		for(Plataforma plataforma : coleccionPlataformas) {
			if(plataforma.getNombre() == nombre) {
				existePlataformaConNombre = true;
			};
		};
		return existePlataformaConNombre;
	};
};
