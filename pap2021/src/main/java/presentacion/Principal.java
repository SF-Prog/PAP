package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Principal {

	private JFrame frmCoronatickets;

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
		
		JMenu mnAltas = new JMenu("Alta");
		menuBar.add(mnAltas);
		
		JMenuItem mnAltaUsuario = new JMenuItem("Usuario");
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
		mnConsultar.add(mnConsultarEspectaculo);
		
		JMenuItem mnConsultarFuncionDeEspectaculo = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
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
