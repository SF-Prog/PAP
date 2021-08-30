package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import datatypes.DtPlataforma;
import excepciones.AltaPlataformaExcepcion;
import interfaces.IControladorAltaDePlataforma;

public class AltaPlataforma extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorAltaDePlataforma icon;
	
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtURL;

	public AltaPlataforma(IControladorAltaDePlataforma icon) {
		this.icon = icon;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Alta de Plataforma");
		setBounds(100, 100, 382, 242);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(111, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 52, 167, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(129, 49, 167, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(10, 83, 167, 14);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(129, 80, 235, 20);
		getContentPane().add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblDuracion = new JLabel("URL");
		lblDuracion.setBounds(10, 114, 108, 14);
		getContentPane().add(lblDuracion);
		
		txtURL = new JTextField();
		txtURL.setBounds(129, 111, 235, 20);
		getContentPane().add(txtURL);
		txtURL.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaPlataformaAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(215, 162, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaPlataformaCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(43, 162, 117, 25);
		getContentPane().add(btnCancelar);
	}
	
	protected void altaPlataformaAceptarActionPerformed(ActionEvent arg0) {        
        if (checkFormulario()) {
    		String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            String url = txtURL.getText();
        	try {
        		DtPlataforma plataforma = new DtPlataforma(nombre, descripcion, url);
				icon.ingresaPlataforma(plataforma);
	            JOptionPane.showMessageDialog(this, "Plataforma dada de alta con éxito!", "Alta de Plataforma",
	                        JOptionPane.INFORMATION_MESSAGE);
	            limpiarFormulario();
	            setVisible(false);
			} catch (AltaPlataformaExcepcion e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Alta de Plataforma", JOptionPane.ERROR_MESSAGE);
			}
        }
	} 
	
	protected void altaPlataformaCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	private boolean checkFormulario() {
        String nombre = txtNombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre no puede ser vacío", "Alta de Plataforma",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
	
	private void limpiarFormulario() {
		txtNombre.setText("");
		txtDescripcion.setText("");
		txtURL.setText("");
	}
}
