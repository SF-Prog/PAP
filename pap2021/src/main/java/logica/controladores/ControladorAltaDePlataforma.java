package logica.controladores;

import java.util.List;

import datatypes.DtPlataforma;
import excepciones.AltaPlataformaExcepcion;
import interfaces.IControladorAltaDePlataforma;
import logica.Plataforma;
import logica.manejadores.ManejadorPlataforma;

public class ControladorAltaDePlataforma implements IControladorAltaDePlataforma {
	public ControladorAltaDePlataforma() {
		super();
	}
	
	@Override
	public boolean existePlataforma(String nombre) {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		List<Plataforma> coleccionPlataformas = mP.getPlataformas();
		for(Plataforma plataforma : coleccionPlataformas) {
			if(nombre.equals(plataforma.getNombre())) {
				return true;
			};
		};
		return false;
	};
	
	@Override
	public void ingresaPlataforma(DtPlataforma dtp) throws AltaPlataformaExcepcion {
		String plataforma = dtp.getNombre();
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		if (existePlataforma(plataforma))
			throw new AltaPlataformaExcepcion("La plataforma " + plataforma + " ya se encuentra en el sistema");
		
		Plataforma nuevaPlataforma = new Plataforma(dtp.getNombre(), dtp.getDescripcion(), dtp.getURLAsociada());
		mP.addPlataforma(nuevaPlataforma);
	}
};
