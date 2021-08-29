package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import interfaces.IControladorConsultaDeEspectaculo;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaDeEspectaculo extends JInternalFrame {
	private IControladorConsultaDeEspectaculo iccde;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDeEspectaculo frame = new ConsultaDeEspectaculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public ConsultaDeEspectaculo(IControladorConsultaDeEspectaculo iccde) {
		this.iccde = iccde;
		setBounds(100, 100, 450, 343);
		getContentPane().setLayout(null);
		
		JComboBox comboBoxPlataformas = new JComboBox();
		comboBoxPlataformas.setBounds(10, 57, 167, 22);
		getContentPane().add(comboBoxPlataformas);
		
		JComboBox comboBoxEspectaculos = new JComboBox();
		comboBoxEspectaculos.setBounds(10, 113, 167, 22);
		getContentPane().add(comboBoxEspectaculos);
		
		JLabel lblPlataforma = new JLabel("Seleccione Plataforma:");
		lblPlataforma.setBounds(10, 33, 133, 14);
		getContentPane().add(lblPlataforma);
		
		JLabel lblSeleccioneE = new JLabel("Seleccione Espectaculo");
		lblSeleccioneE.setBounds(10, 88, 133, 14);
		getContentPane().add(lblSeleccioneE);
		
		JLabel lblFunciones = new JLabel("Seleccione Funciones");
		lblFunciones.setBounds(10, 146, 133, 14);
		getContentPane().add(lblFunciones);
		
		JComboBox comboBoxFunciones = new JComboBox();
		comboBoxFunciones.setBounds(10, 171, 167, 22);
		getContentPane().add(comboBoxFunciones);
		
		JLabel lblSeleccioneE_2 = new JLabel("Seleccione Paquetes");
		lblSeleccioneE_2.setBounds(10, 207, 133, 14);
		getContentPane().add(lblSeleccioneE_2);
		
		JComboBox comboBoxPaquetes = new JComboBox();
		comboBoxPaquetes.setBounds(10, 232, 167, 22);
		getContentPane().add(comboBoxPaquetes);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(249, 37, 175, 230);
		getContentPane().add(textPane);
		
		JButton btnVerEspectaculo = new JButton("Ver");
	
		btnVerEspectaculo.setBounds(182, 113, 57, 23);
		getContentPane().add(btnVerEspectaculo);
		
		JButton btnVerFuncion = new JButton("Ver");

		btnVerFuncion.setBounds(182, 171, 57, 23);
		getContentPane().add(btnVerFuncion);
		
		JButton btnVerPaquete = new JButton("Ver");
		
		btnVerPaquete.setBounds(182, 232, 57, 23);
		getContentPane().add(btnVerPaquete);

		// EVENTOS
		btnVerEspectaculo.addActionListener(new ActionListener() {
			// BOTON VER ESPECTACULO
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnVerFuncion.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerPaquete.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
			}
		});
		// FIN DE EVENTOS
	}
	
	
	
	public void iniciarlizarComboBoxPlataforma() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<Integer>(iccde.listarClases());
		comboBoxIDClase.setModel(modelclases);
	}
	public void iniciarlizarComboBoxEspectaculos() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<Integer>(iccde.listarClases());
		comboBoxIDClase.setModel(modelclases);
	}
	public void iniciarlizarComboBoxFunciones() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<Integer>(iccde.listarClases());
		comboBoxIDClase.setModel(modelclases);
	}
	public void iniciarlizarComboBoxPaquetes() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<Integer>(iccde.listarClases());
		comboBoxIDClase.setModel(modelclases);
	}
}
