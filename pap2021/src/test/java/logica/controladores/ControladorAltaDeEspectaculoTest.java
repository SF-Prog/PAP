package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import datatypes.DtEspectaculo;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;

class ControladorAltaDeEspectaculoTest {
	ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
	ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
	ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
	Date date = new Date();
	String nombrePlataforma = "NombrePlataformaCAEE";
	String nombrePlataforma2 = "NombrePlataforma2CAEE";
	String nicknameArtista1 = "artistaTestCAEE";
	String emailArtista1 = "artista@test.comCAEE";
	String nicknameArtista2 = "artistaTest2CAEE";
	String emailArtista2 = "artista2@test.comCAEE";
	
	@SuppressWarnings("unused")
	@BeforeAll
	public static void initialization() {
		ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
		ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
		ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
		Date date = new Date();
		String nombrePlataforma = "NombrePlataformaCAEE";
		String nombrePlataforma2 = "NombrePlataforma2CAEE";
		String nicknameArtista1 = "artistaTestCAEE";
		String emailArtista1 = "artista@test.comCAEE";
		String nicknameArtista2 = "artistaTest2CAEE";
		String emailArtista2 = "artista2@test.comCAEE";
		DtPlataforma dtPlataforma = new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { CAP.ingresaPlataforma(dtPlataforma); } catch(AltaPlataformaExcepcion ape) {};
		
		DtPlataforma dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { CAP.ingresaPlataforma(dtPlataforma2); } catch(AltaPlataformaExcepcion ape) {};
		
		DtUsuario dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		
		String nickname2 = "artista2TestCAEE";
		String email2 = "artista2@test.comCAEE";
		DtUsuario dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista2, "descripcion", "biografia", "link");
	}
	
	@Test
	void listarPlataformasExistentesTest() {
		String[] resultadoEsperado = new String[2];
		resultadoEsperado[0] = nombrePlataforma;
		resultadoEsperado[1] = nombrePlataforma2;
		assertTrue(1 < CAE.listarPlataformas().length);
	};
	
	@Test
	void listarArtistasExistentesTest() {
		String[] resultadoEsperado = new String[2];
		resultadoEsperado[0] = nicknameArtista1;
		resultadoEsperado[1] = nicknameArtista2;
		assertTrue(1 < CAE.listarArtistas().length);
	};
	
	@Test
	void existeEspectaculoInexistenteTest() {
		assertFalse(CAE.existeEspectaculo(nombrePlataforma, "inexistente"));
	}
	
	@Test
	void existeEspectaculoSuccessTest() {
		String nombreEspectaculo = "nombreEspectaculoCAEE";
		DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspectaculo, "descripcion", 100, 1, 10, "url", 15, date, "imagen", nicknameArtista1);
		try {
			CAE.ingresaEspectaculo(nombrePlataforma, nicknameArtista1, dtEspectaculo);
		} catch(AltaEspectaculoExcepcion e) {};
		assertTrue(CAE.existeEspectaculo(nombrePlataforma, nombreEspectaculo));
	}
	
	@Test
	void existeEspectaculoErrorTest() {
		String nombreEspectaculo = "nombreEspectaculoCAEE";
		DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspectaculo, "descripcion", 100, 1, 10, "url", 15, date, "imagen", nicknameArtista1);
		try {
			CAE.ingresaEspectaculo(nombrePlataforma, nicknameArtista1, dtEspectaculo);
		} catch(AltaEspectaculoExcepcion e) {};
		assertThrows(AltaEspectaculoExcepcion.class, () -> CAE.ingresaEspectaculo(nombrePlataforma, nicknameArtista1, dtEspectaculo));	
	}	
 }