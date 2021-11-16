package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datatypes.DtArtista;
import datatypes.DtEspectador;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import datatypes.DtRegistro;

public class ControladorDataTypesTest {
	ControladorAltaDeUsuario CAU;
	Date date;
	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		date = new Date();
	}
	@Test
	void dtEspectador() {
		String espectador = "espectadorDSUI4Test";
		String emaile = "espectadorDSUI3@test.com";
		DtEspectador dtEspectador = new DtEspectador(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		assertTrue(dtEspectador.getNombre().equals("nombre"));
	}
	
	@Test
	void dtArtistaGetDescGeneral() {
		String artista1 = "artistaDSUI3Test";
		String emaila1 = "artistaDSUI3@test.com";
		DtArtista dtArtista = new DtArtista(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage","descripcion", "biografia", "link");
		assertTrue(dtArtista.getDescGeneral().equals("descripcion"));
	}
	@Test
	void dtArtistaGetBiografia(){
		String artista1 = "artistaDSUI3Test";
		String emaila1 = "artistaDSUI3@test.com";
		DtArtista dtArtista = new DtArtista(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage","descripcion", "biografia", "link");
		assertTrue(dtArtista.getBiografia().equals("biografia"));
	}
	@Test
	void dtArtistaGetLink(){
		String artista1 = "artistaDSUI3Test";
		String emaila1 = "artistaDSUI3@test.com";
		DtArtista dtArtista = new DtArtista(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage","descripcion", "biografia", "link");
		assertTrue(dtArtista.getLink().equals("link"));
	}
	@Test
	void dtArtistaToString(){
		String artista1 = "artistaDSUI3Test";
		String emaila1 = "artistaDSUI3@test.com";
		DtArtista dtArtista = new DtArtista(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage","descripcion", "biografia", "link");
		String resultado = dtArtista.toString();
	   // Use number.length to get the length of the array.
	   assertTrue(!resultado.equals(""));
	}
	

	@Test
	void dtRegistro() {
		DtRegistro dtRegistro = new DtRegistro(date,100);
		assertTrue(dtRegistro.getCosto()== 100);
	}
	@Test
	void dtRegistroGetFechaRegistro() {
		DtRegistro dtRegistro = new DtRegistro(date,100);
		dtRegistro.getFechaRegistro();
		assertTrue(dtRegistro.getFechaRegistro()== date);
	}
	@Test
	void  dtRegistroSetFechaRegistro() {
		DtRegistro dtRegistro = new DtRegistro(date,100);
		dtRegistro.setFechaRegistro(date);
		assertTrue(dtRegistro.getFechaRegistro()== date);
	}
	@Test
	void  dtRegistroGetCosto() {
		DtRegistro dtRegistro = new DtRegistro(date,100);
		assertTrue(dtRegistro.getCosto()== 100);
	}
	@Test
	void dtRegistrosetCosto() {
		DtRegistro dtRegistro = new DtRegistro(date,100);
		dtRegistro.setCosto(200);
		assertTrue(dtRegistro.getCosto()== 200);
	}
	
	
	//********************************* 
	@Test
	void dtPlataforma() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion","URLAsociada");
		dtPlataforma.getNombre();
		assertTrue(dtPlataforma.getNombre().equals("nombrePlataforma"));
	}
	
	@Test
	void dtPlataformagetDuracion() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion", 90, "espectadoresMin", "espectadoresMax",
				"URLAsociada", 100, "fechaAlta");
		dtPlataforma.getDuracion();
		assertTrue(dtPlataforma.getDuracion() == 90 );
	}
	
	@Test
	void dtPlataformagetEspectadoresMin() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion", 90, "espectadoresMin", "espectadoresMax",
				"URLAsociada", 100, "fechaAlta");

		assertTrue(dtPlataforma.getEspectadoresMin().equals("espectadoresMin"));
	}
	
	@Test
	void dtPlataformagetEspectadoresMax() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion", 90, "espectadoresMin", "espectadoresMax",
				"URLAsociada", 100, "fechaAlta");
		dtPlataforma.getEspectadoresMax();
		assertTrue(dtPlataforma.getEspectadoresMax().equals("espectadoresMax"));
	}
	
	@Test
	void dtPlataformagetCosto() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion", 90, "espectadoresMin", "espectadoresMax",
				"URLAsociada", 100, "fechaAlta");

		assertTrue(dtPlataforma.getCosto()==100);
	}
	
	@Test
	void dtPlataformagetFechaAlta() {
		DtPlataforma dtPlataforma = new DtPlataforma("nombrePlataforma", "descripcion", 90, "espectadoresMin", "espectadoresMax",
				"URLAsociada", 100, "fechaAlta");
		 assertTrue(dtPlataforma.getFechaAlta().equals("fechaAlta"));
	}
	
	/********************************************/
	
	@Test
	void dtFuncion() {
		DtFuncion dtfuncion =new DtFuncion("nombre", date, "horaInicio", date, "image");
		assertTrue(!dtfuncion.toString().equals(""));
	}
	

}
