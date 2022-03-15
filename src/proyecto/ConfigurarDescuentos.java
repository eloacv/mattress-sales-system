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

public class ConfigurarDescuentos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtDesc1;
	private JTextField txtDesc2;
	private JTextField txtDesc3;
	private JTextField txtDesc4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuentos dialog = new ConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuentos() {
		setResizable(false);
		setModal(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 155);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblA = new JLabel("1 a 5 unidades");
			lblA.setBounds(10, 11, 82, 14);
			contentPanel.add(lblA);
		}
		{
			JLabel lblA_1 = new JLabel("6 a 10 unidades");
			lblA_1.setBounds(10, 36, 92, 14);
			contentPanel.add(lblA_1);
		}
		{
			JLabel lblA_2 = new JLabel("11 a 15 unidades");
			lblA_2.setBounds(10, 61, 92, 14);
			contentPanel.add(lblA_2);
		}
		{
			JLabel lblMsDe = new JLabel("M\u00E1s de 15 unidades");
			lblMsDe.setBounds(10, 86, 110, 14);
			contentPanel.add(lblMsDe);
		}
		{
			txtDesc1 = new JTextField();
			txtDesc1.setBounds(130, 8, 110, 20);
			contentPanel.add(txtDesc1);
			txtDesc1.setColumns(10);
		}
		{
			txtDesc2 = new JTextField();
			txtDesc2.setBounds(130, 33, 110, 20);
			contentPanel.add(txtDesc2);
			txtDesc2.setColumns(10);
		}
		{
			txtDesc3 = new JTextField();
			txtDesc3.setBounds(130, 58, 110, 20);
			contentPanel.add(txtDesc3);
			txtDesc3.setColumns(10);
		}
		{
			txtDesc4 = new JTextField();
			txtDesc4.setBounds(130, 83, 110, 20);
			contentPanel.add(txtDesc4);
			txtDesc4.setColumns(10);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(250, 11, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(250, 36, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(250, 61, 46, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(250, 86, 46, 14);
			contentPanel.add(label);
		}
		
		{
			txtDesc1.setText("" + Tienda.porcentaje1);
			txtDesc2.setText("" + Tienda.porcentaje2);
			txtDesc3.setText("" + Tienda.porcentaje3);
			txtDesc4.setText("" + Tienda.porcentaje4);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					unidad1_5();
					unidad6_10();
					unidad11_15();
					unidad15_mas();
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
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnCancelar.setBounds(335, 36, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}
	
	void unidad1_5(){
		Tienda.porcentaje1 = Double.parseDouble(txtDesc1.getText());
	}
	
	void unidad6_10(){
		Tienda.porcentaje2 = Double.parseDouble(txtDesc2.getText());
	}
	
	void unidad11_15(){
		Tienda.porcentaje3 = Double.parseDouble(txtDesc3.getText());
	}
	
	void unidad15_mas(){
		Tienda.porcentaje4 = Double.parseDouble(txtDesc4.getText());
	}
	
	void Resultados(){
		txtDesc1.setText(Tienda.porcentaje1 + "\n");
		txtDesc2.setText(Tienda.porcentaje2 + "\n");
		txtDesc3.setText(Tienda.porcentaje3 + "\n");
		txtDesc4.setText(Tienda.porcentaje4 + "\n");
	}

}
