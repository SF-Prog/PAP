package logica.controladores;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@SelectClasses({ControladorAltaDeUsuario.class, ControladorAltaDePlataforma.class})
public class cubrimientoTest {
}