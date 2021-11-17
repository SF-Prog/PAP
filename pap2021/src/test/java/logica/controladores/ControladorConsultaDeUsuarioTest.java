package logica.controladores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
	int cantUsuariosActuales;

	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		CCU = new ControladorConsultaDeUsuario();
		cantUsuariosActuales = CCU.listarUsuarios().size();
	}
	
	@Test
	void listarUsuariosTest() {
		ArrayList<Usuario> usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), cantUsuariosActuales);

		String espectador = "espectadorTestCCU";
		String emaile = "espectador@test.comCCU";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, new Date(), "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);

		usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), cantUsuariosActuales + 1);
		
		String artista = "artistaTestCCU";
		String emaila = "artista@test.comCCU";
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, new Date(), "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");

		usuarios = CCU.listarUsuarios();
		assertEquals(usuarios.size(), cantUsuariosActuales + 2);
	}
	
	@Test
	void seleccionaUsuarioTest() {
		assertNull(CCU.seleccionaUsuario("nickname"));
	}
	
	@Test
	void listaInfoEspectaculosTest() {
		assertNull(CCU.listaInfoEspectaculos("nickname"));
	}
	
	@Test
	void listaInfoFuncionesTest() {
		assertNull(CCU.listaInfoFunciones("nickname"));
	}
}
