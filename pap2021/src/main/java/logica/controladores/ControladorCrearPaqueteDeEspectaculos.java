package logica.controladores;

import java.util.Date;

import interfaces.IControladorCrearPaqueteDeEspectaculos;

public class ControladorCrearPaqueteDeEspectaculos implements IControladorCrearPaqueteDeEspectaculos {
	public ControladorCrearPaqueteDeEspectaculos() {
		super();
	}
	 
	@Override
	public void solicitarDatos(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento) {
	}

	@Override
	public boolean exiteEspectaculo(String nombre) {
		return false;
	}

	@Override
	public void ingresaEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento,
			Date fechaAlta) {		
	}

	@Override
	public void ModificarEspectaculo(String nombre, String descripcion, Date fechainicio, Date fechaFin, int descuento,
			Date fechaAlta) {		
	}
}
