package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import interfaces.IControladorConsultaDeEspectaculo;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;

public class ConsultaDeEspectaculo extends JInternalFrame {
	private IControladorConsultaDeEspectaculo iccde;
	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxEspectaculos;
	private JComboBox<String> comboBoxFunciones;
	private JComboBox<String> comboBoxPaquetes;
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
		
		comboBoxPlataformas = new JComboBox();
		comboBoxPlataformas.setBounds(10, 57, 167, 22);
		getContentPane().add(comboBoxPlataformas);
		
		comboBoxEspectaculos = new JComboBox();
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
		
		comboBoxFunciones = new JComboBox();

		comboBoxFunciones.setBounds(10, 171, 167, 22);
		getContentPane().add(comboBoxFunciones);
		
		JLabel lblSeleccioneE_2 = new JLabel("Seleccione Paquetes");
		lblSeleccioneE_2.setBounds(10, 207, 133, 14);
		getContentPane().add(lblSeleccioneE_2);
		
		comboBoxPaquetes = new JComboBox();
		comboBoxPaquetes.setBounds(10, 232, 167, 22);
		getContentPane().add(comboBoxPaquetes);
		
		JButton btnVerEspectaculo = new JButton("Ver");
	
		btnVerEspectaculo.setBounds(182, 113, 57, 23);
		getContentPane().add(btnVerEspectaculo);
		
		JButton btnVerFuncion = new JButton("Ver");

		btnVerFuncion.setBounds(182, 171, 57, 23);
		getContentPane().add(btnVerFuncion);
		
		JButton btnVerPaquete = new JButton("Ver");
		
		btnVerPaquete.setBounds(182, 232, 57, 23);
		getContentPane().add(btnVerPaquete);
		
		JButton btnTraerEspectaculos = new JButton("Traer");
		btnTraerEspectaculos.setBounds(187, 57, 72, 23);
		getContentPane().add(btnTraerEspectaculos);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(269, 37, 155, 230);
		getContentPane().add(textArea);

		// EVENTOS
		btnVerEspectaculo.addActionListener(new ActionListener() {
			// BOTON VER ESPECTACULO
			public void actionPerformed(ActionEvent e) {
				DtEspectaculo dtEspectaculo = iccde.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				textArea.setText(dtEspectaculo.toString());
			}
		});
		
		btnVerFuncion.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
				DtFuncion dtFuncion = iccde.seleccionaFuncion(comboBoxFunciones.getSelectedItem().toString());
				textArea.setText(dtFuncion.toString());
			}
		});
		btnVerPaquete.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
				DtPaquete dtPaquete = iccde.seleccionaPaquete(comboBoxPaquetes.getSelectedItem().toString());
				textArea.setText(dtPaquete.toString());
			}
		});



		comboBoxPlataformas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxEspectaculos.removeAllItems();
				iccde.seleccionaPlataforma(comboBoxPlataformas.getSelectedItem().toString());
				iniciarlizarComboBoxEspectaculos();
			}
		});
		comboBoxEspectaculos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxFunciones.removeAllItems();
				comboBoxPaquetes.removeAllItems();
				iccde.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				iniciarlizarComboBoxFunciones();
				iniciarlizarComboBoxPaquetes();
			}
		});
		/*comboBoxFunciones.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

			}
		});
		comboBoxPaquetes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				iccde.seleccionaPaquete(TOOL_TIP_TEXT_KEY)
			}
		});*/
		
		// FIN DE EVENTOS
	}
	

	public void iniciarlizarComboBoxPlataforma() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarPlataformasComboBox());
		comboBoxPlataformas.setModel(modelclases);
	}
	public void iniciarlizarComboBoxEspectaculos() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarEspectaculosComboBox());
		comboBoxEspectaculos.setModel(modelclases);
	}
	public void iniciarlizarComboBoxFunciones() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarFuncionesComboBox());
		comboBoxFunciones.setModel(modelclases);
	}
	public void iniciarlizarComboBoxPaquetes() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarPaquetesComboBox());
		comboBoxPaquetes.setModel(modelclases);
	}
}
