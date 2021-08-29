package logica.controladores;

import java.util.List;

import datatypes.DtPlataforma;
import interfaces.IControladorAltaDePlataforma;
import logica.Plataforma;
import logica.manejadores.ManejadorPlataforma;

public class ControladorAltaDePlataforma implements IControladorAltaDePlataforma {
	public ControladorAltaDePlataforma() {
		super();
	}
	
	@Override
	public boolean existePlataforma(String nombre) {
		boolean existePlataformaConNombre = false;
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		List<Plataforma> coleccionPlataformas = mP.getPlataformas();
		for(Plataforma plataforma : coleccionPlataformas) {
			if(nombre.equals(plataforma.getNombre())) {
				existePlataformaConNombre = true;
			};
		};
		return existePlataformaConNombre;
	};
	
	@Override
	public void ingresaPlataforma(DtPlataforma dtp) {
		Plataforma nuevaPlataforma = new Plataforma(dtp.getNombre(), dtp.getDescripcion(), dtp.getURLAsociada());
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		mP.addPlataforma(nuevaPlataforma);
	}
};
