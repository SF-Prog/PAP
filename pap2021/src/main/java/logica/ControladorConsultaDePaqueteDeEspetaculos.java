package logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtPaquete;
import interfaces.IControladorConsultaDePaqueteDeEspetaculos;


public class ControladorConsultaDePaqueteDeEspetaculos implements IControladorConsultaDePaqueteDeEspetaculos {
	private Plataforma plataformaSeleccionada= null;
	private Espectaculo espectaculoSeleccionada= null;
	private Funcion funcionSeleccionada = null;
	private Paquete paqueteSeleccionada = null;
	public ControladorConsultaDePaqueteDeEspetaculos() {
		super();
	}

	@Override
	public ArrayList<DtPaquete> listarPaquetes() {
		// TODO Auto-generated method stub
		ManjadorPaquete mPa = ManjadorPaquete.getInstancia();

		ArrayList<DtPaquete> dtPaquete =null;
		List<Paquete> listPaquetes = mPa.getPaquetes();
		for(Paquete p : listPaquetes){
			List<Espectaculo> listEspectaculos = p.getEspectaculos();
			DtPaquete dtp = null;
			Iterator<Espectaculo> eIterator = listEspectaculos.iterator();
			boolean existe = false;
			while(eIterator.hasNext() && !existe){
				if(eIterator.next().getNombre().equals(this.espectaculoSeleccionada.getNombre())){
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
		// TODO Auto-generated method stub
		ManjadorPaquete mPa = ManjadorPaquete.getInstancia();


		List<Paquete> listPaquetes = mPa.getPaquetes();
				
		DtPaquete dtp=null;
		Iterator<Paquete> pIterator = listPaquetes.iterator();
		boolean existe = false;
		while(pIterator.hasNext() && !existe){
			if(pIterator.next().getNombre().equals(nombre)){
				existe = true;
				this.paqueteSeleccionada = pIterator.next();
				dtp = new DtPaquete(pIterator.next().getNombre(),pIterator.next().getDescripcion(),pIterator.next().getDescuento());
			}
		}
		return dtp;
	}

	
}
