package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import interfaces.IControladorAltaDeUsuario;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuario extends JInternalFrame {
	private IControladorAltaDeUsuario icau;
	private JTextField txtNickname;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	private JTextField txtFecha;
	private JTextField txtLink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaUsuario frame = new AltaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AltaUsuario(IControladorAltaDeUsuario icau) {
		this.icau = icau;
		setBounds(100, 100, 450, 455);
		getContentPane().setLayout(null);
		
		txtNickname = new JTextField();
		txtNickname.setBounds(50, 63, 86, 20);
		getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nickname");
		lblNewLabel.setBounds(50, 43, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 94, 46, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(50, 114, 86, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(153, 94, 46, 14);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(153, 114, 86, 20);
		getContentPane().add(txtApellido);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(146, 43, 46, 14);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(146, 63, 86, 20);
		getContentPane().add(txtEmail);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(50, 145, 46, 14);
		getContentPane().add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(50, 165, 86, 20);
		getContentPane().add(txtFecha);
		
		JLabel lblLink = new JLabel("Link");
		lblLink.setBounds(153, 145, 46, 14);
		getContentPane().add(lblLink);
		
		txtLink = new JTextField();
		txtLink.setColumns(10);
		txtLink.setBounds(153, 165, 86, 20);
		getContentPane().add(txtLink);
		
		Panel panel = new Panel();
		panel.setBounds(272, 63, 119, 62);
		getContentPane().add(panel);
		
		// DEFINICION DE COMPONENTES //
		JRadioButton rdbtnArtista = new JRadioButton("Artista");
		panel.add(rdbtnArtista);
		
		JRadioButton rdbtnEspectador = new JRadioButton("Espectador");
		panel.add(rdbtnEspectador);
		
		Button btnConfirmar = new Button("Aceptar");
		btnConfirmar.setBounds(253, 354, 114, 39);
		getContentPane().add(btnConfirmar);
		
		Button btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(71, 354, 115, 39);
		getContentPane().add(btnCancelar);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(28, 222, 190, 69);
		getContentPane().add(textAreaDescripcion);
		
		JTextArea textAreaBiografia = new JTextArea();
		textAreaBiografia.setBounds(228, 222, 190, 69);
		getContentPane().add(textAreaBiografia);
		
		JLabel lblDescripcionGeneral = new JLabel("Descripcion General");
		lblDescripcionGeneral.setBounds(71, 197, 102, 14);
		getContentPane().add(lblDescripcionGeneral);
		
		JLabel lblBiografia = new JLabel("Biografia");
		lblBiografia.setBounds(296, 197, 46, 14);
		getContentPane().add(lblBiografia);
		// FIN DEFINICION DE COMPONENTES //
		
		// DEFINICION DE EVENTOS///
		rdbtnEspectador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SETEO DE LO RADIO BUTTON
				rdbtnArtista.setSelected(false);
				rdbtnEspectador.setSelected(true);
				// DESHABILITADO DE LOS CAMPOS PARA ESPECTADOR
				textAreaBiografia.setEnabled(false);
				textAreaBiografia.setVisible(false);
				
				
				
			}
		});
		rdbtnArtista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnArtista.setSelected(true);
				rdbtnEspectador.setSelected(false);
				
				// HABILITADO DE LOS CAMPOS PARA ARTISTA
				textAreaBiografia.setEnabled(true);
				textAreaBiografia.setVisible(true);
			}
		});
		
		// FIN DE DEFINICION DE EVENTOS //
	}
}
