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

public class ConfigurarCantidadOptimaDeColchones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantOptima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarCantidadOptimaDeColchones dialog = new ConfigurarCantidadOptimaDeColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarCantidadOptimaDeColchones() {
		setModal(true);
		setResizable(false);
		setTitle("Configurar cantidad \u00F3ptima de colchones vendidos");
		setBounds(100, 100, 450, 111);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de colchones vendidos:");
			lblCantidadptimaDe.setBounds(10, 11, 209, 14);
			contentPanel.add(lblCantidadptimaDe);
		}
		{
			txtCantOptima = new JTextField();
			txtCantOptima.setBounds(229, 8, 69, 20);
			contentPanel.add(txtCantOptima);
			txtCantOptima.setColumns(10);
		}
		
		{
			txtCantOptima.setText("" + Tienda.cantidadOptima);	
		}
		
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CantidadOptima();
					Resultados();
					dispose();
				}
			});
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnNewButton = new JButton("Cancelar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(335, 30, 89, 23);
			contentPanel.add(btnNewButton);
		}
	}
	
	void CantidadOptima(){
		Tienda.cantidadOptima = Integer.parseInt(txtCantOptima.getText());
	}
	
	void Resultados(){
		txtCantOptima.setText(Tienda.cantidadOptima + "\n");
	}

}
