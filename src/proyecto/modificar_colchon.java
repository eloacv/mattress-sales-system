package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modificar_colchon extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtprecio;
	private JTextField txtgarantia;
	private JTextField txttamaño;
	private JTextField txtmaterial;
//	private JComboBox cbomodifmarca;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modificar_colchon dialog = new modificar_colchon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificar_colchon() {
		
		JComboBox cbomodifmarca = new JComboBox();
		setBounds(100, 100, 450, 197);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Marca");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 41, 64, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Garant\u00EDa (a\u00F1os)");
			lblNewLabel_2.setBounds(10, 71, 92, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Tama\u00F1o");
			lblNewLabel_3.setBounds(10, 100, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Material");
			lblNewLabel_4.setBounds(10, 129, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			txtprecio = new JTextField();
			txtprecio.setBounds(103, 38, 122, 20);
			contentPanel.add(txtprecio);
			txtprecio.setColumns(10);
		}
		{
			txtgarantia = new JTextField();
			txtgarantia.setBounds(103, 68, 122, 20);
			contentPanel.add(txtgarantia);
			txtgarantia.setColumns(10);
		}
		{
			txttamaño = new JTextField();
			txttamaño.setBounds(103, 97, 122, 20);
			contentPanel.add(txttamaño);
			txttamaño.setColumns(10);
		}
		{
			txtmaterial = new JTextField();
			txtmaterial.setBounds(103, 126, 122, 20);
			contentPanel.add(txtmaterial);
			txtmaterial.setColumns(10);
		}
		{
			JButton btncerrar = new JButton("Cerrar");
			btncerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btncerrar.setBounds(335, 7, 89, 23);
			contentPanel.add(btncerrar);
		}
		{
			JButton btngrabar = new JButton("Grabar");
			btngrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int modifmarcagrabar=cbomodifmarca.getSelectedIndex();
					switch(modifmarcagrabar){
					case 0:
					Tienda.precio0=Double.parseDouble(txtprecio.getText());
					Tienda.garantia0=Integer.parseInt(txtgarantia.getText());
					Tienda.tamaño0=txttamaño.getText();
					Tienda.material0=txtmaterial.getText();
					break;
					case 1:
					Tienda.precio1=Double.parseDouble(txtprecio.getText());
					Tienda.garantia1=Integer.parseInt(txtgarantia.getText());
					Tienda.tamaño1=txttamaño.getText();
					Tienda.material1=txtmaterial.getText();
					break;
					case 2:
					Tienda.precio2=Double.parseDouble(txtprecio.getText());
					Tienda.garantia2=Integer.parseInt(txtgarantia.getText());
					Tienda.tamaño2=txttamaño.getText();
					Tienda.material2=txtmaterial.getText();
					break;
					case 3:
					Tienda.precio3=Double.parseDouble(txtprecio.getText());
					Tienda.garantia3=Integer.parseInt(txtgarantia.getText());
					Tienda.tamaño3=txttamaño.getText();
					Tienda.material3=txtmaterial.getText();
					break;
					case 4:
					Tienda.precio4=Double.parseDouble(txtprecio.getText());
					Tienda.garantia4=Integer.parseInt(txtgarantia.getText());
					Tienda.tamaño4=txttamaño.getText();
					Tienda.material4=txtmaterial.getText();
					break;
					}
				}
			});
			btngrabar.setBounds(335, 37, 89, 23);
			contentPanel.add(btngrabar);
		}
		{
			
			cbomodifmarca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int modifmarca=cbomodifmarca.getSelectedIndex();					
					if (modifmarca==0){
						cbomodifmarca.setSelectedIndex(0);
						txtprecio.setText(""+Tienda.precio0);
						txtgarantia.setText(""+Tienda.garantia0);
						txttamaño.setText(""+Tienda.tamaño0);
						txtmaterial.setText(""+Tienda.material0);
					}else if (modifmarca==1){
						cbomodifmarca.setSelectedIndex(1);
						txtprecio.setText(""+Tienda.precio1);
						txtgarantia.setText(""+Tienda.garantia1);
						txttamaño.setText(""+Tienda.tamaño1);
						txtmaterial.setText(""+Tienda.material1);
					}else if (modifmarca==2){
						cbomodifmarca.setSelectedIndex(2);
						txtprecio.setText(""+Tienda.precio2);
						txtgarantia.setText(""+Tienda.garantia2);
						txttamaño.setText(""+Tienda.tamaño2);
						txtmaterial.setText(""+Tienda.material2);
					}else if (modifmarca==3){
						cbomodifmarca.setSelectedIndex(3);
						txtprecio.setText(""+Tienda.precio3);
						txtgarantia.setText(""+Tienda.garantia3);
						txttamaño.setText(""+Tienda.tamaño3);
						txtmaterial.setText(""+Tienda.material3);
					}else if (modifmarca==4){
						cbomodifmarca.setSelectedIndex(4);
						txtprecio.setText(""+Tienda.precio4);
						txtgarantia.setText(""+Tienda.garantia4);
						txttamaño.setText(""+Tienda.tamaño4);
						txtmaterial.setText(""+Tienda.material4);
					}
				}
			});
			cbomodifmarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
			cbomodifmarca.setSelectedIndex(0);
			cbomodifmarca.setBounds(102, 8, 123, 20);
			contentPanel.add(cbomodifmarca);
		}
		cbomodifmarca.setSelectedIndex(0);
		txtprecio.setText(""+Tienda.precio0);
		txtgarantia.setText(""+Tienda.garantia0);
		txttamaño.setText(""+Tienda.tamaño0);
		txtmaterial.setText(""+Tienda.material0);

	}

}

