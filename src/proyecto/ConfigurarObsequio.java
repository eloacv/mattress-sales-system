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

public class ConfigurarObsequio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantMinima;
	private JTextField txtObsequio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequio dialog = new ConfigurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequio() {
		setModal(true);
		setResizable(false);
		setTitle("Configurar obsequio");
		setBounds(100, 100, 536, 129);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadMnimaDe = new JLabel("Cantidad m\u00EDnima de colchones adquiridos:");
			lblCantidadMnimaDe.setBounds(10, 11, 225, 14);
			contentPanel.add(lblCantidadMnimaDe);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio:");
			lblObsequio.setBounds(10, 36, 65, 14);
			contentPanel.add(lblObsequio);
		}
		{
			txtCantMinima = new JTextField();
			txtCantMinima.setBounds(231, 8, 102, 20);
			contentPanel.add(txtCantMinima);
			txtCantMinima.setColumns(10);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setBounds(231, 33, 102, 20);
			contentPanel.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		
		{
			txtCantMinima.setText("" + Tienda.cantidadMinimaObsequiable);
			txtObsequio.setText("" + Tienda.obsequio);
		}
		
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MinimoObsequio();
					Obsequio();
					Resultados();
					dispose();
					
				}
			});
			btnAceptar.setBounds(402, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancelar.setBounds(402, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}
	
	void MinimoObsequio(){
		Tienda.cantidadMinimaObsequiable = Integer.parseInt(txtCantMinima.getText());
	}
	
	void Obsequio(){
		Tienda.obsequio = txtObsequio.getText();
	}
	
	void Resultados(){
		txtCantMinima.setText(Tienda.cantidadMinimaObsequiable + "\n");
		txtObsequio.setText(Tienda.obsequio + "\n");
	}

}
