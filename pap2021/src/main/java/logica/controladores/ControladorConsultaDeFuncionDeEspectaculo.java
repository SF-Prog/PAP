package logica.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;
import logica.Espectaculo;
import logica.Funcion;
import logica.Plataforma;
import logica.manejadores.ManejadorPlataforma;

public class ControladorConsultaDeFuncionDeEspectaculo implements IControladorConsultaDeFuncionDeEspectaculo{
	private Plataforma plataformaSeleccionada = null;
	private Espectaculo espectaculoSeleccionada = null;
	private Funcion funcionSeleccionada = null;
	
	public ControladorConsultaDeFuncionDeEspectaculo() {
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
	public String[] listarPlataformasComboBox() {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();
		
		List<Plataforma> listPlataformas = mP.getPlataformas();
		String[] Plataformas = new String[listPlataformas.size()];
		int i=0;
		for(Plataforma p : listPlataformas){
			Plataformas[i] =p.getNombre();
			i++;
		}
		return Plataformas;
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
	public String[] listarEspectaculosComboBox(){
		List<Espectaculo> listEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		String[] Espectaculos = new String[listEspectaculos.size()];
		int i=0;
		for(Espectaculo e : listEspectaculos){
			Espectaculos[i] = e.getNombre();
			i++;
		}
		return Espectaculos;
	}

	@Override
	public DtEspectaculo seleccionaEspectaculo(String nombre) {
		List<Espectaculo> listEspectaculos = plataformaSeleccionada.getEspectaculos();		
		Iterator<Espectaculo> eIterator = listEspectaculos.iterator();  
		DtEspectaculo dte=null;
		boolean existe = false;
		while(eIterator.hasNext() && !existe){
			Espectaculo it = eIterator.next();
			if(it.getNombre().equals(nombre)){
				existe = true;
				espectaculoSeleccionada = eIterator.next();
				dte = new DtEspectaculo(
						it.getNombre(),
						it.getDescripcion(),
						it.getDuracion(),
						it.getEspectadoresMin(),
						it.getEspectadoresMax(),
						it.getUrlAsociada(),
						it.getCosto(),
						it.getFechaRegistro()
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
	public String[] listarFuncionesComboBox() {
		// TODO Auto-generated method stub
		List<Funcion> listFunciones = this.espectaculoSeleccionada.getFunciones();
		String[] Funciones = new String[listFunciones.size()];
		int i=0;
		for(Funcion e : listFunciones){
			Funciones[i] = e.getNombre();
			i++;
		}
		return Funciones;
	}
	
	@Override
	public DtFuncion seleccionaFuncion(String nombre) {
		List<Funcion> listFunciones = this.espectaculoSeleccionada.getFunciones();
		DtFuncion dtf=null;
		Iterator<Funcion> fIterator = listFunciones.iterator();
		boolean existe = false;
		while(fIterator.hasNext() && !existe){
			Funcion it = fIterator.next();
			if(it.getNombre().equals(nombre)){
				existe = true;
				this.funcionSeleccionada = it;
				dtf =new DtFuncion(it.getNombre(),it.getFecha(),it.getHoraInicio(),it.getFechaRegistro());
			}
		}
		return dtf;		
	}	
}
