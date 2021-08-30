package presentacion;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import interfaces.Fabrica;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeEspectaculo;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmCoronatickets;

	
	// VARIABLES DE INTERFACE DE VISTAS
	private AltaUsuario altaUsuarioInternalFrame;
	private ConsultaDeEspectaculo consultaDeEspectaculoInternalFrame;
	private ConsultaDefuncionDeEspetaculo consultaDefuncionDeEspetaculoInternalFrame;
	// FIN DE VARIABLES DE INTERFACE DE VISTAS
	
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
		//
		Fabrica fabrica = Fabrica.getInstancia();
		IControladorAltaDeUsuario icau = fabrica.getIControladorAltaDeUsuario();
		IControladorConsultaDeEspectaculo iccde = fabrica.getIControladorConsultaDeEspectaculo();
		IControladorConsultaDeFuncionDeEspectaculo iccdfe = fabrica.getIControladorConsultaDeFuncionDeEspectaculo();
		
		
		Dimension desktopSize = frmCoronatickets.getSize();
		Dimension jInternalFrameSize;
		
		//DIMENCIONAR LA VENTANA DE ALTA USUARIO
		altaUsuarioInternalFrame = new AltaUsuario(icau);
		jInternalFrameSize = altaUsuarioInternalFrame.getSize();
		altaUsuarioInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		altaUsuarioInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(altaUsuarioInternalFrame);
		
		//FIN DIMENCIONAR LA VENTANA DE ALTA USUARIO
		
		//DIMENCIONAR LA VENTANA DE CONSULTA DE ESPECTACULO
		consultaDeEspectaculoInternalFrame = new ConsultaDeEspectaculo(iccde);
		jInternalFrameSize = consultaDeEspectaculoInternalFrame.getSize();
		consultaDeEspectaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDeEspectaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDeEspectaculoInternalFrame);
		
		//FIN DIMENCIONAR LA VENTANA DE CONSULTA DE ESPECTACULO
		

		//DIMENCIONAR LA VENTANA DE CONSULTA DE FUNCION DE ESPECTACULO
		consultaDefuncionDeEspetaculoInternalFrame = new ConsultaDefuncionDeEspetaculo(iccdfe);
		jInternalFrameSize = consultaDefuncionDeEspetaculoInternalFrame.getSize();
		consultaDefuncionDeEspetaculoInternalFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
		    (desktopSize.height- jInternalFrameSize.height)/2);
		consultaDefuncionDeEspetaculoInternalFrame.setVisible(false);
		frmCoronatickets.getContentPane().add(consultaDefuncionDeEspetaculoInternalFrame);
		
		//FIN DIMENCIONAR LA VENTANA DE CONSULTA DE  FUNCION DE ESPECTACULO
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCoronatickets = new JFrame();
		frmCoronatickets.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bruno.garcia\\Desktop\\descarga.png"));
		frmCoronatickets.setTitle("CoronaTickets");
		frmCoronatickets.setBounds(100, 100, 450, 300);
		frmCoronatickets.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoronatickets.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmCoronatickets.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioInternalFrame.setVisible(false);
				consultaDeEspectaculoInternalFrame.setVisible(false);
				consultaDefuncionDeEspetaculoInternalFrame.setVisible(false);
			}
		});
		menuBar.add(mnInicio);
		
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
		mnAltas.add(mnAltaEspectaculo);
		
		JMenuItem mnAltaFuncionDeEspectaculo = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnAltas.add(mnAltaFuncionDeEspectaculo);
		
		JMenuItem mnAltaPlataforma = new JMenuItem("Plataforma");
		mnAltas.add(mnAltaPlataforma);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenuItem mnConsultarUsuario = new JMenuItem("Usuario");
		mnConsultar.add(mnConsultarUsuario);
		
		JMenuItem mnConsultarEspectaculo = new JMenuItem("Espect\u00E1culo");
		mnConsultarEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaDeEspectaculoInternalFrame.iniciarlizarComboBoxPlataforma();
				consultaDeEspectaculoInternalFrame.setVisible(true);
			}
		});
		mnConsultar.add(mnConsultarEspectaculo);
		
		JMenuItem mnConsultarFuncionDeEspectaculo = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnConsultarFuncionDeEspectaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaDefuncionDeEspetaculoInternalFrame.setVisible(false);
				
			}
		});
		mnConsultar.add(mnConsultarFuncionDeEspectaculo);
		
		JMenuItem mnConsultarPaqueteDeEspectaculos = new JMenuItem("Paquete de Espect\u00E1culos");
		mnConsultar.add(mnConsultarPaqueteDeEspectaculos);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenuItem mnModificarUsuario = new JMenuItem("Usuario");
		mnModificar.add(mnModificarUsuario);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenuItem mnIngresarPaqueteDeEspectaculos = new JMenuItem("Paquete de Espect\u00E1culos");
		mnIngresar.add(mnIngresarPaqueteDeEspectaculos);
		
		JMenuItem mnIngresarEspectaculoAPaquete = new JMenuItem("Espect\u00E1culo a Paquete");
		mnIngresar.add(mnIngresarEspectaculoAPaquete);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		menuBar.add(mnRegistrar);
		
		JMenuItem mnRegistrarAFuncionDeEspectaculo = new JMenuItem("A Funci\u00F3n de Espect\u00E1culo");
		mnRegistrar.add(mnRegistrarAFuncionDeEspectaculo);
	}
}
