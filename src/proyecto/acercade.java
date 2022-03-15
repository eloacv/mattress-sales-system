package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class acercade extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JTextPane txtpnSdfds = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			acercade dialog = new acercade();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public acercade() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Arial", Font.PLAIN, 18));
			lblTienda.setBounds(172, 11, 90, 14);
			contentPanel.add(lblTienda);
		}
		{
			JLabel lblAutores = new JLabel("Autores");
			lblAutores.setBounds(193, 60, 48, 14);
			contentPanel.add(lblAutores);
		}
		txtpnSdfds.setEditable(false);
		txtpnSdfds.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnSdfds.setBackground(UIManager.getColor("Button.background"));
		txtpnSdfds.setText("Elo\u00E1 Cruz Visalaya\r\nHern\u00E1n Cardenas Bre\u00F1a\r\nWilmer Cerr\u00F3n Porta\r\nJorge Eguiluz Roca\r\nFavio Rivadeneyra Ormea");
		txtpnSdfds.setBounds(138, 85, 158, 111);
		
		contentPanel.add(txtpnSdfds);
		{
			JButton cancelButton = new JButton("Cerrar");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setBounds(178, 214, 77, 23);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 36, 434, 2);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		}
	}
}
