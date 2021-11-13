package logica.controladores;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> 184d39e935df982a576925cb59eba5bf939066b1
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import excepciones.AltaEspectaculoExcepcion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import excepciones.AltaPlataformaExcepcion;
public class ControladorConsultaDeFuncionDeEspectaculoTest {
	ControladorConsultaDeFuncionDeEspectaculo CCFE = new ControladorConsultaDeFuncionDeEspectaculo();
	ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
	ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
	ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
	ControladorAltaDeFuncionDeEspectaculo CAFE = new ControladorAltaDeFuncionDeEspectaculo();
	Date date = new Date();
	
	String nombrePlataforma = "NombrePlataformaCCFDE";
	String nombrePlataforma2 = "NombrePlataforma2CCFDE";
	String nicknameArtista1 = "artistaTestCCFDE";
	String emailArtista1 = "artista@test.comCCFDE";
	String nicknameArtista2 = "artistaTest2CCFDE";
	String emailArtista2 = "artista2@test.comCCFDE";
	DtPlataforma dtPlataforma =  new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
	DtPlataforma dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
	DtUsuario dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
	DtUsuario dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
	String nombreEspctaculo = "nombre espctaculoCCFDE";
	DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspctaculo, "descripcion", 90, 10, 20,"url", 20, date, "img");
	String nombreEspctaculo2 = "nombre espctaculo2CCFDE";
	DtEspectaculo dtEspectaculo2 = new DtEspectaculo(nombreEspctaculo2, "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
	String nombrefuncion = "nombre funcionCCFDE";
	DtFuncion dFuncion = new DtFuncion(nombrefuncion, date, "00:00:00", date, "img");
	@BeforeAll
	public static void inicializarTest() {
		ControladorAltaDeEspectaculo CAE = new ControladorAltaDeEspectaculo();
		ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
		ControladorAltaDeUsuario CAU = new ControladorAltaDeUsuario();
		ControladorAltaDeFuncionDeEspectaculo CAFE = new ControladorAltaDeFuncionDeEspectaculo();
		
		Date date = new Date();
		
		String nombrePlataforma = "NombrePlataformaCCFDE";
		String nombrePlataforma2 = "NombrePlataforma2CCFDE";
		String nicknameArtista1 = "artistaTestCCFDE";
		String emailArtista1 = "artista@test.comCCFDE";
		String nicknameArtista2 = "artistaTest2CCFDE";
		String emailArtista2 = "artista2@test.comCCFDE";
		DtPlataforma dtPlataforma =  new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		DtPlataforma dtPlataforma2 = new DtPlataforma(nombrePlataforma2, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		DtUsuario dtArtista = new DtUsuario(nicknameArtista1, "nombre", "apellido", emailArtista1, date, "password", "urlImage");
		DtUsuario dtArtista2 = new DtUsuario(nicknameArtista2, "nombre", "apellido", emailArtista2, date, "password", "urlImage");
		String nombreEspctaculo = "nombre espctaculoCCFDE";
		DtEspectaculo dtEspectaculo = new DtEspectaculo(nombreEspctaculo, "descripcion", 90, 10, 20,"url", 20, date, "img");
		String nombreEspctaculo2 = "nombre espctaculo2CCFDE";
		DtEspectaculo dtEspectaculo2 = new DtEspectaculo(nombreEspctaculo2, "descripcion2", 92 ,12, 22,"url2", 22 ,date, "img2");
		String nombrefuncion = "nombre funcionCCFDE";
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
		
		
		dFuncion = new DtFuncion("nombre funcion", date, "00:00:00", date, "img");
		try {
			CAFE.seleccionaPlataforma(nombrePlataforma);
			CAFE.seleccionaEspectaculo("nombre espctaculo");
			CAFE.ingresaFuncion(dFuncion, artistasInvitados);
		} catch (AltaFuncionDeEspectaculoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void listarPlataformasLleno() {
		final int EXPECTED_LENGTH = 1;
		System.out.print( CCFE.listarPlataformas());
		int resultado = CCFE.listarPlataformas().size();
		
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}
	
	@Test
	void  listarPlataformasComboBoxLLeno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCFE.listarPlataformasComboBox().length;
		
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
		
	}///*
	
	@Test
	void  seleccionaPlataforma() {
		DtPlataforma plataforma = CCFE.seleccionaPlataforma(nombrePlataforma);
		DtPlataforma dtPlataforma =  new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");;
		assertEquals(plataforma.getNombre(), dtPlataforma.getNombre());

	}//*/
	
	@Test
	void  listarEspectaculosComboBoxLleno(){
		CCFE.seleccionaPlataforma(nombrePlataforma);
		final int EXPECTED_LENGTH = 1;
		int resultado = CCFE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}//*/
	
	@Test
	void  listarEspectaculosLlena(){
		CCFE.seleccionaPlataforma(nombrePlataforma);
		assertNotNull(CCFE.listarEspectaculos());
	}//*/

	@Test
	void seleccionaEspectaculo() {
		//DtEspectaculo(String nombre, String descripcion, int duracion, int espectadoresMin, int espectadoresMax,String urlAsociada, float costo, Date fechaRegistro, String image)
		//Date fecha = new Date();
		//DtEspectaculo dtEspectaculo = new DtEspectaculo("nombre espctaculo", "descripcion", 90, 10, 20,"url", 20, fecha, "img");
		CCFE.seleccionaPlataforma(nombrePlataforma);
		assertEquals(CCFE.seleccionaEspectaculo(nombreEspctaculo).getNombre(), dtEspectaculo.getNombre());
	}//*/
	
	@Test
	void  listarFuncionesLleno() {
		CCFE.seleccionaPlataforma(nombrePlataforma);
		CCFE.seleccionaEspectaculo("nombre espctaculo");
		assertNotNull(CCFE.listarFunciones());
	}//*/
	
	@Test
	void  listarFuncionesComboBoxLleno() {
		CCFE.seleccionaPlataforma(nombrePlataforma);
		CCFE.seleccionaEspectaculo(nombreEspctaculo);
		final int EXPECTED_LENGTH = 1;
		int resultado = CCFE.listarFuncionesComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado >EXPECTED_LENGTH);
	}//*/
	
	@Test
	void seleccionaFuncion() {	
		CCFE.seleccionaPlataforma(nombrePlataforma);
		CCFE.seleccionaEspectaculo("nombre espctaculo");
		DtFuncion Funcion = CCFE.seleccionaFuncion("nombre funcion");
		assertEquals(Funcion.getNombre(), dFuncion.getNombre());
		
	}//*/	
	


		
	@Test
	void listarArtistasInvitadosLLeno() {
		CCFE.seleccionaPlataforma(nombrePlataforma);
		CCFE.seleccionaEspectaculo(nombreEspctaculo);
		CCFE.seleccionaFuncion(nombrefuncion);
		final int EXPECTED_LENGTH = 1;
		int resultado = CCFE.listarArtistasInvitados().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado >EXPECTED_LENGTH);

	}//*/
	


	

}
