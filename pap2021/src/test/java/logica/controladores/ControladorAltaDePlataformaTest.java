package logica.controladores;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import datatypes.DtPlataforma;
import excepciones.AltaPlataformaExcepcion;

class ControladorAltaDePlataformaTest {
	ControladorAltaDePlataforma CAP = new ControladorAltaDePlataforma();
//	static <T extends Throwable>T assertThrows(Class<T> expectedType, Executable executable){};
	@Test
	void noExistePlataformaTest() {
		assertFalse(CAP.existePlataforma("inexistentePlataforma"));
	}
	
	@Test
	void existePlataformaTest() {
		String nombrePlataforma = "NombrePlataforma";
		DtPlataforma dtPlataforma = new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { CAP.ingresaPlataforma(dtPlataforma); } catch(AltaPlataformaExcepcion ape) {};
		assertTrue(CAP.existePlataforma(nombrePlataforma));
	}
	
	@Test
	void ingresaPlataformaSuccessTest() {
		String nombrePlataforma = "Nombre2Plataforma";
		DtPlataforma dtPlataforma = new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { CAP.ingresaPlataforma(dtPlataforma); } catch(AltaPlataformaExcepcion ape) {};
		assertTrue(CAP.existePlataforma(nombrePlataforma));
	}
	
	@Test
	void ingresaPlataformaExistenteTest() {
		String nombrePlataforma = "Nombre3Plataforma";
		DtPlataforma dtPlataforma = new DtPlataforma(nombrePlataforma, "descripcion", 10, "1", "100", "https://google.com", 10, "1/1/2020");
		try { CAP.ingresaPlataforma(dtPlataforma); } catch(AltaPlataformaExcepcion ape) {};
		assertThrows(AltaPlataformaExcepcion.class, () ->  CAP.ingresaPlataforma(dtPlataforma));
	}
}
