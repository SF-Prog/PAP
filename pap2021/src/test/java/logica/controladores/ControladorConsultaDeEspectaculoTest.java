package logica.controladores;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import logica.Espectaculo;
import logica.Funcion;
import logica.Paquete;
import logica.Plataforma;
import logica.manejadores.ManejadorPaquete;
import logica.manejadores.ManejadorPlataforma;
import logica.manejadores.ManejadorUsuario;
public class ControladorConsultaDeEspectaculoTest {
	ControladorConsultaDeEspectaculo CCE = new ControladorConsultaDeEspectaculo();
	
	@Test
	void listarPlataformasVacio() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPlataformas().size();
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);

	}

	@Test
	void listarPlataformasLleno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPlataformas().size();
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}

	
	@Test
	void  listarPlataformasComboBoxLLeno() {
		String[] resultadoEsperado = new String[1];
		resultadoEsperado[0]="";
		assertEquals(resultadoEsperado,CCE.listarPlataformasComboBox());
	}
	
	@Test
	void  listarPlataformasComboBoxVacio() {
		String[] resultadoEsperado = new String[1];
		resultadoEsperado[0]="";
		assertEquals(resultadoEsperado,CCE.listarPlataformasComboBox());
	}
	
	@Test
	void DtPlataforma seleccionaPlataforma(String nombre) {
		CCE.seleccionaPlataforma();
	}

	@Test
	void  listarEspectaculosLlena(){
		assertNotNull(CCE.listarEspectaculos());
	}
	@Test
	void  listarEspectaculosVacia(){
		assertNull(CCE.listarEspectaculos());
		
	}
	@Test
	void  listarEspectaculosComboBoxLleno(){
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);
	}
	
	@Test
	void  listarEspectaculosComboBoxVacio(){
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarEspectaculosComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);
	}


	@Test
	void DtEspectaculo seleccionaEspectaculo(String nombre) {
		CCE.seleccionaEspectaculo();
	}

	@Test
	void  listarFuncionesLleno() {
		assertNotNull(CCE.listarFunciones());
	}
	@Test
	void  listarFuncionesVacio() {
		assertNull(CCE.listarFunciones());	
	}

	@Test
	void  listarFuncionesComboBoxLleno() {
		assertNotNull(CCE.listarFuncionesComboBox());
	}
	
	@Test
	void listarFuncionesComboBoxVacio() {
		assertNull(CCE.listarFuncionesComboBox());	
	}
	
	@Test
	void DtFuncion seleccionaFuncion(String nombre) {
		CCE.seleccionaFuncion();
		
	}

	@Test
	void listarPaquetesLleno() {
		assertNotNull(CCE.listarPaquetes());
		
	}
	
	@Test
	void  listarPaquetesVacio() {
		assertNull(CCE.listarPaquetes());	
	}

	
	@Test
	void  listarPaquetesComboBoxLleno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPaquetesComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado > EXPECTED_LENGTH);

	}
	
	@Test
	void  listarPaquetesComboBoxVacio() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarPaquetesComboBox().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);
	}
	
	@Test
	void  seleccionaPaquete(String nombre) {
		CCE.seleccionaPaquete();
	}

	@Test
	void listarArtistasInvitadosLLeno() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarArtistasInvitados().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);

	}	
	
	@Test
	void  listarArtistasInvitadosVacio() {
		final int EXPECTED_LENGTH = 1;
		int resultado = CCE.listarArtistasInvitados().length;
	   // Use number.length to get the length of the array.
	   assertTrue(resultado == EXPECTED_LENGTH);
	}	

}
