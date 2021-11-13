package logica.controladores;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;
import logica.Espectaculo;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;
import logica.manejadores.ManejadorPaquete;
import logica.manejadores.ManejadorPlataforma;
import logica.manejadores.ManejadorUsuario;
public class ControladorConsultaDeEspectaculoTest {
	ControladorConsultaDeEspectaculo CCE = new ControladorConsultaDeEspectaculo();
	ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
	ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
	ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
	Date date = new Date();
	
	String nombrePlataforma = "NombrePlataforma";
	String nombrePlataforma2 = "NombrePlataforma2";
	String nicknameArtista1 = "artistaTest";
	String emailArtista1 = "artista@test.com";
	String nicknameArtista2 = "artistaTest2";
	String emailArtista2 = "artista2@test.com";
	DtPlataforma dtPlataforma = null;
	DtPlataforma dtPlataforma2 = null;
	DtUsuario dtArtista = null;
	DtUsuario dtArtista2 = null;
	DtEspectaculo dtEspectaculo = null;
	DtEspectaculo dtEspectaculo2 = null;
	
	@BeforeAll
	public static void inicializarTest() {
		ControladorConsultaDeEspectaculo CCE = new ControladorConsultaDeEspectaculo();
		ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
		ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
		ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
		Date date = new Date();
		
		String nombrePlataforma = "NombrePlataforma";
		String nombrePlataforma2 = "NombrePlataforma2";
		String nicknameArtista1 = "artistaTest";
		String emailArtista1 = "artista@test.com";
		String nicknameArtista2 = "artistaTest2";
		String emailArtista2 = "artista2@test.com";
		DtPlataforma dtPlataforma = null;
		DtPlataforma dtPlataforma2 = null;
		DtUsuario dtArtista = null;
		DtUsuario dtArtista2 = null;
		DtEspectaculo dtEspectaculo = null;
		DtEspectaculo dtEspectaculo2 = null;
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
		
		dtEspectaculo = new DtEspectaculo("nombre espctaculo", "descripcion", 90, 10, 20,"url", 20, date, "img");
		dtEspectaculo2 = new DtEspectaculo("nombre espctaculo2", "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
		
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
		//(String nombre, String descripcion, int duracion, String espectadoresMin, String espectadoresMax,	String URLAsociada, float costo, String fechaAlta)
		//Plataforma a = new Plataforma("plataforma", "descripcion", 90, "10", "100","url", 100, "20-2-2000");
}
	
	
	@Test
	void listarPlataformasLleno() {
		final int EXPECTED_LENGTH = 1;
		System.out.print( CCE.listarPlataformas());
		int resultado = CCE.listarPlataformas().size();
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}

	
	/*//@Test
	void  listarPlataformasComboBoxLLeno() {
		String[] resultadoEsperado = new String[1];
		resultadoEsperado[0]="";
		assertEquals(resultadoEsperado,CCE.listarPlataformasComboBox());
	}//*/
	
	
	/*//@Test
	void  seleccionaPlataforma() {
		System.out.println(nombrePlataforma);
		assertEquals(CCE.seleccionaPlataforma(nombrePlataforma), dtPlataforma);

	}//*/
	
	/*//@Test
	void  listarEspectaculosComboBoxLleno(){
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}//*/
	
	/*//@Test
	void  listarEspectaculosLlena(){
		assertNotNull(CCE.listarEspectaculos());
	}//*/

	/*//@Test
	void seleccionaEspectaculo() {
		//DtEspectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,String urlAsociada, float costo, Date fechaRegistro, String image)
		//Date fecha = new Date();
		//DtEspectaculo dtEspectaculo = new DtEspectaculo("nombre espctaculo", "descripcion", 90, 10, 20,"url", 20, fecha, "img");
		
		assertEquals(CCE.seleccionaEspectaculo("nombre espctaculo"), dtEspectaculo);
	}//*/
	
	/*//@Test
	void  listarFuncionesLleno() {
		assertNotNull(CCE.listarFunciones());
	}//*/
	
	/*//@Test
	void  listarFuncionesComboBoxLleno() {
		assertNotNull(CCE.listarFuncionesComboBox());
	}//*/
	
	/*//@Test
	void seleccionaFuncion() {
		Date fecha = new Date();
		DtFuncion dtFuncion = new DtFuncion();
		
		assertEquals(CCE.seleccionaFuncion("nombre funcion"), dtFuncion);
		
	}//*/	
	
	/*//@Test
	void listarPaquetesLleno() {
		assertNotNull(CCE.listarPaquetes());
		
	}//*/
	
	/*@Test
	void  listarPaquetesComboBoxLleno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPaquetesComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);

	}//*/
		
	/*@Test
	void listarArtistasInvitadosLLeno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarArtistasInvitados().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);

	}//*/
	

	
	
	/*@Test
	void listarPlataformasVacio() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPlataformas().size();
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);

	}//*/
	
	/*@Test
	void  listarPlataformasComboBoxVacio() {
		String[] resultadoEsperado = new String[1];
		resultadoEsperado[0]="";
		assertEquals(resultadoEsperado,CCE.listarPlataformasComboBox());
	}//*/
	
	/*@Test
	void  listarEspectaculosVacia(){
		assertNull(CCE.listarEspectaculos());
		
	}//*/
		

	/*@Test
	void  listarEspectaculosComboBoxVacio(){
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);
	}//*/
	
	/*@Test
	void  listarFuncionesVacio() {
		assertNull(CCE.listarFunciones());	
	}//*/

	/*@Test
	void listarFuncionesComboBoxVacio() {
		assertNull(CCE.listarFuncionesComboBox());	
	}//*/
	
	/*@Test
	void  listarPaquetesVacio() {
		assertNull(CCE.listarPaquetes());	
	}*/

	/*@Test
	void  listarPaquetesComboBoxVacio() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPaquetesComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);
	}*/
	
	/*@Test
	void  listarArtistasInvitadosVacio() {
		int resultado = CCE.listarArtistasInvitados().length;
	   // Use number.length to get the length of the array.
		assertNull(resultado);
	}*/	

}
