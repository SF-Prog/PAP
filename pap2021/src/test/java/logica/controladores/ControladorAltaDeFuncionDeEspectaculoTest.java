package logica.controladores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;

public class ControladorAltaDeFuncionDeEspectaculoTest {
	ControladorAltaDeFuncionDeEspectaculo CAFE = new ControladorAltaDeFuncionDeEspectaculo();
	ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
	ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
	ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
	Date date = new Date();
	
	String nombrePlataforma = "NombrePlataformaCAFE";
	String nombrePlataforma2 = "NombrePlataforma2CAFE";
	String nicknameArtista1 = "artistaTestCAFE";
	String emailArtista1 = "artista@test.comCAFE";
	String nicknameArtista2 = "artistaTest2CAFE";
	String emailArtista2 = "artista2@test.comCAFE";
	DtPlataforma dtPlataforma =  new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
	DtPlataforma dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
	DtUsuario dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
	DtUsuario dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
	String nombreEspectaculo = "nombre espctaculoCAFE";
	DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspectaculo, "descripcion", 90, 10, 20,"url", 20, date, "img");
	String nombreEspectaculo2 = "nombre espctaculo2CAFE";
	DtEspectaculo dtEspectaculo2 = new DtEspectaculo(nombreEspectaculo2, "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
	String nombrefuncion = "nombre funcionCAFE";
	DtFuncion dFuncion = new DtFuncion(nombrefuncion, date, "00:00:00", date, "img");
	
	@BeforeAll
	public static void inicializarTest() {
		ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
		ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
		ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
		ControladorAltaDeFuncionDeEspectaculo CAFE = new ControladorAltaDeFuncionDeEspectaculo();
		
		Date date = new Date();
		
		String nombrePlataforma = "NombrePlataformaCAFE";
		String nombrePlataforma2 = "NombrePlataforma2CAFE";
		String nicknameArtista1 = "artistaTestCAFE";
		String emailArtista1 = "artista@test.comCAFE";
		String nicknameArtista2 = "artistaTest2CAFE";
		String emailArtista2 = "artista2@test.comCAFE";
		DtPlataforma dtPlataforma =  new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		DtPlataforma dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		DtUsuario dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
		DtUsuario dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
		String nombreEspectaculo = "nombre espctaculoCAFE";
		DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspectaculo, "descripcion", 90, 10, 20,"url", 20, date, "img");
		String nombreEspectaculo2 = "nombre espctaculo2CAFE";
		DtEspectaculo dtEspectaculo2 = new DtEspectaculo(nombreEspectaculo2, "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
		String nombrefuncion = "nombre funcionCAFE";
		DtFuncion dFuncion = new DtFuncion(nombrefuncion, date, "00:00:00", date, "img");
		
		List<String> artistasInvitados =new ArrayList<String>();  
		artistasInvitados.add(nicknameArtista2);  
		
		
		 dtPlataforma = new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { 
			CAP.ingresaPlataforma(dtPlataforma); 
		} catch(AltaPlataformaExcepcion ape) {};
		
		 dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try {
			CAP.ingresaPlataforma(dtPlataforma2);
			} catch(AltaPlataformaExcepcion ape) {};
		
		 dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");

		 dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista2, "descripcion", "biografia", "link");
		
		dtEspectaculo = new DtEspectaculo(nombreEspectaculo, "descripcion", 90, 10, 20,"url", 20, date, "img");
		dtEspectaculo2 = new DtEspectaculo(nombreEspectaculo2, "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
		
		 try {
			CAE.ingresaEspectaculo(nombrePlataforma,nicknameArtista1, dtEspectaculo);
		} catch (AltaEspectaculoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CAE.ingresaEspectaculo(nombrePlataforma,nicknameArtista1, dtEspectaculo2);
		} catch (AltaEspectaculoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		dFuncion = new DtFuncion(nombrefuncion, date, "00:00:00", date, "img");
		try {
			CAFE.seleccionaPlataforma(nombrePlataforma);
			CAFE.seleccionaEspectaculo(nombreEspectaculo);
			CAFE.ingresaFuncion(dFuncion, artistasInvitados);
		} catch (AltaFuncionDeEspectaculoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	void  listarPlataformasComboBoxLLeno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CAFE.listarPlataformasComboBox().length;
		
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);		
	}
	
	@Test
	void  listarEspectaculosComboBoxLleno(){
		CAFE.seleccionaPlataforma(nombrePlataforma);
		final int EXPECTED_LENGTH = 1;
		int resultado = CAFE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}
	

	@Test
	void seleccionaEspectaculo() {
		//DtEspectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,String urlAsociada, float costo, Date fechaRegistro, String image)
		//Date fecha = new Date();
		//DtEspectaculo dtEspectaculo = new DtEspectaculo("nombre espctaculo", "descripcion", 90, 10, 20,"url", 20, fecha, "img");
		CAFE.seleccionaPlataforma(nombrePlataforma);
		assertEquals(CAFE.seleccionaEspectaculo(nombreEspectaculo).getNombre(), dtEspectaculo.getNombre());
	}
	
	
	@Test
	void  listarPlataformasComboBoxLleno() {
		CAFE.seleccionaPlataforma(nombrePlataforma);
		CAFE.seleccionaEspectaculo(nombreEspectaculo);
		final int EXPECTED_LENGTH = 1;
		int resultado = CAFE.listarPlataformasComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado >EXPECTED_LENGTH);
	}
	
	@Test
	void  listarArtistasComboBoxLleno() {
		CAFE.seleccionaPlataforma(nombrePlataforma);
		CAFE.seleccionaEspectaculo(nombreEspectaculo);
		final int EXPECTED_LENGTH = 1;
		int resultado = CAFE.listarArtistasComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado >EXPECTED_LENGTH);
	}
	
	@Test
	void listarArtistasTest() {
		CAFE.seleccionaPlataforma(nombrePlataforma);
		CAFE.seleccionaEspectaculo(nombreEspectaculo);
		final int EXPECTED_LENGTH = 1;
		int resultado = CAFE.listarArtistas().size();
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}
}
