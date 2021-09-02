package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import datatypes.DtEspectaculo;
import excepciones.AltaEspectaculoExcepcion;
import interfaces.IControladorAltaDeEspectaculo;

public class AltaEspectaculo extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorAltaDeEspectaculo icon;

	private JComboBox<String> comboBoxPlataformas;
	private JComboBox<String> comboBoxArtistas;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtDuracion;
	private JTextField txtEspecMinimos;
	private JTextField txtEspecMaximos;
	private JTextField txtURLAsociada;
	private JTextField txtCosto;
	private JDateChooser dFechaDeAlta;
	private int duracion = 0;
	private int especMinimos = 0;
	private int especMaximos = 0;
	private float costo = 0;
	private String nombreFormulario = "Alta de Espectaculo";

	public AltaEspectaculo(IControladorAltaDeEspectaculo icon) {
		this.icon = icon;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle(nombreFormulario);
		setBounds(100, 100, 395, 445);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(116, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(10, 52, 133, 14);
		getContentPane().add(lblPlataforma);
		
		comboBoxPlataformas = new JComboBox<String>();
		comboBoxPlataformas.setBounds(150, 45, 215, 22);
		getContentPane().add(comboBoxPlataformas);
		
		JLabel lblArtista = new JLabel("Artista");
		lblArtista.setBounds(10, 78, 167, 14);
		getContentPane().add(lblArtista);
		
		comboBoxArtistas = new JComboBox<String>();
		comboBoxArtistas.setBounds(150, 74, 215, 22);
		getContentPane().add(comboBoxArtistas);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 109, 167, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(150, 106, 215, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 140, 167, 14);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(150, 137, 215, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion (minutos)");
		lblDuracion.setBounds(10, 172, 165, 14);
		getContentPane().add(lblDuracion);
		
		txtDuracion = new JTextField();
		txtDuracion.setBounds(150, 168, 41, 20);
		getContentPane().add(txtDuracion);
		txtDuracion.setColumns(10);
		
		JLabel lblEspecMinimos = new JLabel("Espectadores Minimos");
		lblEspecMinimos.setBounds(10, 202, 167, 14);
		getContentPane().add(lblEspecMinimos);
		
		txtEspecMinimos = new JTextField();
		txtEspecMinimos.setBounds(150, 199, 41, 20);
		getContentPane().add(txtEspecMinimos);
		txtEspecMinimos.setColumns(10);
		
		JLabel lblEspecMaximos = new JLabel("Espectadores Maximos");
		lblEspecMaximos.setBounds(10, 233, 167, 14);
		getContentPane().add(lblEspecMaximos);
		
		txtEspecMaximos = new JTextField();
		txtEspecMaximos.setBounds(150, 231, 41, 20);
		getContentPane().add(txtEspecMaximos);
		txtEspecMaximos.setColumns(10);

		JLabel lblURLAsociada = new JLabel("URL Asociada");
		lblURLAsociada.setBounds(10, 264, 167, 14);
		getContentPane().add(lblURLAsociada);
		
		txtURLAsociada = new JTextField();
		txtURLAsociada.setBounds(150, 261, 215, 20);
		getContentPane().add(txtURLAsociada);
		txtURLAsociada.setColumns(10);

		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(10, 295, 167, 14);
		getContentPane().add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(150, 292, 76, 20);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);

		JLabel lblFechaDeAlta = new JLabel("Fecha de Alta");
		lblFechaDeAlta.setBounds(10, 326, 167, 14);
		getContentPane().add(lblFechaDeAlta);
		
		dFechaDeAlta = new JDateChooser();
		dFechaDeAlta.setBounds(150, 323, 125, 20);
		getContentPane().add(dFechaDeAlta);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaEspectaculoAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(218, 370, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaEspectaculoCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(46, 370, 117, 25);
		getContentPane().add(btnCancelar);
	}
	
	public void inicializarComboBoxes() {
		DefaultComboBoxModel<String> modelPlataformas = new DefaultComboBoxModel<String>(icon.listarPlataformas());
		comboBoxPlataformas.setModel(modelPlataformas);
		DefaultComboBoxModel<String> modelArtistas = new DefaultComboBoxModel<String>(icon.listarArtistas());
		comboBoxArtistas.setModel(modelArtistas);
	}
	
	protected void altaEspectaculoAceptarActionPerformed(ActionEvent arg0) {        
        if (checkFormulario()) {
        	String plataforma = (String)comboBoxPlataformas.getSelectedItem();
        	String artista = (String)comboBoxArtistas.getSelectedItem();
    		String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            String urlAsociada = txtURLAsociada.getText();           
            Date fecha = dFechaDeAlta.getDate();
        	try {
        		DtEspectaculo espectaculo = new DtEspectaculo(nombre, descripcion, duracion, especMinimos, especMaximos, urlAsociada, costo, fecha);
				icon.ingresaEspectaculo(plataforma, artista, espectaculo);
	            JOptionPane.showMessageDialog(this, "Espectaculo dado de alta con exito!", nombreFormulario,
	                        JOptionPane.INFORMATION_MESSAGE);
	            limpiarFormulario();
	            setVisible(false);
			} catch (AltaEspectaculoExcepcion e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), nombreFormulario, JOptionPane.ERROR_MESSAGE);
			}
        }
	}
	
	protected void altaEspectaculoCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	private boolean checkFormulario() {
    	String plataforma = (String)comboBoxPlataformas.getSelectedItem();
        if (plataforma == null) {
            JOptionPane.showMessageDialog(this, "Plataforma debe ser elegida", nombreFormulario,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    	String artista = (String)comboBoxArtistas.getSelectedItem();
        if (artista == null) {
            JOptionPane.showMessageDialog(this, "Artista debe ser elegido", nombreFormulario,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        String nombre = txtNombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre no puede ser vacio", nombreFormulario,
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String sDuracion = txtDuracion.getText();
        if (!sDuracion.isEmpty()) {
	        try {
	        	duracion = Integer.parseInt(sDuracion);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Duracion debe ser numerica", nombreFormulario,
	                    JOptionPane.ERROR_MESSAGE);
	            return false;
	        }
		}
    	String sEspecMinimos = txtEspecMinimos.getText();
        if (!sEspecMinimos.isEmpty()) {
	        try {
	        	especMinimos = Integer.parseInt(sEspecMinimos);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Espectadores minimos debe ser numerico", nombreFormulario,
	                    JOptionPane.ERROR_MESSAGE);
	            return false;
	        }
		}
        String sEspecMaximos = txtEspecMaximos.getText();
        if (!sEspecMaximos.isEmpty()) {
	        try {
	        	especMaximos = Integer.parseInt(sEspecMaximos);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Espectadores maximos debe ser numerico", nombreFormulario,
	                    JOptionPane.ERROR_MESSAGE);
	            return false;
	        }
        }
        String sCosto = txtCosto.getText();
        if (!sCosto.isEmpty()) {
	        try {
	            costo = Float.parseFloat(sCosto);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Costo debe ser numerico", nombreFormulario,
	                    JOptionPane.ERROR_MESSAGE);
	            return false;
	        }
        }
        return true;
    }
	
	private void limpiarFormulario() {
		txtNombre.setText("");
		txtDescripcion.setText("");
		txtDuracion.setText("");
		txtEspecMinimos.setText("");
		txtEspecMaximos.setText("");
        txtURLAsociada.setText("");
        txtCosto.setText("");
        dFechaDeAlta.setDate(null);
	}
}
