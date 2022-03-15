package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarPremioSorpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumCliente;
	private JTextField txtPreSorpresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarPremioSorpresa dialog = new ConfigurarPremioSorpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremioSorpresa() {
		setModal(true);
		setResizable(false);
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 114);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente:");
			lblNmeroDeCliente.setBounds(10, 11, 99, 14);
			contentPanel.add(lblNmeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio sorpresa:");
			lblPremioSorpresa.setBounds(10, 36, 99, 14);
			contentPanel.add(lblPremioSorpresa);
		}
		{
			txtNumCliente = new JTextField();
			txtNumCliente.setBounds(119, 8, 111, 20);
			contentPanel.add(txtNumCliente);
			txtNumCliente.setColumns(10);
		}
		{
			txtPreSorpresa = new JTextField();
			txtPreSorpresa.setBounds(119, 33, 111, 20);
			contentPanel.add(txtPreSorpresa);
			txtPreSorpresa.setColumns(10);
		}
		
		{
			txtNumCliente.setText("" + Tienda.numeroClienteSorpresa);		
			txtPreSorpresa.setText("" + Tienda.premioSorpresa);
		}
		
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NumeroCliente();
					PremioSorpresa();
					Resultados();
					dispose();
				}
			});
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancelar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}
	
	void NumeroCliente(){
		Tienda.numeroClienteSorpresa = Integer.parseInt(txtNumCliente.getText());
	}
	
	void PremioSorpresa(){
		Tienda.premioSorpresa = txtPreSorpresa.getText();
	}
	
	void Resultados(){
		txtNumCliente.setText(Tienda.numeroClienteSorpresa + "\n");
		txtPreSorpresa.setText(Tienda.premioSorpresa + "\n");
	}

}
