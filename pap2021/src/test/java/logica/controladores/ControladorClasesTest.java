package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Artista;
import logica.Espectaculo;
import logica.Espectador;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;
import logica.Usuario;

public class ControladorClasesTest {
	ControladorAltaDeUsuario CAU;
	Date date;
	
	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		date = new Date();
	}
	
	@Test
	void Artista() {
		Artista a = new Artista();
		a.setApellido("s");
		
		List<Funcion> lfs =  new ArrayList<>();
		Funcion f1 = new Funcion("nombre funcion", date, "hora", date, "img");
		lfs.add(f1);
		a.setFunciones(lfs);

		Funcion f2 = new Funcion("nombre funcion 2", date, "hora", date, "img");
		a.agregarFuncion(f2);
		lfs.add(f2);
		
		assertEquals(a.getFunciones(), lfs);
	}
	
	@Test
	void Espectaculo() {
		String nombre = "nombre";
		String descripcion = "descripcion";
		int duracion = 100;
		int espectadoresMin = 1;
		int espectadoresMax = 100;
		String url = "url";
		float costo = 50;
		String image = "image";
		
		Artista artista = new Artista("artista", "nombre", "apellido", "email", date, "password", "urlImage", "descGeneral", "biografia", "link");
		
		Funcion f1 = new Funcion("f1", date, "horaInicio", date, "image");
		List<Funcion> funciones = new ArrayList<Funcion>();
		funciones.add(f1);

		Funcion f2 = new Funcion("f2", date, "horaInicio", date, "image");
		
		Espectaculo e = new Espectaculo(nombre, descripcion, duracion, espectadoresMin, espectadoresMax, url, costo, date, image);
		e.setArtista(artista);
		e.setFunciones(funciones);
		e.addFuncion(f2);
	
		assertEquals(nombre, e.getNombre());
		assertEquals(descripcion, e.getDescripcion());
		assertEquals(duracion, e.getDuracion());
		assertEquals(espectadoresMin, e.getEspectadoresMin());
		assertEquals(espectadoresMax, e.getEspectadoresMax());
		assertEquals(url, e.getUrlAsociada());
		assertEquals(costo, e.getCosto());
		assertEquals(date, e.getFechaRegistro());
		assertEquals(image, e.getImage());
		assertEquals(artista, e.getArtista());
		assertEquals(funciones, e.getFunciones());
	}
	
	@Test
	void Espectador() {
		Espectador e = new Espectador("espectadorDSUI4Test", "nombre", "apellido", "espectadorDSUI3@test.com", date, "password", "urlImage");
		e.setApellido("s");
		
		assertEquals(e.getNombre(), "nombre");

		Espectador e2 = new Espectador();
		e2.setNickName("nickname");
		assertEquals(e2.getNickName(), "nickname");
	}
	
	@Test
	void Funcion() {
		String nombre = "nombre";
		String horaInicio = "horaInicio";
		String image = "image";
		
		Funcion f = new Funcion(nombre, date, horaInicio, date, image);
	
		assertEquals(nombre, f.getNombre());
		assertEquals(date, f.getFecha());
		assertEquals(horaInicio, f.getHoraInicio());
		assertEquals(date, f.getFechaRegistro());
		assertEquals(image, f.getImage());
	}
	
	@Test
	void Paquete() {
		String nombre = "nombre";
		String descripcion = "descripcion";
		float descuento = 0;

		Espectaculo e =new Espectaculo("nombre", "descripcion", 100, 1, 100, "url", 50, date, "image");
		List<Espectaculo> espectaculos = new ArrayList<Espectaculo>();
		espectaculos.add(e);

		Paquete p = new Paquete(nombre, descripcion, descuento);
		p.setEspectaculos(espectaculos);
	
		assertEquals(nombre, p.getNombre());
		assertEquals(descripcion, p.getDescripcion());
		assertEquals(descuento, p.getDescuento());
		assertEquals(espectaculos, p.getEspectaculos());
	}
	
	@Test
	void Plataforma() {
		String nombre = "p1";
		String descripcion = "descripcion";
		String url = "url";

		Espectaculo e =new Espectaculo("nombre", "descripcion", 100, 1, 100, "url", 50, date, "image");
		List<Espectaculo> espectaculos = new ArrayList<Espectaculo>();
		espectaculos.add(e);
		
		Plataforma p1 = new Plataforma(nombre, descripcion, url);
		p1.setEspectaculos(espectaculos);
	
		assertEquals(nombre, p1.getNombre());
		assertEquals(descripcion, p1.getDescripcion());
		assertEquals(url, p1.getURLAsociada());
		assertEquals(espectaculos, p1.getEspectaculos());

		int duracion = 100;
		String espectadoresMin = "1";
		String espectadoresMax = "100";
		float costo = 50;
		String fechaAlta = "fechaAlta";
		nombre = "p2";
		
		Plataforma p2 = new Plataforma(nombre, descripcion, duracion, espectadoresMin, espectadoresMax, url, costo, fechaAlta);
	
		assertEquals(nombre, p2.getNombre());
		assertEquals(descripcion, p2.getDescripcion());
		assertEquals(url, p2.getURLAsociada());
		assertEquals(duracion, p2.getDuracion());
		assertEquals(espectadoresMin, p2.getEspectadoresMin());
		assertEquals(espectadoresMax, p2.getEspectadoresMax());
		assertEquals(costo, p2.getCosto());
		assertEquals(fechaAlta, p2.getFechaAlta());
	}
	
	@Test
	void Usuario() {
		Usuario u = new Usuario("espectadorDSUI4Test", "nombre", "apellido", "espectadorDSUI3@test.com", date, "password", "urlImage");
		Usuario u2 = new Usuario("espectadorDSUI4Test2", "nombre2", "apellido2", "espectadorDSUI3@test.com2", date, "password2", "urlImage2");
		
		u.getDtUsuario();
		try {
			u.seguir(u2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Usuario> lus =  new ArrayList<>();
		lus.add(u2);
		u.setUsuariosSeguidos(lus);
		
		try {
			u.seguir(u2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			u.seguir(u2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		u.getUsuariosSeguidos();
		
		try {
			u.dejarDeSeguir(u2);
		} catch (IOException e) {
		}
		
		try {
			u.dejarDeSeguir(u2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertEquals(u.getDtUsuario().getNombre(), "nombre");
	}
}
