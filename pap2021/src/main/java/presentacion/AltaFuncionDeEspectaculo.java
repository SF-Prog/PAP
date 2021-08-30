package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import interfaces.IControladorAltaDeFuncionDeEspectaculo;

public class AltaFuncionDeEspectaculo extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private IControladorAltaDeFuncionDeEspectaculo icon;

	public AltaFuncionDeEspectaculo(IControladorAltaDeFuncionDeEspectaculo icon) {
		this.icon = icon;
		setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setClosable(true);
        setTitle("Alta de Función de Espectáculo");
		setBounds(100, 100, 450, 455);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese los siguientes datos");
		lblTitulo.setBounds(152, 11, 235, 14);
		getContentPane().add(lblTitulo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaFuncionDeEspectaculoAceptarActionPerformed(e);		
			}
		});
		btnAceptar.setBounds(247, 327, 117, 25);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaFuncionDeEspectaculoCancelarActionPerformed(e);
			}
		});
		btnCancelar.setBounds(75, 327, 117, 25);
		getContentPane().add(btnCancelar);
	}
	
	protected void altaFuncionDeEspectaculoAceptarActionPerformed(ActionEvent arg0) {
        if (checkFormulario()) {
            limpiarFormulario();
            setVisible(false);
        }	
	} 
	
	protected void altaFuncionDeEspectaculoCancelarActionPerformed(ActionEvent arg0) {
		limpiarFormulario();
        setVisible(false);
	}
	
	private boolean checkFormulario() {
        return true;
    }
	
	private void limpiarFormulario() {
	}
}
