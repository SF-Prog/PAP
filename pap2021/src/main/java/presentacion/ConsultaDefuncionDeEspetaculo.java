package presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;

public class ConsultaDefuncionDeEspetaculo extends JInternalFrame {
	private IControladorConsultaDeFuncionDeEspectaculo iccdfe;
	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxEspectaculos;
	private JComboBox<String> comboBoxFunciones;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDefuncionDeEspetaculo frame = new ConsultaDefuncionDeEspetaculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ConsultaDefuncionDeEspetaculo(IControladorConsultaDeFuncionDeEspectaculo iccdfe) {
		this.iccdfe = iccdfe;
		setBounds(100, 100, 450, 300);getContentPane().setLayout(null);
		
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

		
		JButton btnVerEspectaculo = new JButton("Ver");
	
		btnVerEspectaculo.setBounds(182, 113, 57, 23);
		getContentPane().add(btnVerEspectaculo);
		
		JButton btnVerFuncion = new JButton("Ver");

		btnVerFuncion.setBounds(182, 171, 57, 23);
		getContentPane().add(btnVerFuncion);
		
		
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
				DtEspectaculo dtEspectaculo = iccdfe.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				textArea.setText(dtEspectaculo.toString());
			}
		});
		
		btnVerFuncion.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
				DtFuncion dtFuncion = iccdfe.seleccionaFuncion(comboBoxFunciones.getSelectedItem().toString());
				textArea.setText(dtFuncion.toString());
			}
		});



		comboBoxPlataformas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxEspectaculos.removeAllItems();
				iccdfe.seleccionaPlataforma(comboBoxPlataformas.getSelectedItem().toString());
				iniciarlizarComboBoxEspectaculos();
			}
		});
		comboBoxEspectaculos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxFunciones.removeAllItems();
				iccdfe.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				iniciarlizarComboBoxFunciones();
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
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarPlataformasComboBox());
		comboBoxPlataformas.setModel(modelclases);
	}
	public void iniciarlizarComboBoxEspectaculos() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarEspectaculosComboBox());
		comboBoxEspectaculos.setModel(modelclases);
	}
	public void iniciarlizarComboBoxFunciones() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarFuncionesComboBox());
		comboBoxFunciones.setModel(modelclases);
	}
	
}
