package presentacion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import interfaces.IControladorConsultaDeEspectaculo;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;

public class ConsultaDeEspectaculo extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorConsultaDeEspectaculo iccde;
	
	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxEspectaculos;
	private JComboBox<String> comboBoxFunciones;
	private JComboBox<String> comboBoxPaquetes;

	public ConsultaDeEspectaculo(IControladorConsultaDeEspectaculo iccde) {
		this.iccde = iccde;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Consulta de Espectáculo");
		setBounds(100, 100, 450, 343);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(135, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		comboBoxPlataformas = new JComboBox<String>();
		comboBoxPlataformas.setBounds(10, 57, 167, 22);
		getContentPane().add(comboBoxPlataformas);
		
		comboBoxEspectaculos = new JComboBox<String>();
		comboBoxEspectaculos.setBounds(10, 113, 167, 22);
		getContentPane().add(comboBoxEspectaculos);
		
		JLabel lblPlataforma = new JLabel("Seleccione Plataforma");
		lblPlataforma.setBounds(10, 33, 133, 14);
		getContentPane().add(lblPlataforma);
		
		JLabel lblSeleccioneE = new JLabel("Seleccione Espect\u00E1culo");
		lblSeleccioneE.setBounds(10, 88, 167, 14);
		getContentPane().add(lblSeleccioneE);
		
		JLabel lblFunciones = new JLabel("Seleccione Funciones");
		lblFunciones.setBounds(10, 146, 133, 14);
		getContentPane().add(lblFunciones);
		
		comboBoxFunciones = new JComboBox<String>();
		comboBoxFunciones.setBounds(10, 171, 167, 22);
		getContentPane().add(comboBoxFunciones);
		
		JLabel lblSeleccioneE_2 = new JLabel("Seleccione Paquetes");
		lblSeleccioneE_2.setBounds(10, 207, 133, 14);
		getContentPane().add(lblSeleccioneE_2);
		
		comboBoxPaquetes = new JComboBox<String>();
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
		btnTraerEspectaculos.setBounds(182, 57, 72, 23);
		getContentPane().add(btnTraerEspectaculos);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(269, 37, 155, 230);
		getContentPane().add(textArea);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaEspectaculoAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(253, 354, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaEspectaculoCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(71, 354, 117, 25);
		getContentPane().add(btnCancelar);

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
				inicializarComboBoxEspectaculos();
			}
		});
		
		comboBoxEspectaculos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxFunciones.removeAllItems();
				comboBoxPaquetes.removeAllItems();
				if(comboBoxEspectaculos.getSelectedItem()!= null) {
				iccde.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				inicializarComboBoxFunciones();
				inicializarComboBoxPaquetes();
				}
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
	
	protected void consultaEspectaculoAceptarActionPerformed(ActionEvent arg0) {
        if (checkFormulario()) {
            limpiarFormulario();
            setVisible(false);
        }	
	} 
	
	protected void consultaEspectaculoCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	private boolean checkFormulario() {
        return true;
    }
	
	private void limpiarFormulario() {
	}

	public void inicializarComboBoxPlataforma() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarPlataformasComboBox());
		comboBoxPlataformas.setModel(modelclases);
		System.out.println(comboBoxPlataformas.getItemAt(0));
		comboBoxPlataformas.setSelectedItem(comboBoxPlataformas.getItemAt(0));
		//comboBoxPlataformas.setSelectedIndex(0);
	}
	
	public void inicializarComboBoxEspectaculos() { 
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarEspectaculosComboBox());
		comboBoxEspectaculos.setModel(modelclases);
	}
	
	public void inicializarComboBoxFunciones() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarFuncionesComboBox());
		comboBoxFunciones.setModel(modelclases);
	}
	
	public void inicializarComboBoxPaquetes() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccde.listarPaquetesComboBox());
		comboBoxPaquetes.setModel(modelclases);
	}
}
