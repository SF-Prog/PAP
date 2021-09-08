package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import interfaces.IControladorConsultaDeFuncionDeEspectaculo;
import logica.Espectaculo;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;

public class ConsultaDeFuncionDeEspectaculo extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorConsultaDeFuncionDeEspectaculo iccdfe;
	
	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxEspectaculos;
	private JComboBox<String> comboBoxFunciones;

	public ConsultaDeFuncionDeEspectaculo(IControladorConsultaDeFuncionDeEspectaculo iccdfe) {
		this.iccdfe = iccdfe;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Consulta de Funci�n de Espect�culo");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(133, 11, 235, 14);
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
		
		JButton btnVerEspectaculo = new JButton("Ver");	
		btnVerEspectaculo.setBounds(182, 113, 57, 23);
		getContentPane().add(btnVerEspectaculo);
		
		JButton btnVerFuncion = new JButton("Ver");
		btnVerFuncion.setBounds(182, 171, 57, 23);
		getContentPane().add(btnVerFuncion);		
		
		JButton btnTraerEspectaculos = new JButton("Traer");
		btnTraerEspectaculos.setBounds(182, 57, 77, 23);
		getContentPane().add(btnTraerEspectaculos);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(269, 37, 155, 230);
		getContentPane().add(textArea);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaFuncionDeEspectaculoAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(253, 354, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaFuncionDeEspectaculoCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(71, 354, 117, 25);
		getContentPane().add(btnCancelar);

		// EVENTOS
		btnVerEspectaculo.addActionListener(new ActionListener() {
			// BOTON VER ESPECTACULO
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEspectaculos.getItemCount()> 0) {
					String campoVacio ="";
					if(!campoVacio.equals(comboBoxEspectaculos.getSelectedItem().toString())) {
						DtEspectaculo dtEspectaculo = iccdfe.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
						textArea.setText(dtEspectaculo.toString());
					}else {
						textArea.setText("SELECCIONASTE UN CAMPO VACIO");
					}
				}else{
					textArea.setText("NO HAY NINGUN ESPECTACULO CARGADO");
				}
			}
		});
		
		btnVerFuncion.addActionListener(new ActionListener() {
			// BOTON VER FUNCION
			public void actionPerformed(ActionEvent e) {
				if(comboBoxFunciones.getItemCount()> 0) {
					String campoVacio ="";
					if(!campoVacio.equals(comboBoxFunciones.getSelectedItem().toString())) {
						DtFuncion dtFuncion = iccdfe.seleccionaFuncion(comboBoxFunciones.getSelectedItem().toString());
						textArea.setText(dtFuncion.toString());
					}else {
						textArea.setText("SELECCIONASTE UN CAMPO VACIO");
					}
				}else{
					textArea.setText("NO HAY NINGUNA FUNCION CARGADA");
				}
			}
		});

		comboBoxPlataformas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxEspectaculos.removeAllItems();
				if(comboBoxPlataformas.getItemCount()> 0) {
					String campoVacio ="";
					if(!campoVacio.equals(comboBoxPlataformas.getSelectedItem().toString())) {
							iccdfe.seleccionaPlataforma(comboBoxPlataformas.getSelectedItem().toString());
							inicializarComboBoxEspectaculos();
					}
				}
			}
		});
		
		comboBoxEspectaculos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxFunciones.removeAllItems(); 
				if(comboBoxEspectaculos.getItemCount()> 0) {
					String campoVacio ="";
					if(!campoVacio.equals(comboBoxEspectaculos.getSelectedItem().toString())) {
						iccdfe.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
						inicializarComboBoxFunciones();
				
					}
			
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
	
	protected void consultaFuncionDeEspectaculoAceptarActionPerformed(ActionEvent arg0) {
        if (checkFormulario()) {
            limpiarFormulario();
            setVisible(false);
        }	
	} 
	
	protected void consultaFuncionDeEspectaculoCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	private boolean checkFormulario() {
        return true;
    }
	
	private void limpiarFormulario() {
	}

	public void inicializarComboBoxPlataforma() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarPlataformasComboBox());
		comboBoxPlataformas.setModel(modelclases);
	}
	
	public void inicializarComboBoxEspectaculos() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarEspectaculosComboBox());
		comboBoxEspectaculos.setModel(modelclases);
	}
	
	public void inicializarComboBoxFunciones() {
		DefaultComboBoxModel<String> modelclases = new DefaultComboBoxModel<String>(iccdfe.listarFuncionesComboBox());
		comboBoxFunciones.setModel(modelclases);
	}	
}
