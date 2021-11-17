package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Espectaculo;
import logica.Espectador;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;

public class ControladorClasesTest {
	ControladorAltaDeUsuario CAU;
	Date date;
	
	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		date = new Date();
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
		
		Espectaculo e = new Espectaculo(nombre, descripcion, duracion, espectadoresMin, espectadoresMax, url, costo, date, image);
	
		assertEquals(nombre, e.getNombre());
		assertEquals(descripcion, e.getDescripcion());
		assertEquals(duracion, e.getDuracion());
		assertEquals(espectadoresMin, e.getEspectadoresMin());
		assertEquals(espectadoresMax, e.getEspectadoresMax());
		assertEquals(url, e.getUrlAsociada());
		assertEquals(costo, e.getCosto());
		assertEquals(date, e.getFechaRegistro());
		assertEquals(image, e.getImage());
	}
	
	@Test
	void Espectador() {
		Espectador e = new Espectador("espectadorDSUI4Test", "nombre", "apellido", "espectadorDSUI3@test.com", date, "password", "urlImage");
		assertEquals(e.getNombre(), "nombre");
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
		
		Paquete p = new Paquete(nombre, descripcion, descuento);
	
		assertEquals(nombre, p.getNombre());
		assertEquals(descripcion, p.getDescripcion());
		assertEquals(descuento, p.getDescuento());
	}
	
	@Test
	void Plataforma() {
		String nombre = "nombre";
		String descripcion = "descripcion";
		String url = "url";
		
		Plataforma p = new Plataforma(nombre, descripcion, url);
	
		assertEquals(nombre, p.getNombre());
		assertEquals(descripcion, p.getDescripcion());
		assertEquals(url, p.getURLAsociada());
	}
}
