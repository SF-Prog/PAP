package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public AltaEspectaculo(IControladorAltaDeEspectaculo icon) {
		this.icon = icon;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Alta de Espectáculo");
		setBounds(100, 100, 395, 445);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(116, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(10, 52, 133, 14);
		getContentPane().add(lblPlataforma);
		
		comboBoxPlataformas = new JComboBox<String>();
		comboBoxPlataformas.setBounds(150, 45, 167, 22);
		getContentPane().add(comboBoxPlataformas);
		
		JLabel lblArtista = new JLabel("Artista");
		lblArtista.setBounds(10, 81, 167, 14);
		getContentPane().add(lblArtista);
		
		comboBoxArtistas = new JComboBox<String>();
		comboBoxArtistas.setBounds(150, 74, 167, 22);
		getContentPane().add(comboBoxArtistas);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 112, 167, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(150, 106, 215, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(10, 143, 167, 14);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(150, 137, 215, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duraci\u00F3n (minutos)");
		lblDuracion.setBounds(10, 174, 167, 14);
		getContentPane().add(lblDuracion);
		
		txtDuracion = new JTextField();
		txtDuracion.setBounds(150, 168, 41, 20);
		getContentPane().add(txtDuracion);
		txtDuracion.setColumns(10);
		
		JLabel lblEspecMinimos = new JLabel("Espectadores M\u00EDnimos");
		lblEspecMinimos.setBounds(10, 205, 167, 14);
		getContentPane().add(lblEspecMinimos);
		
		txtEspecMinimos = new JTextField();
		txtEspecMinimos.setBounds(150, 199, 41, 20);
		getContentPane().add(txtEspecMinimos);
		txtEspecMinimos.setColumns(10);
		
		JLabel lblEspecMaximos = new JLabel("Espectadores M\u00E1ximos");
		lblEspecMaximos.setBounds(10, 236, 167, 14);
		getContentPane().add(lblEspecMaximos);
		
		txtEspecMaximos = new JTextField();
		txtEspecMaximos.setBounds(150, 231, 41, 20);
		getContentPane().add(txtEspecMaximos);
		txtEspecMaximos.setColumns(10);

		JLabel lblURLAsociada = new JLabel("URL Asociada");
		lblURLAsociada.setBounds(10, 267, 167, 14);
		getContentPane().add(lblURLAsociada);
		
		txtURLAsociada = new JTextField();
		txtURLAsociada.setBounds(150, 261, 215, 20);
		getContentPane().add(txtURLAsociada);
		txtURLAsociada.setColumns(10);

		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(10, 298, 167, 14);
		getContentPane().add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(150, 292, 76, 20);
		getContentPane().add(txtCosto);
		txtCosto.setColumns(10);

		JLabel lblFechaDeAlta = new JLabel("Fecha de Alta");
		lblFechaDeAlta.setBounds(10, 329, 167, 14);
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
            int duracion = Integer.parseInt(txtDuracion.getText());
            int especMinimos = Integer.parseInt(txtEspecMinimos.getText());
            int especMaximos = Integer.parseInt(txtEspecMaximos.getText());
            String urlAsociada = txtURLAsociada.getText();
            float costo = Float.parseFloat(txtCosto.getText());
           
            //Date fecha = ParseFecha(dFechaDeAlta.getDateFormatString());
            Date fecha = dFechaDeAlta.getDate();
        	try {
        		DtEspectaculo espectaculo = new DtEspectaculo(nombre, descripcion, duracion, especMinimos, especMaximos, urlAsociada, costo, fecha);
				icon.ingresaEspectaculo(plataforma, artista, espectaculo);
	            JOptionPane.showMessageDialog(this, "Espectáculo dado de alta con éxito!", "Alta de Espectáculo",
	                        JOptionPane.INFORMATION_MESSAGE);
	            limpiarFormulario();
	            setVisible(false);
			} catch (AltaEspectaculoExcepcion e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Alta de Espectáculo", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "Plataforma debe ser elegida", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    	String artista = (String)comboBoxArtistas.getSelectedItem();
        if (artista == null) {
            JOptionPane.showMessageDialog(this, "Artista debe ser elegido", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        String nombre = txtNombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre no puede ser vacío", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String duracion = txtDuracion.getText();
        try {
            Integer.parseInt(duracion);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Duración debe ser numérica", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String especMinimos = txtEspecMinimos.getText();
        try {
            Integer.parseInt(especMinimos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Espectadores mínimos debe ser numérico", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String especMaximos = txtEspecMaximos.getText();
        try {
            Integer.parseInt(especMaximos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Espectadores máximos debe ser numérico", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String costo = txtCosto.getText();
        try {
            Float.parseFloat(costo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Costo debe ser numérico", "Alta de Espectáculo",
                    JOptionPane.ERROR_MESSAGE);
            return false;
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
}
