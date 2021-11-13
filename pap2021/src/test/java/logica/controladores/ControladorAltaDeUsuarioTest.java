package logica.controladores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datatypes.DtUsuario;

class ControladorAltaDeUsuarioTest {
	ControladorAltaDeUsuario CAU;
	Date date;
	
	@BeforeEach
	void inicializacion() {
		CAU = new ControladorAltaDeUsuario();
		date = new Date();
	}
  //	@AfterEach
  //	@Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
  //	void timeout() {
  //		// Timeout
  //	}
	
	
	@Test
	void ingresarEspectadorSuccessTest() {
		String nickname = "espectadorTest";
		String email = "espectador@test.com";
		DtUsuario dtEspectador = new DtUsuario(nickname, "nombre", "apellido", email, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		// Valida que esxiste el Espectador ingresado por su nickname y su email.
		assertTrue(CAU.existeUsuarioPorNickname(nickname) && CAU.existeUsuarioPorEmail(email));
	}
	
	@Test
	void ingresarArtistaSuccessTest() {
		String nickname = "artistaTest";
		String email = "artista@test.com";
		DtUsuario dtArtista = new DtUsuario(nickname, "nombre", "apellido", email, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		// Valida que esxiste el Artista ingresado por su nickname y su email.
		assertTrue(CAU.existeUsuarioPorNickname(nickname) && CAU.existeUsuarioPorEmail(email));
	}
	
	
	
	@Test
	void noExisteUsuarioPorNickNameTest() {
		// Valida que si chequeo que un usuario inexistente existe, de false 
		assertFalse(CAU.existeUsuarioPorNickname("nicknameInexistente"));
	}
	
	@Test
	void noExisteUsuarioPorEmailTest() {
		// Valida que si chequeo que un usuario inexistente existe, de false 
		assertFalse(CAU.existeUsuarioPorEmail("emailInexistente"));
	}
	
	@Test
	void seguirUsuarioSuccessTest() {
		String espectador = "espectadorSUTest";
		String emaile = "espectadorSU@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista = "artistaSUTest";
		String emaila = "artistaSU@test.com";
		String[] resultadoEsperadoSeguidos = new String[1];
		resultadoEsperadoSeguidos[0] = artista;
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		try { 
			CAU.seguirUsuario(espectador, artista);
			assertTrue(CAU.checkSeguidor(espectador, artista));
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
		} catch (Exception e){};
	}
	
	@Test
	void usuarioInexistenteSeguidorTest() {
		String espectador = "espectadorSUE1Test";
		String emaile = "espectadorSUE1@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista = "artistaSUE1Test";
		String emaila = "artistaSUE1@test.com";
		String[] resultadoEsperadoSeguidos = new String[0];
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		try { 
			CAU.seguirUsuario("inexistente", artista);
		} catch (Exception e) {
			assertFalse(CAU.checkSeguidor(espectador, artista));
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
		};
	}
	
	@Test
	void usuarioInexistenteSeguidoTest() {
		String espectador = "espectadorSUE2Test";
		String emaile = "espectadorSUE2@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista = "artistaSUE2Test";
		String emaila = "artistaSUE2@test.com";
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, date, "password", "urlImage");
		String[] resultadoEsperadoSeguidos = new String[0];
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		try { 
			CAU.seguirUsuario(espectador, "inexistente");
		} catch (Exception e) {
			assertFalse(CAU.checkSeguidor(espectador, artista));
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
		};
	}
	
	@Test
	void usuarioYaSigueTest() {
		String espectador = "espectadorYETest";
		String emaile = "espectadorYE@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista = "artistaYETest";
		String emaila = "artistaYE@test.com";
		String[] resultadoEsperadoSeguidos = new String[1];
		resultadoEsperadoSeguidos[0] = artista;
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		try { CAU.seguirUsuario(espectador, artista); } catch (Exception e) {};
		try { 
			CAU.seguirUsuario(espectador, artista);
		} catch (Exception e) {
			// Este resultado es true por que ya lo sigue pero al estar dentro del catch
			// Validamos que la excepcion del controlador se disparo.
			assertTrue(CAU.checkSeguidor(espectador, artista));
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
		};
	}
	
	@Test
	void dejarDeSeguirSuccessTest() {
		String espectador = "espectadorDSSTest";
		String emaile = "espectadorDSS@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista1 = "artistaDSSTest";
		String emaila1 = "artistaDSS@test.com";
		DtUsuario dtArtista = new DtUsuario(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		String[] resultadoEsperadoSeguidos = new String[1];
		resultadoEsperadoSeguidos[0] = artista1;
		String artista2 = "artistaDSS2Test";
		String emaila2 = "artistaDSS2@test.com";
		DtUsuario dtArtista2 = new DtUsuario(artista2, "nombre", "apellido", emaila2, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista2, "descripcion", "biografia", "link");
		try { CAU.seguirUsuario(espectador, artista1); } catch (Exception e) {};
		try { CAU.seguirUsuario(espectador, artista2); } catch (Exception e) {};
		try { 
			CAU.dejarSeguirUsuario(espectador, artista2);
			assertTrue(CAU.checkSeguidor(espectador, artista1));
			assertFalse(CAU.checkSeguidor(espectador, artista2));
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
		} catch (Exception e) {};
	}
	
	@Test
	void dejarDeSeguirSeguidoInexistenteTest() {
		String espectador = "espectadorDSUITest";
		String emaile = "espectadorDSUI@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista1 = "artistaDSUITest";
		String emaila1 = "artistaDSUI@test.com";
		DtUsuario dtArtista = new DtUsuario(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		String[] resultadoEsperadoSeguidos = new String[1];
		resultadoEsperadoSeguidos[0] = artista1;
		try { CAU.seguirUsuario(espectador, artista1); } catch(Exception e) {};
		try { 
			CAU.dejarSeguirUsuario(espectador, "inexistente");
		} catch (Exception e) {
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
			assertFalse(CAU.checkSeguidor(espectador, "inexistente"));
		}
	}
	
	@Test
	void dejarDeSeguirSeguidorInexistenteTest() {
		String artista = "artistaDSUI2Test";
		String emaila = "artistaDSUI2@test.com";
		DtUsuario dtArtista = new DtUsuario(artista, "nombre", "apellido", emaila, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		String[] resultadoEsperadoSeguidos = new String[0];
		try { 
			CAU.dejarSeguirUsuario("inexistente", artista);
		} catch (Exception e) {
			assertFalse(CAU.checkSeguidor("inexistente", artista));
			assertArrayEquals(CAU.usuariosSeguidos("inexistente"), resultadoEsperadoSeguidos);
		}
	}
	
	@Test
	void dejarDeSeguirUsuarioQueNoSigueTest() {
		String espectador = "espectadorDSUI3Test";
		String emaile = "espectadorDSUI3@test.com";
		DtUsuario dtEspectador = new DtUsuario(espectador, "nombre", "apellido", emaile, date, "password", "urlImage");
		CAU.ingresaUsuarioEspectador(dtEspectador);
		String artista1 = "artistaDSUI3Test";
		String emaila1 = "artistaDSUI3@test.com";
		DtUsuario dtArtista = new DtUsuario(artista1, "nombre", "apellido", emaila1, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista, "descripcion", "biografia", "link");
		String artista2 = "artistaDSUI3.Test";
		String emaila2 = "artistaDSUI3.@test.com";
		DtUsuario dtArtista2 = new DtUsuario(artista2, "nombre", "apellido", emaila2, date, "password", "urlImage");
		CAU.ingresaUsuarioArtista(dtArtista2, "descripcion", "biografia", "link");
		String[] resultadoEsperadoSeguidos = new String[1];
		resultadoEsperadoSeguidos[0] = artista1;
		try { CAU.seguirUsuario(espectador, artista1); } catch(Exception e) {};
		try {
			CAU.dejarSeguirUsuario(espectador, artista2);
		} catch (Exception e) {
			assertArrayEquals(CAU.usuariosSeguidos(espectador), resultadoEsperadoSeguidos);
			assertTrue(CAU.checkSeguidor(espectador, artista1));
			assertFalse(CAU.checkSeguidor(espectador, artista2));
		}
	}

}
