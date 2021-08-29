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
		
		JMenu mnNewMenu = new JMenu("Alta");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Usuario");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Espect\u00E1culo");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Plataforma");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Consultar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Usuario");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Espect\u00E1culo");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Funci\u00F3n de Espect\u00E1culo");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Paquete de Espect\u00E1culos");
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_2 = new JMenu("Modificar");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Usuario");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_4 = new JMenu("Ingresar");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Paquete de Espect\u00E1culos");
		mnNewMenu_4.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Espect\u00E1culo a Paquete");
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_3 = new JMenu("Registrar");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("A Funci\u00F3n de Espect\u00E1culo");
		mnNewMenu_3.add(mntmNewMenuItem_8);
	}
}
