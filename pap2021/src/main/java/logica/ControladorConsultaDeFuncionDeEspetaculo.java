package logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import interfaces.IControladorConsultaDeFuncionDeEspetaculo;

public class ControladorConsultaDeFuncionDeEspetaculo implements IControladorConsultaDeFuncionDeEspetaculo{
	private Plataforma plataformaSeleccionada= null;
	private Espectaculo espectaculoSeleccionada= null;
	private Funcion funcionSeleccionada = null;
	public ControladorConsultaDeFuncionDeEspetaculo() {
		super();
	}

	@Override
	public ArrayList<DtPlataforma> listarPlataformas() {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		
		ArrayList<DtPlataforma> dtPlataformas =null;
		List<Plataforma> listPlataformas = mP.getPlataformas();
		for(Plataforma p : listPlataformas){
			DtPlataforma dtp = new DtPlataforma(p.getNombre(),p.getDescripcion(),p.getDuracion(),p.getEspectadoresMin(),p.getEspectadoresMax(),p.getURLAsociada(),p.getCosto(),p.getFechaAlta());
			dtPlataformas.add(dtp);
		}
		return dtPlataformas;
	}

	@Override
	public DtPlataforma seleccionaPlataforma(String nombre) {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		Plataforma plataforma = mP.getPlataforma(nombre);
		this.plataformaSeleccionada =plataforma;
		
		DtPlataforma dtp = new DtPlataforma(plataforma.getNombre(),plataforma.getDescripcion(),plataforma.getDuracion(),plataforma.getEspectadoresMin(),plataforma.getEspectadoresMax(),plataforma.getURLAsociada(),plataforma.getCosto(),plataforma.getFechaAlta());

		return dtp;
	}

	@Override
	public ArrayList<DtEspectaculo> listarEspectaculos() {
		ArrayList<DtEspectaculo> dtEspectaculos =null;
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
		DtEspectaculo dte=null;
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
	
}
