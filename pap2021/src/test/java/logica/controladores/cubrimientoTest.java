package logica.controladores;
/*
import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ControladorAltaDeUsuarioTest.class, ControladorAltaDePlataformaTest.class})
public class cubrimientoTest {
}*/
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ControladorAltaDeEspectaculoTest.class,
	ControladorAltaDeFuncionDeEspectaculoTest.class,
	ControladorAltaDePlataformaTest.class,
	ControladorAltaDeUsuarioTest.class,
	ControladorConsultaDeEspectaculoTest.class,
	ControladorConsultaDeFuncionDeEspectaculoTest.class,
	ControladorConsultaDeUsuarioTest.class,
	ControladorModificarDatosDeUsuarioTest.class,
	ControladorRegistroAFuncionDeEspectaculoTest.class})
public class cubrimientoTest {

}




