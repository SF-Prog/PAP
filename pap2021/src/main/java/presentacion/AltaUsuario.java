package presentacion;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import interfaces.IControladorAltaDeUsuario;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import excepciones.AltaPlataformaExcepcion;

public class AltaUsuario extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorAltaDeUsuario icau;
	
	private JTextField txtNickname;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	private JDateChooser txtFecha;
	private JTextField txtLink;
	private JTextArea textAreaBiografia;
	private JTextArea textAreaDescripcion;
	private JRadioButton rdbtnArtista;
	private JRadioButton rdbtnEspectador;
	private JLabel lblBiografia;
	private JLabel lblDescripcionGeneral;
	private JLabel lblLink;
	private String nombreFormulario = "Alta Usuario";

	public AltaUsuario(IControladorAltaDeUsuario icau) {
		this.icau = icau;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Alta de Usuario");
		setBounds(100, 100, 459, 398);
		getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(145, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		txtNickname = new JTextField();
		txtNickname.setBounds(28, 63, 159, 20);
		getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nickname");
		lblNewLabel.setBounds(28, 43, 86, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 94, 46, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(28, 114, 115, 20);
		txtNombre.setColumns(10);
		getContentPane().add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(153, 94, 46, 14);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(153, 114, 111, 20);
		txtApellido.setColumns(10);
		getContentPane().add(txtApellido);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(197, 43, 46, 14);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(197, 63, 199, 20);
		txtEmail.setColumns(10);
		getContentPane().add(txtEmail);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(28, 145, 46, 14);
		getContentPane().add(lblFecha);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(28, 165, 115, 20);
		getContentPane().add(txtFecha);

		lblLink = new JLabel("Link");
		lblLink.setBounds(153, 145, 46, 14);
		getContentPane().add(lblLink);
		
		txtLink = new JTextField();
		txtLink.setBounds(153, 165, 243, 20);
		txtLink.setColumns(10);
		getContentPane().add(txtLink);
		
		Panel panel = new Panel();
		panel.setBounds(277, 94, 119, 62);
		getContentPane().add(panel);
		
		rdbtnArtista = new JRadioButton("Artista");
		rdbtnArtista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioArtistaActionPerformed(e);
			}
		});
		rdbtnArtista.setSelected(true);
		panel.add(rdbtnArtista);
		
		rdbtnEspectador = new JRadioButton("Espectador");
		rdbtnEspectador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioEspectadorActionPerformed(e);
			}
		});
		rdbtnEspectador.setSelected(false);
		panel.add(rdbtnEspectador);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(253, 321, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaUsuarioCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(71, 321, 117, 25);
		getContentPane().add(btnCancelar);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(28, 222, 190, 88);
		getContentPane().add(textAreaDescripcion);
		
		textAreaBiografia = new JTextArea();
		textAreaBiografia.setBounds(228, 222, 190, 88);
		getContentPane().add(textAreaBiografia);
		
		lblDescripcionGeneral = new JLabel("Descripcion General");
		lblDescripcionGeneral.setBounds(71, 197, 128, 14);
		getContentPane().add(lblDescripcionGeneral);
		
		lblBiografia = new JLabel("Biografia");
		lblBiografia.setBounds(296, 197, 100, 14);
		getContentPane().add(lblBiografia);
	}
	
	protected void altaUsuarioAceptarActionPerformed(ActionEvent arg0) {
		String msg = campoVacio();
		if(msg.isEmpty()){
			if(!icau.existeUsuarioPorNickname(txtNickname.getText())){
				if(!icau.existeUsuarioPorEmail(txtEmail.getText())){
		        	try {
						if(rdbtnArtista.isSelected()){
							agregarUsuario(1);
						}else{
							agregarUsuario(2);						
						}
						JOptionPane.showMessageDialog(this, "Usuario agregado correctamente", nombreFormulario, JOptionPane.INFORMATION_MESSAGE);
						limpiarFormulario();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(this, e.getMessage(), nombreFormulario, JOptionPane.ERROR_MESSAGE);
					}
				}else{
					msg = "El email ya esta en uso";
				}
			}else{
				msg = "El nickname ya esta en uso";
			}
		}
		if(!msg.isEmpty()){
			JOptionPane.showMessageDialog(this, msg, nombreFormulario, JOptionPane.ERROR_MESSAGE);
		}
	} 
	
	private void agregarUsuario(int tipo){
		DtUsuario dtUsuario = new DtUsuario(txtNickname.getText(),txtNombre.getText(),txtApellido.getText(),txtEmail.getText(),txtFecha.getDate());
		if(tipo == 1){
			icau.ingresaUsuarioArtista(dtUsuario,textAreaDescripcion.getText(),textAreaBiografia.getText(),txtLink.getText());
		}else{
			icau.ingresaUsuarioEspectador(dtUsuario);
		}		
	}
	
	private String campoVacio() {
		String res = "";
        if(txtNickname.getText().isEmpty()){
            res = "Nombre no puede ser vacio";
        }else if(txtEmail.getText().isEmpty()){
            res = "Email no puede ser vacio";
        }
        return res;
	}
	
	protected void altaUsuarioCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	protected void altaUsuarioArtistaActionPerformed(ActionEvent arg0) {			
		rdbtnArtista.setSelected(true);
		rdbtnEspectador.setSelected(false);
		
		// HABILITADO DE LOS CAMPOS PARA ARTISTA
		textAreaBiografia.setEnabled(true);
		textAreaBiografia.setVisible(true);
		lblBiografia.setVisible(true);
		
		textAreaDescripcion.setEnabled(true);
		textAreaDescripcion.setVisible(true);
		lblDescripcionGeneral.setVisible(true);
		
		txtLink.setEnabled(true);
		txtLink.setVisible(true);
		lblLink.setVisible(true);
	}
	
	protected void altaUsuarioEspectadorActionPerformed(ActionEvent arg0) {
		rdbtnArtista.setSelected(false);
		rdbtnEspectador.setSelected(true);
		
		// DESHABILITADO DE LOS CAMPOS PARA ESPECTADOR
		textAreaBiografia.setEnabled(false);
		textAreaBiografia.setVisible(false);
		lblBiografia.setVisible(false);
		
		textAreaDescripcion.setEnabled(false);
		textAreaDescripcion.setVisible(false);
		lblDescripcionGeneral.setVisible(false);
		
		txtLink.setEnabled(false);
		txtLink.setVisible(false);
		lblLink.setVisible(false);			
	}
	
	private void limpiarFormulario() {
		txtNickname.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtEmail.setText("");
		txtFecha.setDate(null);
		txtLink.setText("");
		textAreaBiografia.setText("");
		textAreaDescripcion.setText("");	       
	}
}
