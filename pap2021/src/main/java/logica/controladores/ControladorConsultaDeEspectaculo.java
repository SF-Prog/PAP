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
import logica.manejadores.ManejadorUsuario;

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
	public String[] listarPlataformasComboBox() {
		ManejadorPlataforma mP = ManejadorPlataforma.getInstancia();		
		List<Plataforma> listPlataformas = mP.getPlataformas();
		String[] Plataformas = new String[listPlataformas.size()+1];
		Plataformas[0]="";
		int i=1;
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
		this.plataformaSeleccionada = plataforma;		
		DtPlataforma dtp = new DtPlataforma(plataforma.getNombre(),plataforma.getDescripcion(),plataforma.getDuracion(),plataforma.getEspectadoresMin(),plataforma.getEspectadoresMax(),plataforma.getURLAsociada(),plataforma.getCosto(),plataforma.getFechaAlta());
		return dtp;
	}

	@Override
	public ArrayList<DtEspectaculo> listarEspectaculos(){
		ArrayList<DtEspectaculo> dtEspectaculos = null;
		List<Espectaculo> listEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		for(Espectaculo e : listEspectaculos){
			DtEspectaculo dte = new DtEspectaculo(e.getNombre(),e.getDescripcion(),e.getDuracion(),e.getEspectadoresMin(),e.getEspectadoresMax(),e.getUrlAsociada(),e.getCosto(),e.getFechaRegistro(),e.getImage());
			dtEspectaculos.add(dte);
		}
		return dtEspectaculos;

	}
	
	@Override
	public String[] listarEspectaculosComboBox(){
		List<Espectaculo> listEspectaculos = this.plataformaSeleccionada.getEspectaculos();
		String[] Espectaculos = new String[listEspectaculos.size()+1];
		Espectaculos[0]="";
		int i=1;
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
		DtEspectaculo dte = null;
		boolean existe = false;
		while(eIterator.hasNext() && !existe){
			Espectaculo temp = eIterator.next();
			if(temp.getNombre().equals(nombre)){
				existe = true;
				espectaculoSeleccionada = temp;
				dte = new DtEspectaculo(
					temp.getNombre(),
					temp.getDescripcion(),
					temp.getDuracion(),
					temp.getEspectadoresMin(),
					temp.getEspectadoresMax(),
					temp.getUrlAsociada(),
					temp.getCosto(),
					temp.getFechaRegistro(),
					temp.getImage(),
					temp.getArtista().getNickName()
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
			DtFuncion dtf = new DtFuncion(e.getNombre(),e.getFecha(),e.getHoraInicio(),e.getFechaRegistro(),e.getImage());
			dtFunciones.add(dtf);
		}
		return dtFunciones;
	}

	@Override
	public String[] listarFuncionesComboBox() {
		List<Funcion> listFunciones = this.espectaculoSeleccionada.getFunciones();
		String[] Funciones = new String[listFunciones.size()+1];
		Funciones[0]="";
		int i=1;
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
			Funcion temp = fIterator.next();
			if(temp.getNombre().equals(nombre)){
				existe = true;
				this.funcionSeleccionada = temp;
				dtf =new DtFuncion(temp.getNombre(),temp.getFecha(),temp.getHoraInicio(),temp.getFechaRegistro(),temp.getImage(),this.listarArtistasInvitados());
			}
		}
		return dtf;
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
				Espectaculo temp = eIterator.next();
				if(temp.getNombre().equals(this.espectaculoSeleccionada.getNombre())){
					existe = true;
					dtp = new DtPaquete(p.getNombre(),p.getDescripcion(),p.getDescuento());
				}
			}
			dtPaquete.add(dtp);
		}
		return dtPaquete;
	}

	
	@Override
	public String[] listarPaquetesComboBox() {
		ManejadorPaquete mPa = ManejadorPaquete.getInstancia();
		List<Paquete> listPaquetes = mPa.getPaquetes();
		String[] Paquetes = new String[listPaquetes.size()+1];
		Paquetes[0]="";
		int i=1;
		for(Paquete p : listPaquetes){
			List<Espectaculo> listEspectaculos = p.getEspectaculos();
			Iterator<Espectaculo> eIterator = listEspectaculos.iterator();
			boolean existe = false;
			while(eIterator.hasNext() && !existe){
				Espectaculo temp = eIterator.next();
				if(temp.getNombre().equals(this.espectaculoSeleccionada.getNombre())){
					existe = true;
					Paquetes[i] = p.getNombre();
					
				}
			}
			i++;
		}
		return Paquetes;

	}
	
	@Override
	public DtPaquete seleccionaPaquete(String nombre) {
		ManejadorPaquete mPa = ManejadorPaquete.getInstancia();
		List<Paquete> listPaquetes = mPa.getPaquetes();				
		DtPaquete dtp=null;
		Iterator<Paquete> pIterator = listPaquetes.iterator();
		boolean existe = false;
		while(pIterator.hasNext() && !existe){
			Paquete temp = pIterator.next();
			if(temp.getNombre().equals(nombre)){
				existe = true;
				this.paqueteSeleccionado = pIterator.next();
				dtp = new DtPaquete(temp.getNombre(),temp.getDescripcion(),temp.getDescuento());
			}
		}
		return dtp;
	}

	@Override
	public String[] listarArtistasInvitados() {
		ManejadorUsuario mU = ManejadorUsuario.getInstancia();
		String funcion = this.funcionSeleccionada.getNombre();
		List<String> artistasInvitados = mU.getArtistasInvitadosEnFuncion(funcion);
		if (artistasInvitados != null){
			String[] Artistas = new String[artistasInvitados.size()+1];
			Artistas[0]="";
			int i=1;
			for(String artista : artistasInvitados){
				Artistas[i] = artista;
				i++;
			}
			return Artistas;
		} else {
			return new String[0];
		}
	}	
}
