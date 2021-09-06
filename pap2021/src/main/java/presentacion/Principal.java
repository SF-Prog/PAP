package presentacion;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import interfaces.Fabrica;
import interfaces.IControladorAgregarEspectaculoAPaqueteDeEspectaculos;
import interfaces.IControladorAltaDeEspectaculo;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import interfaces.IControladorAltaDePlataforma;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeEspectaculo;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;
import interfaces.IControladorConsultaDePaqueteDeEspectaculos;
import interfaces.IControladorConsultaDeUsuario;
import interfaces.IControladorCrearPaqueteDeEspectaculos;
import interfaces.IControladorModificarDatosDeUsuario;
import interfaces.IControladorRegistroAFuncionDeEspectaculo;

public class Principal {
	private JFrame frmCoronatickets;
	
	private AltaUsuario altaUsuarioInternalFrame;
	private AltaEspectaculo altaEspectaculoInternalFrame;
	private AltaFuncionDeEspectaculo altaFuncionDeEspectaculoInternalFrame;
	private AltaPlataforma altaPlataformaInternalFrame; /*
	private ConsultaDeUsuario consultaDeUsuarioInternalFrame; */
	private ConsultaDeEspectaculo consultaDeEspectaculoInternalFrame;
	private ConsultaDeFuncionDeEspectaculo consultaDeFuncionDeEspectaculoInternalFrame; /*
	private ConsultaDePaqueteDeEspectaculos consultaDePaqueteDeEspectaculosInternalFrame;
	private ModificarDatosDeUsuario modificarDatosDeUsuarioInternalFrame;
	private IngresarPaqueteDeEspectaculos ingresarPaqueteDeEspectaculosInternalFrame;
	private IngresarEspectaculoAPaquete ingresarEspectaculoAPaqueteInternalFrame;
	private RegistrarAFuncionDeEspectaculo registrarAFuncionDeEspectaculoInternalFrame; */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmCoronatickets.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		initialize();

		Fabrica fabrica = Fabrica.getInstancia();
		IControladorAltaDeUsuario icau = fabrica.getIControladorAltaDeUsuario();
		IControladorAltaDeEspectaculo icae = fabrica.getIControladorAltaDeEspectaculo();
		IControladorAltaDeFuncionDeEspectaculo icafe = fabrica.getIControladorAltaDeFuncionDeEspectaculo();
		IControladorAltaDePlataforma icap = fabrica.getIControladorAltaDePlataforma(); /*
		IControladorConsultaDeUsuario iccdu = fabrica.getIControladorConsultaDeUsuario(); */
		IControladorConsultaDeEspectaculo iccde = fabrica.getIControladorConsultaDeEspectaculo();
		IControladorConsultaDeFuncionDeEspectaculo iccdfe = fabrica.getIControladorConsultaDeFuncionDeEspectaculo(); /*
		IControladorConsultaDePaqueteDeEspectaculos iccdpe = fabrica.getIControladorConsultaDePaqueteDeEspectaculos();
		IControladorModificarDatosDeUsuario icmdu = fabrica.getIControladorModificarDatosDeUsuario();
		IControladorCrearPaqueteDeEspectaculos iccpe = fabrica.getIControladorCrearPaqueteDeEspectaculos();
		IControladorAgregarEspectaculoAPaqueteDeEspectaculos icaep = fabrica.getIControladorAgregarEspectaculoAPaqueteDeEspectaculos();
		IControladorRegistroAFuncionDeEspectaculo icrfe = fabrica.getIControladorRegistroAFuncionDeEspectaculo(); */
		
		Dimension desktopSize = frmCoronatickets.getSize();
		Dimension jInternalFrameSize;
		
		altaUsuarioInternalFrame = new AltaUsuario(icau);
		jInternalFrameSize = altaUsuarioInternalFrame.getSize();
		altaUsuarioInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		altaUsuarioInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(altaUsuarioInternalFrame);

		altaEspectaculoInternalFrame = new AltaEspectaculo(icae);
		jInternalFrameSize = altaEspectaculoInternalFrame.getSize();
		altaEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		altaEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(altaEspectaculoInternalFrame);

		altaFuncionDeEspectaculoInternalFrame = new AltaFuncionDeEspectaculo(icafe);
		jInternalFrameSize = altaFuncionDeEspectaculoInternalFrame.getSize();
		altaFuncionDeEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		altaFuncionDeEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(altaFuncionDeEspectaculoInternalFrame);

		altaPlataformaInternalFrame = new AltaPlataforma(icap);
		jInternalFrameSize = altaPlataformaInternalFrame.getSize();
		altaPlataformaInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		altaPlataformaInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(altaPlataformaInternalFrame); /*

		consultaDeUsuarioInternalFrame = new ConsultaDeUsuario(iccdu);
		jInternalFrameSize = consultaDeUsuarioInternalFrame.getSize();
		consultaDeUsuarioInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDeUsuarioInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDeUsuarioInternalFrame); */
		
		consultaDeEspectaculoInternalFrame = new ConsultaDeEspectaculo(iccde);
		jInternalFrameSize = consultaDeEspectaculoInternalFrame.getSize();
		consultaDeEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDeEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDeEspectaculoInternalFrame);
		
		consultaDeFuncionDeEspectaculoInternalFrame = new ConsultaDeFuncionDeEspectaculo(iccdfe);
		jInternalFrameSize = consultaDeFuncionDeEspectaculoInternalFrame.getSize();
		consultaDeFuncionDeEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDeFuncionDeEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDeFuncionDeEspectaculoInternalFrame); /*
		
		consultaDePaqueteDeEspectaculosInternalFrame = new ConsultaDePaqueteDeEspectaculos(iccdpe);
		jInternalFrameSize = consultaDePaqueteDeEspectaculosInternalFrame.getSize();
		consultaDePaqueteDeEspectaculosInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDePaqueteDeEspectaculosInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDePaqueteDeEspectaculosInternalFrame);
		
		modificarDatosDeUsuarioInternalFrame = new ModificarDatosDeUsuario(icmdu);
		jInternalFrameSize = modificarDatosDeUsuarioInternalFrame.getSize();
		modificarDatosDeUsuarioInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		modificarDatosDeUsuarioInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(modificarDatosDeUsuarioInternalFrame);
		
		ingresarPaqueteDeEspectaculosInternalFrame = new IngresarPaqueteDeEspectaculos(iccpe);
		jInternalFrameSize = ingresarPaqueteDeEspectaculosInternalFrame.getSize();
		ingresarPaqueteDeEspectaculosInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		ingresarPaqueteDeEspectaculosInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(ingresarPaqueteDeEspectaculosInternalFrame);
		
		ingresarEspectaculoAPaqueteInternalFrame = new IngresarEspectaculoAPaquete(icaep);
		jInternalFrameSize = ingresarEspectaculoAPaqueteInternalFrame.getSize();
		ingresarEspectaculoAPaqueteInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		ingresarEspectaculoAPaqueteInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(ingresarEspectaculoAPaqueteInternalFrame);
		
		registrarAFuncionDeEspectaculoInternalFrame = new RegistrarAFuncionDeEspectaculo(icrfe);
		jInternalFrameSize = registrarAFuncionDeEspectaculoInternalFrame.getSize();
		registrarAFuncionDeEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		registrarAFuncionDeEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(registrarAFuncionDeEspectaculoInternalFrame); */
	}

	private void initialize() {
		frmCoronatickets = new JFrame();
		frmCoronatickets.setTitle("CoronaTickets");
		frmCoronatickets.setBounds(200, 200, 900, 600);
		frmCoronatickets.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoronatickets.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmCoronatickets.setJMenuBar(menuBar);
		
		JMenu mnAltas = new JMenu("Alta");
		menuBar.add(mnAltas);		

		JMenuItem mnAltaUsuario = new JMenuItem("Usuario");
		mnAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioInternalFrame.setVisible(true);				
			}
		});
		mnAltas.add(mnAltaUsuario);
		
		JMenuItem mnAltaEspectaculo = new JMenuItem("Espect\u00E1culo");
		mnAltaEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaEspectaculoInternalFrame.inicializarComboBoxes();
				altaEspectaculoInternalFrame.setVisible(true);				
			}
		});
		mnAltas.add(mnAltaEspectaculo);
		
		JMenuItem mnAltaFuncionDeEspectaculo = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnAltaFuncionDeEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaFuncionDeEspectaculoInternalFrame.inicializarComboBoxPlataforma();
				altaFuncionDeEspectaculoInternalFrame.setVisible(true);				
			}
		});
		mnAltas.add(mnAltaFuncionDeEspectaculo);
		
		JMenuItem mnAltaPlataforma = new JMenuItem("Plataforma");
		mnAltaPlataforma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaPlataformaInternalFrame.setVisible(true);				
			}
		});
		mnAltas.add(mnAltaPlataforma);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenuItem mnConsultarUsuario = new JMenuItem("Usuario");
		mnAltaEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//consultaDeUsuarioInternalFrame.setVisible(true);				
			}
		});
		mnConsultar.add(mnConsultarUsuario);
		
		JMenuItem mnConsultarEspectaculo = new JMenuItem("Espect\u00E1culo");
		mnConsultarEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaDeEspectaculoInternalFrame.inicializarComboBoxPlataforma();
				consultaDeEspectaculoInternalFrame.setVisible(true);
			}
		});		
		mnConsultar.add(mnConsultarEspectaculo);
		
		JMenuItem mnConsultarFuncionDeEspectaculo = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnConsultarFuncionDeEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaDeFuncionDeEspectaculoInternalFrame.setVisible(true);				
			}
		});
		mnConsultar.add(mnConsultarFuncionDeEspectaculo);
		
		JMenuItem mnConsultarPaqueteDeEspectaculos = new JMenuItem("Paquete de Espect\u00E1culos");
		mnConsultarPaqueteDeEspectaculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//consultaDePaqueteDeEspectaculosInternalFrame.setVisible(true);				
			}
		});
		mnConsultar.add(mnConsultarPaqueteDeEspectaculos);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenuItem mnModificarUsuario = new JMenuItem("Usuario");
		mnModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//modificarDatosDeUsuarioInternalFrame.setVisible(true);				
			}
		});
		mnModificar.add(mnModificarUsuario);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenuItem mnIngresarPaqueteDeEspectaculos = new JMenuItem("Paquete de Espect\u00E1culos");
		mnIngresarPaqueteDeEspectaculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ingresarPaqueteDeEspectaculosInternalFrame.setVisible(true);				
			}
		});
		mnIngresar.add(mnIngresarPaqueteDeEspectaculos);
		
		JMenuItem mnIngresarEspectaculoAPaquete = new JMenuItem("Espect\u00E1culo a Paquete");
		mnIngresarEspectaculoAPaquete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ingresarEspectaculoAPaqueteInternalFrame.setVisible(true);				
			}
		});
		mnIngresar.add(mnIngresarEspectaculoAPaquete);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		menuBar.add(mnRegistrar);
		
		JMenuItem mnRegistrarAFuncionDeEspectaculo = new JMenuItem("A Funci\u00F3n de Espect\u00E1culo");
		mnRegistrarAFuncionDeEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//registrarAFuncionDeEspectaculoInternalFrame.setVisible(true);				
			}
		});
		mnRegistrar.add(mnRegistrarAFuncionDeEspectaculo);
		
		frmCoronatickets.setLocationRelativeTo(null);
	}
}
