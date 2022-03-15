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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarColchón extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTamaño;
	private JTextField txtMaterial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarColchón dialog = new ConsultarColchón();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarColchón() {
		setModal(true);
		setResizable(false);
		setTitle("Consultar Colch\u00F3n");
		setBounds(100, 100, 450, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 11, 46, 14);
		contentPanel.add(lblMarca);
		
		JLabel lblPrecios = new JLabel("Precio (S/.):");
		lblPrecios.setBounds(10, 36, 73, 14);
		contentPanel.add(lblPrecios);
		
		JLabel lblNewLabel = new JLabel("Garant\u00EDa (a\u00F1os):");
		lblNewLabel.setBounds(10, 61, 86, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblTamao = new JLabel("Tama\u00F1o:");
		lblTamao.setBounds(10, 86, 61, 14);
		contentPanel.add(lblTamao);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(10, 111, 46, 14);
		contentPanel.add(lblMaterial);
		
		JComboBox cboMarca = new JComboBox();
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Evento del comboBox
				int tipo, garantia;
				double precio;
				String tamaño, material;
				
				tipo = DetMarca();
				precio = DetPrecio(tipo);
				garantia = DetGarantia(tipo);
				tamaño = DetTamaño(tipo);
				material = DetMaterial(tipo);
				Resultados(precio, garantia, tamaño, material);
			}
			
			int DetMarca(){
				return cboMarca.getSelectedIndex();
			}
			
			double DetPrecio(int tipo){
				switch(tipo){
				case 0:
					return Tienda.precio0;
				case 1:
					return Tienda.precio1;
				case 2:
					return Tienda.precio2;
				case 3:
					return Tienda.precio3;
				default:
					return Tienda.precio4;
				}
			}
			
			int DetGarantia(int tipo){
				switch(tipo){
				case 0:
					return Tienda.garantia0;
				case 1:
					return Tienda.garantia1;
				case 2:
					return Tienda.garantia2;
				case 3:
					return Tienda.garantia3;
				default:
					return Tienda.garantia4;
				}
			}
			
			String DetTamaño(int tipo){
				switch(tipo){
				case 0:
					return Tienda.tamaño0;
				case 1:
					return Tienda.tamaño1;
				case 2:
					return Tienda.tamaño2;
				case 3:
					return Tienda.tamaño3;
				default:
					return Tienda.tamaño4;
				}
			}
			
			String DetMaterial(int tipo){
				switch(tipo){
				case 0:
					return Tienda.material0;
				case 1:
					return Tienda.material1;
				case 2:
					return Tienda.material2;
				case 3:
					return Tienda.material3;
				default:
					return Tienda.material4;
				}
			}
			
			void Resultados(double precio, int garantia, String tamaño, String material){
				txtPrecio.setText(precio + "\n");
				txtGarantia.setText(garantia + "\n");
				txtTamaño.setText(tamaño + "\n");
				txtMaterial.setText(material + "\n");
			}
		});
		cboMarca.setBounds(108, 8, 166, 20);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(108, 33, 166, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setEditable(false);
		txtGarantia.setBounds(106, 58, 168, 20);
		contentPanel.add(txtGarantia);
		txtGarantia.setColumns(10);
		
		txtTamaño = new JTextField();
		txtTamaño.setEditable(false);
		txtTamaño.setBounds(108, 83, 166, 20);
		contentPanel.add(txtTamaño);
		txtTamaño.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setEditable(false);
		txtMaterial.setBounds(108, 108, 166, 20);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(345, 11, 89, 23);
		contentPanel.add(btnCerrar);
		
		//Para mostrarse los datos de orden 0 al abrir la ventana
		cboMarca.setToolTipText(Tienda.marca0);
		txtPrecio.setText(" " + Tienda.precio0);
		txtGarantia.setText(" " + Tienda.garantia0);
		txtTamaño.setText(" " + Tienda.tamaño0);
		txtMaterial.setText(" " + Tienda.material0);
	}
}
