package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import datatypes.DtUsuario;
import interfaces.IControladorAltaDeUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class AltaUsuario extends JInternalFrame {
	private IControladorAltaDeUsuario icau;
	private JTextField txtNickname;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	private JTextField txtFecha;
	private JTextField txtLink;
	private JTextArea textAreaBiografia;
	private JTextArea textAreaDescripcion;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

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
		rdbtnArtista.setSelected(true);
		panel.add(rdbtnArtista);
		
		JRadioButton rdbtnEspectador = new JRadioButton("Espectador");
		rdbtnEspectador.setSelected(false);
		panel.add(rdbtnEspectador);
		
		Button btnConfirmar = new Button("Aceptar");

		btnConfirmar.setBounds(253, 354, 114, 39);
		getContentPane().add(btnConfirmar);
		
		Button btnCancelar = new Button("Cancelar");

		btnCancelar.setBounds(71, 354, 115, 39);
		getContentPane().add(btnCancelar);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(28, 222, 190, 69);
		getContentPane().add(textAreaDescripcion);
		
		textAreaBiografia = new JTextArea();
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
				lblBiografia.setVisible(false);
				
				textAreaDescripcion.setEnabled(false);
				textAreaDescripcion.setVisible(false);
				lblDescripcionGeneral.setVisible(false);
				
				txtLink.setEnabled(false);
				txtLink.setVisible(false);
				lblLink.setVisible(false);
				
				
				
			}
		});
		rdbtnArtista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		});
		

		btnCancelar.addActionListener(new ActionListener() {
			// EVENTO BOTON CANCELAR
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
			
		});
		
		btnConfirmar.addActionListener(new ActionListener() {
			// EVENTO BOTON ACEPTAR
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(rdbtnArtista.isSelected()){
					// SE SELECCIONO TIPO ARTISTA
					if(!camposVaciosArtista()){
						if(!icau.buscarUsuarioPorEmail(txtEmail.getText())  && !icau.buscarUsuarioPorNickname(txtNickname.getText()) ){
							agregarUsuario(1);
						}else{
							 msg ="El nickname y/o el email ya estan en uso";
						}
						
					}else{
						//JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Agregar Inscripcion", JOptionPane.ERROR_MESSAGE);
					}
				}else if(rdbtnEspectador.isSelected()){
					// SE SELECCIONO TIPO ESPECTADOR
					if(!camposVaciosEspectador()){
						if(!icau.buscarUsuarioPorEmail(txtEmail.getText())  && !icau.buscarUsuarioPorNickname(txtNickname.getText()) ){
							agregarUsuario(2);
						}else{
							 msg ="El nickname y/o el email ya estan en uso";
						}
						
					}else{
						//JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Agregar Inscripcion", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		// FIN DE DEFINICION DE EVENTOS //
	}
	
	private void agregarUsuario(int tipo){
		Date fecha = ParseFecha(txtFecha.getText());
		
		DtUsuario dtUsuario = new DtUsuario(txtNickname.getText(),txtNombre.getText(),txtApellido.getText(),txtEmail.getText(),fecha);
		if(tipo==1){
			icau.ingresaUsuarioArtista(dtUsuario,textAreaDescripcion.getText(),textAreaBiografia.getText(),txtLink.getText());
		}else{
			icau.ingresaUsuarioEspectador(dtUsuario);
		}
		
		
	}//FIN AGREGAR USUARIO
	
	private void limpiarFormulario() {
			 txtNickname.setText("");
			txtNombre.setText("");
			txtApellido.setText("");
			txtEmail.setText("");
			txtFecha.setText("");
			txtLink.setText("");
			textAreaBiografia.setText("");
			textAreaDescripcion.setText("");
	       
	 }
	 private boolean camposVaciosArtista() {
		 if( txtNickname.getText().isEmpty() ||
			 txtNombre.getText().isEmpty() ||
			 txtApellido.getText().isEmpty()|| 
			 txtEmail.getText().isEmpty() ||
			 txtFecha.getText().isEmpty()||
			 txtLink.getText().isEmpty() ||
			 textAreaBiografia.getText().isEmpty() ||
			 textAreaDescripcion.getText().isEmpty()) {
			 	return true;
			}
		 return false;
	 }
	 
	 private boolean camposVaciosEspectador() {
		 if( txtNickname.getText().isEmpty() ||
			 txtNombre.getText().isEmpty() ||
			 txtApellido.getText().isEmpty()|| 
			 txtEmail.getText().isEmpty() ||
			 txtFecha.getText().isEmpty() ) {
			 	return true;
			}
		 return false;
	 }
	 
	 private static Date ParseFecha(String fecha){
	      // FUNCION AUXILIAR PARA CONVERTIR STRING FECHA A DATE FECHA
			 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(fecha);
	        } 
	        catch (ParseException ex) 
	        {
	            System.out.println(ex);
	        }
	        return fechaDate;
	  }

}// FIN CLASE
