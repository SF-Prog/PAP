package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datatypes.DtUsuario;
import logica.Usuario;

public class ControladorConsultaDeUsuarioTest {
	ControladorAltaDeUsuario CAU;
	ControladorConsultaDeUsuario CCU;

	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		CCU = new ControladorConsultaDeUsuario();
	}

	@Test
	void listarUsuariosTest() {		
		ArrayList<Usuario> usuarios = CCU.listarUsuarios();
		assertTrue(usuarios.size()> 0);
	}
	
	/*
	 * @Test
	void listarUsuariosTest() {		
		ArrayList<Usuario> usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), 0);

		String espectador = "espectadorTestCCU";
		String emaile = "espectador@test.comCCU";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, new Date(), "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);

		usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), 1);
		
		String artista = "artistaTestCCU";
		String emaila = "artista@test.comCCU";
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, new Date(), "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");

		usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), 2);
	}
	 */
	
}
