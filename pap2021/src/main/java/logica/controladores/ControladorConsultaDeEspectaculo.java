package logica.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import interfaces.IControladorConsultaDeEspectaculo;
import logica.Espectaculo;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;
import logica.manejadores.ManejadorPaquete;
import logica.manejadores.ManejadorPlataforma;

public class ControladorConsultaDeEspectaculo implements IControladorConsultaDeEspectaculo {
	private Plataforma plataformaSeleccionada= null;
	private Espectaculo espectaculoSeleccionada= null;
	private Funcion funcionSeleccionada = null;
	private Paquete paqueteSeleccionado = null;
	
	public ControladorConsultaDeEspectaculo() {
		super();
	}
	
	@Override
	public ArrayList<DtPlataforma> listarPlataformas() {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();		
		ArrayList<DtPlataforma> dtPlataformas = null;
		List<Plataforma> listPlataformas = mP.getPlataformas();
		for(Plataforma p : listPlataformas){
			DtPlataforma dtp = new DtPlataforma(p.getNombre(),p.getDescripcion(),p.getDuracion(),p.getEspectadoresMin(),p.getEspectadoresMax(),p.getURLAsociada(),p.getCosto(),p.getFechaAlta());
			dtPlataformas.add(dtp);
		}
		return dtPlataformas;
	}
	
	@Override
	public DtPlataforma seleccionaPlataforma(String nombre) {
		// TODO Auto-generated method stub
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma plataforma = mP.getPlataforma(nombre);
		this.plataformaSeleccionada = plataforma;		
		DtPlataforma dtp = new DtPlataforma(plataforma.getNombre(),plataforma.getDescripcion(),plataforma.getDuracion(),plataforma.getEspectadoresMin(),plataforma.getEspectadoresMax(),plataforma.getURLAsociada(),plataforma.getCosto(),plataforma.getFechaAlta());
		return dtp;
	}

	@Override
	public ArrayList<DtEspectaculo> listarEspectaculos(){
		
		ArrayList<DtEspectaculo> dtEspectaculos = null;
		List<Espectaculo> listEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		for(Espectaculo e : listEspectaculos){
			DtEspectaculo dte = new DtEspectaculo(e.getNombre(),e.getDescripcion(),e.getDuracion(),e.getEspectadoresMin(),e.getEspectadoresMax(),e.getUrlAsociada(),e.getCosto(),e.getFechaRegistro());
			dtEspectaculos.add(dte);
		}
		return dtEspectaculos;
	}

	@Override
	public DtEspectaculo seleccionaEspectaculo(String nombre) {
		// TODO Auto-generated method stub
		List<Espectaculo> listEspectaculos = plataformaSeleccionada.getEspectaculos();		
		Iterator<Espectaculo> eIterator = listEspectaculos.iterator();  
		DtEspectaculo dte = null;
		boolean existe = false;
		while(eIterator.hasNext() && !existe){
			if(eIterator.next().getNombre().equals(nombre)){
				existe = true;
				espectaculoSeleccionada = eIterator.next();
				dte = new DtEspectaculo(
						eIterator.next().getNombre(),
						eIterator.next().getDescripcion(),
						eIterator.next().getDuracion(),
						eIterator.next().getEspectadoresMin(),
						eIterator.next().getEspectadoresMax(),
						eIterator.next().getUrlAsociada(),
						eIterator.next().getCosto(),
						eIterator.next().getFechaRegistro()
						);
			}
		}			
		return dte;
	}

	@Override
	public ArrayList<DtFuncion> listarFunciones() {
		// TODO Auto-generated method stub
		ArrayList<DtFuncion> dtFunciones =null;
		List<Funcion> listFunciones = this.espectaculoSeleccionada.getFunciones();
		for(Funcion e : listFunciones){
			DtFuncion dtf = new DtFuncion(e.getNombre(),e.getFecha(),e.getHoraInicio(),e.getFechaRegistro());
			dtFunciones.add(dtf);
		}
		return dtFunciones;
	}

	@Override
	public DtFuncion seleccionaFuncion(String nombre) {
		// TODO Auto-generated method stub
		List<Funcion> listFunciones = this.espectaculoSeleccionada.getFunciones();
		DtFuncion dtf=null;
		Iterator<Funcion> fIterator = listFunciones.iterator();
		boolean existe = false;
		while(fIterator.hasNext() && !existe){
			if(fIterator.next().getNombre().equals(nombre)){
				existe = true;
				this.funcionSeleccionada = fIterator.next();
				dtf =new DtFuncion(fIterator.next().getNombre(),fIterator.next().getFecha(),fIterator.next().getHoraInicio(),fIterator.next().getFechaRegistro());
			}
		}
		return dtf;
	}

	@Override
	public ArrayList<DtPaquete> listarPaquetes() {
		// TODO Auto-generated method stub
		ManejadorPaquete mPa = ManejadorPaquete.getInstancia();
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
	public DtPaquete seleccionaPaquete(String nombre) {
		// TODO Auto-generated method stub
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
