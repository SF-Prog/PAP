package logica.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtPaquete;
import interfaces.IControladorConsultaDePaqueteDeEspectaculos;
import logica.Espectaculo;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;
import logica.manejadores.ManejadorPaquete;

public class ControladorConsultaDePaqueteDeEspectaculos implements IControladorConsultaDePaqueteDeEspectaculos {
	private Espectaculo espectaculoSeleccionado = null;
	private Funcion funcionSeleccionada = null;
	private Paquete paqueteSeleccionado = null;
	
	public ControladorConsultaDePaqueteDeEspetaculos() {
		super();
	}

	@Override
	public ArrayList<DtPaquete> listarPaquetes() {
		ManejadorPaquete mPa = ManejadorPaquete.getInstancia();
		ArrayList<DtPaquete> dtPaquete =null;
		List<Paquete> listPaquetes = mPa.getPaquetes();
		for(Paquete p : listPaquetes){
			List<Espectaculo> listEspectaculos = p.getEspectaculos();
			DtPaquete dtp = null;
			Iterator<Espectaculo> eIterator = listEspectaculos.iterator();
			boolean existe = false;
			while(eIterator.hasNext() && !existe){
				if(eIterator.next().getNombre().equals(this.espectaculoSeleccionado.getNombre())){
					existe = true;
					dtp = new DtPaquete(p.getNombre(),p.getDescripcion(),p.getDescuento());
				}
			}
			dtPaquete.add(dtp);
		}
		return dtPaquete;
	}

	@Override
	public DtPaquete selecionaPaquete(String nombre) {
		ManejadorPaquete mPa = ManejadorPaquete.getInstancia();
		List<Paquete> listPaquetes = mPa.getPaquetes();				
		DtPaquete dtp=null;
		Iterator<Paquete> pIterator = listPaquetes.iterator();
		boolean existe = false;
		while(pIterator.hasNext() && !existe){
			if(pIterator.next().getNombre().equals(nombre)){
				existe = true;
				this.paqueteSeleccionado = pIterator.next();
				dtp = new DtPaquete(pIterator.next().getNombre(),pIterator.next().getDescripcion(),pIterator.next().getDescuento());
			}
		}
		return dtp;
	}	
}
