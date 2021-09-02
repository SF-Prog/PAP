package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;

import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;

import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import excepciones.AltaFuncionDeEspectaculoExcepcion;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class AltaFuncionDeEspectaculo extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorAltaDeFuncionDeEspectaculo icon;
	private JTextField textFieldNombre;
	private JList listaArtistasAgregados;
	private JDateChooser dFechaDeAlta;
	private JDateChooser dFechaDeInicio;
	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxEspectaculos;
	private JComboBox<String> comboBoxArtistas;
	private JSpinField dFieldHoraInicio;

	public AltaFuncionDeEspectaculo(IControladorAltaDeFuncionDeEspectaculo icon) {
		this.icon = icon;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Alta de Funcion de Espectaculo");
		setBounds(100, 100, 450, 455);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(99, 24, 235, 14);
		getContentPane().add(lblTitulo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaFuncionDeEspectaculoAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(251, 355, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaFuncionDeEspectaculoCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(75, 355, 117, 25);
		getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Seleccione la plataforma:");
		lblNewLabel.setBounds(44, 54, 173, 16);
		getContentPane().add(lblNewLabel);
		
		comboBoxPlataformas = new JComboBox<String>();
		comboBoxPlataformas.setBounds(214, 52, 173, 22);
		getContentPane().add(comboBoxPlataformas);
		
		JLabel lblSeleccioneEspectaculo = new JLabel("Seleccione espectaculo:");
		lblSeleccioneEspectaculo.setBounds(44, 100, 173, 16);
		getContentPane().add(lblSeleccioneEspectaculo);
		
		comboBoxEspectaculos = new JComboBox<String>();
		comboBoxEspectaculos.setBounds(214, 96, 173, 27);
		getContentPane().add(comboBoxEspectaculos);
		
		JLabel lblNombreDeLa = new JLabel("Nombre:");
		lblNombreDeLa.setBounds(75, 171, 82, 25);
		getContentPane().add(lblNombreDeLa);
		
		JLabel lblNuevaFuncion = new JLabel("Nueva Funcion:");
		lblNuevaFuncion.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNuevaFuncion.setBounds(152, 135, 117, 25);
		getContentPane().add(lblNuevaFuncion);
		
		JLabel lblFecha = new JLabel("Fecha de inicio:");
		lblFecha.setBounds(75, 192, 117, 25);
		getContentPane().add(lblFecha);
		
		JLabel lblHoraDeInicio = new JLabel("Hora de inicio:");
		lblHoraDeInicio.setBounds(75, 218, 95, 25);
		getContentPane().add(lblHoraDeInicio);
		
		JLabel lblFechaDeAlta = new JLabel("Fecha de alta:");
		lblFechaDeAlta.setBounds(75, 242, 95, 25);
		getContentPane().add(lblFechaDeAlta);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(204, 170, 150, 26);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		textFieldNombre.setEnabled(false);
		
		dFechaDeInicio = new JDateChooser();
		dFechaDeInicio.setBounds(204, 197, 150, 20);
		getContentPane().add(dFechaDeInicio);
		dFechaDeInicio.setEnabled(false);
		
		dFechaDeAlta = new JDateChooser();
		dFechaDeAlta.setBounds(204, 247, 150, 20);
		getContentPane().add(dFechaDeAlta);
		dFechaDeAlta.setEnabled(false);
		
		TimePicker dFieldHoraInicio = new TimePicker();

		dFieldHoraInicio.addValueChangeListener(
		        event -> updateMessage(message, timePicker));
		
		listaArtistasAgregados = new JList();
		DefaultListModel modelArtistasAgregados = new DefaultListModel();
		listaArtistasAgregados.setModel(modelArtistasAgregados);
		listaArtistasAgregados.setBounds(232, 279, 155, 64);
		getContentPane().add(listaArtistasAgregados);
		
		JLabel LabelArtistas = new JLabel("Seleccione los artistas invitados:");
		LabelArtistas.setBounds(20, 279, 213, 16);
		getContentPane().add(LabelArtistas);
		
		comboBoxArtistas = new JComboBox<String>();
		comboBoxArtistas.setBounds(49, 307, 108, 27);
		getContentPane().add(comboBoxArtistas);
		comboBoxArtistas.setEnabled(false);
		
		JButton btnAgregarArtista = new JButton("+");
		btnAgregarArtista.setBounds(165, 306, 52, 29);
		getContentPane().add(btnAgregarArtista);
		comboBoxPlataformas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getItem());
				icon.seleccionaPlataforma(comboBoxPlataformas.getSelectedItem().toString());
//				comboBoxEspectaculos.setEnabled(true);
				inicializarComboBoxEspectaculos();
				inicializarComboBoxArtistas();
			};
		});
		comboBoxEspectaculos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				icon.seleccionaEspectaculo(comboBoxEspectaculos.getSelectedItem().toString());
				textFieldNombre.setEnabled(true);
				dFechaDeInicio.setEnabled(true);
				dFechaDeAlta.setEnabled(true);
				dFieldHoraInicio.setEnabled(true);
				comboBoxArtistas.setEnabled(true);
				listaArtistasAgregados.setEnabled(true);
			};
		});
		btnAgregarArtista.addActionListener(new ActionListener() {
			// BOTON VER ESPECTACULO
			public void actionPerformed(ActionEvent e) {
				icon.agregarArtistaAFuncion(comboBoxArtistas.getSelectedItem().toString());
				modelArtistasAgregados.addElement(comboBoxArtistas.getSelectedItem().toString());
			};
		});
	}
	
	protected void altaFuncionDeEspectaculoAceptarActionPerformed(ActionEvent arg0) {
        if (checkFormulario()) {
        	String nombre = textFieldNombre.getText();
        	Date horaInicio = null;
         	Date fechaAlta = dFechaDeAlta.getDate();
        	Date fechaInicio = dFechaDeInicio.getDate();
        	List<String> artistasInvitados =  new ArrayList<String>();
        	
        	for(int i = 0; i< listaArtistasAgregados.getModel().getSize();i++) {
        		artistasInvitados.add(listaArtistasAgregados.getModel().getElementAt(i).toString());
            };
        	try {
        		DtFuncion dtFuncion = new DtFuncion(nombre, fechaInicio, horaInicio, fechaAlta);
        		icon.ingresaFuncion(dtFuncion, artistasInvitados);
        		JOptionPane.showMessageDialog(this, "Funcion dado de alta con �xito!", "Alta de Funcion de Espectaculo",
                        JOptionPane.INFORMATION_MESSAGE);
        		limpiarFormulario();
                setVisible(false);
        	} catch (AltaFuncionDeEspectaculoExcepcion e) {
        		JOptionPane.showMessageDialog(this, e.getMessage(), "Alta de Funcion de Espect�culo", JOptionPane.ERROR_MESSAGE);
        	}
        }	
	};
	
	protected void altaFuncionDeEspectaculoCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	public void inicializarComboBoxPlataforma() {
		DefaultComboBoxModel<String> modelPlataformas = new DefaultComboBoxModel<String>(icon.listarPlataformasComboBox());
		comboBoxPlataformas.setModel(modelPlataformas);		
	}
	public void inicializarComboBoxEspectaculos() {
		DefaultComboBoxModel<String> modelEspectaculos = new DefaultComboBoxModel<String>(icon.listarEspectaculosComboBox());
		comboBoxEspectaculos.setModel(modelEspectaculos);
	}
	public void inicializarComboBoxArtistas() {
		DefaultComboBoxModel<String> modelArtistas = new DefaultComboBoxModel<String>(icon.listarArtistasComboBox());
		comboBoxArtistas.setModel(modelArtistas);
	}
	private static Date ParseFecha(String sFecha) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dFecha = null;
        try {
        	dFecha = formato.parse(sFecha);
        } 
        catch (ParseException ex) 
        {
        	System.out.println(ex);
        }
        return dFecha;
	}
	
	private boolean checkFormulario() {
		String plataforma = (String)comboBoxPlataformas.getSelectedItem();
        if (plataforma == null) {
            JOptionPane.showMessageDialog(this, "Plataforma debe ser elegida", "Alta de Funcion de Espectaculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String espectaculo = (String)comboBoxPlataformas.getSelectedItem();
        if (espectaculo == null) {
            JOptionPane.showMessageDialog(this, "Espectaculo debe ser elegido", "Alta de Funcion de Espectaculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        DefaultListModel model = (DefaultListModel) listaArtistasAgregados.getModel();
    	Integer artistaLength = listaArtistasAgregados.getModel().getSize();
        if (artistaLength < 1) {
            JOptionPane.showMessageDialog(this, "Al menos un artista debe ser elegido", "Alta de Funcion de Espectaculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
	}
	private void limpiarFormulario() {
		textFieldNombre.setText("");
//		dFieldHoraInicio.setDate(null);
		dFechaDeAlta.setDate(null);
		dFechaDeInicio.setDate(null);
		DefaultListModel model = (DefaultListModel) listaArtistasAgregados.getModel();
		model.removeAllElements();
		comboBoxPlataformas.removeAllItems();
		comboBoxEspectaculos.removeAllItems();
		comboBoxArtistas.removeAllItems();
	}
}
